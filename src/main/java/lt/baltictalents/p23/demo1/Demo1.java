package lt.baltictalents.p23.demo1;

public class Demo1 {

    public static void main(String... args) {

        System.out.println(Thread.currentThread().getName());

        // Thread A
        A a = new A();
        Thread t = new Thread(a, "Thread A");
        t.start();

        // Thread B
        B b = new B();
        b.start();

        // Thread C
        new Thread(() -> loop("C", 100)).start();

    }

    static void loop(String name, int sleep) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + name + ": " + i);
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class A implements Runnable {

        @Override
        public void run() {
            loop("A", 500);
        }
    }

    static class B extends Thread {

        @Override
        public void run() {
            loop("B", 200);
        }

    }
}
