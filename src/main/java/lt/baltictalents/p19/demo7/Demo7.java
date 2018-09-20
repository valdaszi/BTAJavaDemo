package lt.baltictalents.p19.demo7;

public class Demo7 {

    public static void main(String... args) {

        A a = new A();
        for (int i = 0; i < 5; i++) {
            try {
                a.start(i);
            } catch (KlaidaA e) {
                //e.printStackTrace();
                System.out.println("Klaida " + e.getMessage());
            }
        }

    }
}

class A {

    void work(int i) {
        if (i % 2 == 0) {
            throw new KlaidaA("Lyginis " + i);
        }
    }

    void start(int i) {
        work(i);
    }
}

class KlaidaA extends RuntimeException {

    KlaidaA(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "KlaidaA " + getMessage();
    }
}
