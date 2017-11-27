package lt.baltictalents.p12.demo4;

public class Main {

    public static void main(String[] args) {

        A a = new A() {

            int i = 1;

            @Override
            public long pow2() {
                i *= 2;
                return i;
            }
        };

        System.out.println(a.pow2());
        System.out.println(a.pow2());
        System.out.println(a.pow2());

    }
}
