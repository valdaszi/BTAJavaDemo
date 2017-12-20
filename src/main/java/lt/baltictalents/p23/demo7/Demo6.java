package lt.baltictalents.p23.demo7;

public class Demo6 {

    public static void main(String... args) throws InterruptedException {

        Counter c = new Counter();

        System.out.println("Counter Before: " + c.value());


        Thread t1 = new Thread(c::increment); t1.start();

        Thread t2 = new Thread(c::decrement); t2.start();


        System.out.println("Counter: " + c.value());

        Thread.sleep(1000);

        c.run();

        t1.join();
        t2.join();

        System.out.println("Counter: " + c.value());

    }

    static class Counter {

        private long c = 0;

        public synchronized void increment() {
            c++;
            try {
                System.out.println("inc waiting start");
                wait();
                System.out.println("inc waiting end");
            } catch (InterruptedException ignored) {}

            System.out.println("inc notify");
            notify();
        }

        public synchronized void decrement() {
            c--;
            try {
                System.out.println("dec waiting start");
                wait();
                System.out.println("dec waiting end");
            } catch (InterruptedException ignored) {}

            System.out.println("dec notify");
            notify();
        }

        public synchronized long value() {
            return c;
        }

        public synchronized void run() {
            notify();
        }

    }

}
