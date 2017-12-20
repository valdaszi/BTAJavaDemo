package lt.baltictalents.p08.demo2;

import lt.baltictalents.p08.demo1.Circle;
import lt.baltictalents.p08.demo1.Ellipse;
import lt.baltictalents.p08.demo1.Figure;

public class Main {

    public static void main(String[] args) {

        Figure f1 = new Circle("white", 1);
        Figure f2 = new Ellipse("red", 1.1, 0.9);

        System.out.println("Area f1: " + f1.getArea());
        System.out.println("Area f2: " + f2.getArea());

        System.out.println("f1 color = " + f1.getColor());
        System.out.println("f1 radius = " + ((Circle)f1).getRadius());
        System.out.println("f2 radius = " + ((Circle)f2).getRadius());
    }
}
