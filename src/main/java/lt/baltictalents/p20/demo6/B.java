package lt.baltictalents.p20.demo6;

import java.io.Serializable;

public class B implements Serializable {

    private String b;

    private int c;

    public B(String b, int c) {
        this.b = b;
        this.c = c;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "B{" +
                "b='" + b + '\'' +
                ", c=" + c +
                '}';
    }
}
