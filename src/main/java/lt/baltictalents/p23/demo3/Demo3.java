package lt.baltictalents.p23.demo3;

public class Demo3 {

    public static void main(String... args) throws InterruptedException {

        A a = new A();
        Thread t = new Thread(a);
        t.setDaemon(true);
        t.start();

        B b = new B();
        b.start();

        Thread.sleep(10);
        b.interrupt();

        System.out.println("Pabaiga");
    }

    static class A implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("A: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("A: Nutraukta");
                    return;
                }
            }
        }
    }

    static class B extends Thread {

        @Override
        public void run() {
            for (int i = 0; i <= 10000000; i++) {

                Double b = Math.sqrt(Math.random());
                if (i % 1000 == 0) {
                    System.out.println("B: " + i);
                }

                //if (Thread.currentThread().isInterrupted()) {
                if (Thread.interrupted()) {
                    System.out.println("B: Nutraukta");
                    return;
                }
            }
        }

    }
}
