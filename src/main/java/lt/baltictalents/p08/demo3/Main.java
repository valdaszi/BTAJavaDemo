package lt.baltictalents.p08.demo3;

import lt.baltictalents.p08.demo1.Circle;
import lt.baltictalents.p08.demo1.Ellipse;
import lt.baltictalents.p08.demo1.Figure;

public class Main {

    public static boolean isSameArea(Figure f1, Figure f2) {
        return f1.getArea() == f2.getArea();
    }

    public static void main(String[] args) {

        //Circle figure1 = new Circle("green", 14);       // 14 * 14 = 2*7 * 2*7
        //Ellipse figure2 = new Ellipse("green", 4, 49);

        System.out.println(isSameArea(
                new Ellipse("green", 4, 49),
                new Circle("green", 14)
        ) ? "lygu" : "nelygu");

    }

}
