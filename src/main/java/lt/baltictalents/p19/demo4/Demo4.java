package lt.baltictalents.p19.demo4;

public class Demo4 {

    public static void main(String... args) {

        try (A a = new A()) {
            a.work();
            a.work();
            a.work();
        } catch (Exception e) {
            System.out.println("Pagavau :)");
        }

        System.out.println("Finish");

    }
}

class A implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("A closed");
    }

    public void work() {
        System.out.println("A working...");
    }
}