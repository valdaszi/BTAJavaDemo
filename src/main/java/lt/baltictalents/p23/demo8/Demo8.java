package lt.baltictalents.p23.demo8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * ExecutorService - kai naudoti ir kaip sustabdyti
 * https://www.baeldung.com/java-executor-service-tutorial
 * https://www.baeldung.com/java-executor-wait-for-threads
 */
public class Demo8 {

    private static final long LOOP = 10_000;

    public static void main(String[] args) {

        long start = System.nanoTime();

        ExecutorService executorService = Executors.newWorkStealingPool();

        Counter c = new Counter();

        executorService.execute(() -> LongStream.range(0, LOOP).forEach(i -> c.increment()));

        executorService.execute(() -> {
            for (long i = 0; i < LOOP; ++i) {
                c.decrement();
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    System.out.println("*** InterruptedException in decrement");
                    //break;
                }
            }
        });

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }

        // stabdome paprastai - bus interrupt nusiųstas visiems threadams
        // Tik ne bus laukiama(!!) kol visi baigsis, o vykdymas eis toliau
//        executorService.shutdownNow();


        // stabdome tvarkingiau - t.y. laukdami kažkiek laiko kol baigsis
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(20, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException ex) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
        }

        System.out.println("Time: " + (System.nanoTime() - start) / 1e6 + "ms");
        System.out.println("Counter: " + c.value());
    }
}


class Counter {

    private long c = 0;

    synchronized void increment() {
        c++;
    }

    synchronized void decrement() {
        c--;
    }

    long value() {
        return c;
    }
}