package lt.baltictalents.p23.demo2;

/**
 * interrupt - pažadina thredą jei jis miegojo (sleep) ir/arba kažko laukė (wait)
 */
public class Demo2 {

    static int sleepTimeA = 500;
    static int sleepTimeB = 1000;

    public static void main(String... args) throws InterruptedException {

        A a = new A();
        Thread t = new Thread(a);
        t.start();

        B b = new B();
        b.start();

        System.out.println("A ir B startavo");

        Thread.sleep(1000);
        b.interrupt();
        t.interrupt();

        System.out.println("Pabaiga");
    }

    static class A implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("A: " + i);
                try {
                    Thread.sleep(sleepTimeA);
                } catch (InterruptedException e) {
                    System.out.println("A: Nutraukta");
                    sleepTimeB = 100;
                    return;
                }
            }
        }
    }

    static class B extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("B: " + i);
                try {
                    Thread.sleep(sleepTimeB);
                } catch (InterruptedException e) {
                    System.out.println("B: Nutraukta");
                    //return;
                }
            }
        }
    }
}
