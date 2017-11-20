package lt.baltictalents.p08.demo1;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle("green", 10);
        System.out.println("Circle Area: " + circle.getArea());

        Ellipse ellipse = new Ellipse("red", 11, 9);
        System.out.println("Ellipse Area: " + ellipse.getArea());

    }
}
