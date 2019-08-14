package lt.baltictalents.p23.demo4;

/**
 * join - laukia kol threadas, kurio join metodas kviečiamas, baigsis
 */
public class Demo4 {

    public static void main(String... args) {

        B b = new B();

        Thread a = new Thread(() -> {

            try {
                b.join(600);
                b.interrupt();
            } catch (InterruptedException ignored) {
            }

            for (int i = 0; i < 10; i++) {
                System.out.println("A: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("A: Nutraukta");
                    return;
                }
            }

        });

        b.setA(a);
        b.start();

        a.start();
    }


    static class B extends Thread {

        Thread a;

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("B: " + i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    System.out.println("B: Nutraukta cikle");
                    if (a != null) a.interrupt();
                    return;
                }
            }
        }

        public Thread getA() {
            return a;
        }

        public void setA(Thread a) {
            this.a = a;
        }
    }
}