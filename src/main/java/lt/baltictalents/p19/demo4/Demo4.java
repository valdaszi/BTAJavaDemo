package lt.baltictalents.p19.demo4;

public class Demo4 {

    public static void main(String... args) {
        new Demo4().start();

        new Demo4().start2();
    }

    void start2() {
        try (Worker a = new Worker("A")) {
            a.work();
        }
    }

    void start() {
        try (
            Worker a = new Worker("A");
            Worker b = new Worker("B");
        ) {
            a.work();
            a.work();
            a.work();
        } catch (Exception e) {
            System.out.println("Pagavau :)");
        } finally {
            System.out.println("Finally");
        }

        System.out.println("Finish");

    }
}

class Worker implements AutoCloseable {

    String name;

    public Worker(String name) {
        this.name = name;
        System.out.println(name + " created");
    }

    @Override
    public void close() {
        System.out.println(name + " closed");
    }

    public void work() {
        System.out.println(name + " working...");
        throw new RuntimeException("Klaida!!!");
    }
}