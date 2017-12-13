package lt.baltictalents.p22.demo2;

import java.io.Serializable;

public class B implements Serializable {

    private String b;

    private int c;

    private transient Thread thread;

    public B(String b, int c) {
        this.b = b;
        this.c = c;
        this.thread = new Thread();
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
