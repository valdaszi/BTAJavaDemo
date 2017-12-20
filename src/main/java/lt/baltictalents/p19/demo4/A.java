package lt.baltictalents.p19.demo4;

public class A implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("A closed");
    }

    public void work() {
        System.out.println("A working...");
    }
}
