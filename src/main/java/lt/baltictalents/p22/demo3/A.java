package lt.baltictalents.p22.demo3;

import java.io.Serializable;

public class A implements Serializable {

    private static final long serialVersionUID = 8481076133578922262L;

    private String a;

    private B b1;

    private B b2;

    long l = 10L;

    public A(String a, B b1, B b2) {
        this.a = a;
        this.b1 = b1;
        this.b2 = b2;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public B getB1() {
        return b1;
    }

    public void setB1(B b1) {
        this.b1 = b1;
    }

    public B getB2() {
        return b2;
    }

    public void setB2(B b2) {
        this.b2 = b2;
    }

    @Override
    public String toString() {
        return "A{" +
                "a='" + a + '\'' +
                ", b1=" + b1 +
                ", b2=" + b2 +
                '}';
    }
}
