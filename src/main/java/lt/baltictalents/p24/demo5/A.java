package lt.baltictalents.p24.demo5;

public class A {

    private double i1;

    private double i2;

    private double avg;

    public A(double i1, double i2) {
        this.i1 = i1;
        this.i2 = i2;
        this.avg = (i1 + i2) / 2;
    }

    public double getI1() {
        return i1;
    }

    public double getI2() {
        return i2;
    }

    public double getAvg() {
        return avg;
    }
}
