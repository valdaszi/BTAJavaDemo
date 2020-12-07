package lt.baltictalents.p23.demo9;

import java.util.concurrent.*;

public class Demo9 {

    private static final long LOOP = 2_000;

    public static void main(String[] args) {

        long start = System.nanoTime();

        ExecutorService executorService = Executors.newWorkStealingPool();

        Future<Long> r1 = executorService.submit(() -> {
            long count = 0;
            for (long i = 0; i < LOOP; ++i) {
                count++;
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    break;
                }
            }
            return count;
        });

        Future<Long> r2 = executorService.submit(() -> {
            long count = 0;
            for (long i = 0; i < LOOP; ++i) {
                count--;
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    break;
                }
            }
            return count;
        });


        Long result1 = null;
        Long result2 = null;
        try {
            result1 = r1.get();
            result2 = r2.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("Time: " + (System.nanoTime() - start) / 1e6 + "ms");
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);

    }
}
