package lt.baltictalents.p08.demo1;

public abstract class Figure {

    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public double getArea(double n) {
        return getArea() * n;
    }

    public String getColor() {
        return color;
    }

}
