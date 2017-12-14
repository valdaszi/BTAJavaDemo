package lt.baltictalents.p23.demo1;

public class Demo1 {

    public static void main(String... args) {

        System.out.println(Thread.currentThread().getName());

        A a = new A();
        Thread t = new Thread(a);
        t.start();

        B b = new B();
        b.start();

        (new Thread(() -> {
            loop("C", 10, 100);
        })).start();

    }

    static void loop(String name, int count, int sleep) {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < count; i++) {
            System.out.println(name + ": " + i);
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
            loop("A", 10, 500);
        }
    }

    static class B extends Thread {

        @Override
        public void run() {
            loop("B", 10, 200);
        }

    }
}
