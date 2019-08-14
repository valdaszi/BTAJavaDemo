package lt.baltictalents.p15.demo9;

public class Main {

    @FunctionalInterface
    interface Method {
        void method();
    }

    static class A {

        static public void methodA() {
            System.out.println("Class A");
        }

    }

    static class B {

        public void methodB() {
            System.out.println("Class B");
        }

    }

    public static void main(String[] args) {

        A a = new A();
        B b = new B();

        check(A::methodA);
        check(b::methodB);

    }

    static void check(Method m) {
        m.method();
    }
}
