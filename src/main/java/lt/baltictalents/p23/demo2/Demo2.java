package lt.baltictalents.p23.demo2;

/**
 * interrupt - pažadina thredą jei jis miegojo (sleep) ir/arba kažko laukė (wait)
 */
public class Demo2 {

    public static void main(String... args) throws InterruptedException {

        A a = new A();
        Thread t = new Thread(a);
        t.start();

        B b = new B();
        b.start();

        Thread.sleep(1000);
        b.interrupt();

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
            for (int i = 0; i < 10; i++) {
                System.out.println("B: " + i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    System.out.println("B: Nutraukta");
                    return;
                }
            }
        }
    }
}
