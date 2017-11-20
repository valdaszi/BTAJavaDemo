package lt.baltictalents.p08.demo1;

public class Ellipse extends Figure {

    double r1;

    double r2;

    public Ellipse(String color, double r1, double r2) {
        super(color);
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public double getArea() {
        return Math.PI * r1 * r2;
    }

    public double getR1() {
        return r1;
    }

    public double getR2() {
        return r2;
    }
}
