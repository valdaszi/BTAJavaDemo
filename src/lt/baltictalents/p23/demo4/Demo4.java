package lt.baltictalents.p23.demo4;

public class Demo4 {

    public static void main(String... args) throws InterruptedException {

        B b = new B();
        b.start();


        new Thread(() -> {

            try {
                b.join(600);
                b.interrupt();
            } catch (InterruptedException ignored) {}

            for (int i = 0; i < 10; i++) {
                System.out.println("A: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("A: Nutraukta");
                    return;
                }
            }

        }).start();
    }

    static class B extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("B: " + i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    System.out.println("B: Nutraukta cikle");
                    return;
                }
            }
        }
    }
}
