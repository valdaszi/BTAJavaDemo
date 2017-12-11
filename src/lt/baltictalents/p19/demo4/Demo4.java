package lt.baltictalents.p19.demo4;

public class Demo4 {

    public static void main(String... args) {

        try (A a = new A()) {
            a.work();
            a.work();
            a.work();
        }

    }
}
