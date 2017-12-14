package lt.baltictalents.p23.demo5;

public class Demo5 {

    static final long LOOP = 1000000;

    public static void main(String... args) throws InterruptedException {

        Counter c = new Counter();

        A a = new A(c);
        Thread t = new Thread(a);
        t.start();

        B b = new B(c);
        b.start();

        t.join();
        b.join();

        System.out.println("Counter: " + c.value());
    }

    static class A implements Runnable {

        private Counter c;

        public A(Counter c) {
            this.c = c;
        }

        @Override
        public void run() {
            for (long i = 0; i < LOOP; i++) {
                this.c.increment();
            }
        }
    }

    static class B extends Thread {

        private Counter c;

        public B(Counter c) {
            this.c = c;
        }

        @Override
        public void run() {
            for (long i = 0; i < LOOP; i++) {
                this.c.decrement();
            }
        }

    }

    static class Counter {

        private long c = 0;

        public void increment() {
            c++;
        }

        public void decrement() {
            c--;
        }

        public long value() {
            return c;
        }

    }
}
