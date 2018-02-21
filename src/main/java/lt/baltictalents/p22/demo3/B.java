package lt.baltictalents.p22.demo3;

import java.io.IOException;
import java.io.Serializable;

public class B implements Serializable {

    private static final long serialVersionUID = 1L;

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

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.writeUTF(b);
        out.writeInt(c + 1);
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        b = in.readUTF();
        c = in.readInt();
    }


}
