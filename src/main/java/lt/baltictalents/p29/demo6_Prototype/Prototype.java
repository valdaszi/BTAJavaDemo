package lt.baltictalents.p29.demo6_Prototype;

public abstract class Prototype implements Cloneable {

    private int a = 0;

    public Prototype(int a) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException{
        return (Prototype) super.clone();
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "a=" + a +
                '}';
    }
}
