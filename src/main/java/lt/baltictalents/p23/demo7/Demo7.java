package lt.baltictalents.p23.demo7;

/**
 * notify - Wakes up a single (!! random !!) thread that is waiting on this object's monitor
 */
public class Demo7 {

    public static void main(String... args) throws InterruptedException {

        Counter c = new Counter();

        System.out.println("Counter Before: " + c.value());


        Thread t1 = new Thread(c::increment);
        t1.start();

        Thread t2 = new Thread(c::decrement);
        t2.start();


        System.out.println("Counter: " + c.value());

        Thread.sleep(1000);

        c.message();

        t1.join();
        t2.join();

        System.out.println("Counter: " + c.value());

    }


    static class Counter {

        private long c = 0;

        synchronized void increment() {
            c++;
            try {
                System.out.println("inc waiting - started");
                wait();
                System.out.println("inc waiting - ended");
            } catch (InterruptedException ignored) {
            }

            System.out.println("inc notify");
            notify();
        }

        synchronized void decrement() {
            c--;
            try {
                System.out.println("dec waiting - started");
                wait();
                System.out.println("dec waiting - ended");
            } catch (InterruptedException ignored) {
            }

            System.out.println("dec notify");
            notify();
        }

        synchronized long value() {
            return c;
        }

        synchronized void message() {
            System.out.println("message notify");
            notify();
        }
    }
}

