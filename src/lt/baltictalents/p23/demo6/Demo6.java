package lt.baltictalents.p23.demo6;

public class Demo6 {

    public static void main(String... args) throws InterruptedException {

        Counter c = new Counter();

        System.out.println("Counter Before: " + c.value());

        A a = new A(c);
        Thread t = new Thread(a);
        t.start();

        B b = new B(c);
        b.start();

        System.out.println("Counter: " + c.value());

        Thread.sleep(1000);
        c.run();

        System.out.println("Counter: " + c.value());

        Thread.sleep(1000);
        c.run();

        System.out.println("Counter: " + c.value());

    }

    static class A implements Runnable {

        private Counter c;

        public A(Counter c) {
            this.c = c;
        }

        @Override
        public void run() {
            this.c.increment();
        }
    }

    static class B extends Thread {

        private Counter c;

        public B(Counter c) {
            this.c = c;
        }

        @Override
        public void run() {
            this.c.decrement();
        }

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
        }

        public synchronized void decrement() {
            c--;
            try {
                System.out.println("dec waiting start");
                wait();
                System.out.println("dec waiting end");
            } catch (InterruptedException ignored) {}
        }

        public synchronized long value() {
            return c;
        }

        public synchronized void run() {
            notify();
        }

    }

}
