package lt.baltictalents.p23.demo5;

public class Demo5 {

    static final long LOOP = 1000000; //100;

    public static void main(String... args) throws InterruptedException {

        Long start = System.nanoTime();

        Counter c1 = new Counter();
        Counter c2 = new Counter();

        A a = new A(c1, c2);
        Thread t = new Thread(a);
        t.start();

        B b = new B(c1, c2);
        b.start();

        t.join();
        b.join();

        System.out.println("Time: " + (System.nanoTime() - start) / 1e6 + "ms");
        System.out.println("Counter1: " + c1.value());
        System.out.println("Counter2: " + c2.value());
    }

    static class A implements Runnable {

        private Counter c1, c2;

        public A(Counter c1, Counter c2) {
            this.c1 = c1;
            this.c2 = c2;
        }

        @Override
        public void run() {
            for (long i = 0; i < LOOP; i++) {
                this.c1.increment();
                this.c2.increment();
            }
        }
    }

    static class B extends Thread {

        private Counter c1, c2;

        public B(Counter c1, Counter c2) {
            this.c1 = c1;
            this.c2 = c2;
        }

        @Override
        public void run() {
            for (long i = 0; i < LOOP; i++) {
                this.c1.decrement();
                this.c2.decrement();
            }
        }

    }

    static class Counter {

        private long c = 0;

        public void increment() {
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            c++;
        }

        public void decrement() {
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            c--;
        }

        public long value() {
            return c;
        }

    }
}
