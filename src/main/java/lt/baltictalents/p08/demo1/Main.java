package lt.baltictalents.p08.demo1;

public class Main {

    public static void main(String[] args) {

        Figure[] figuros = new Figure[] {
                new Circle("green", 10),
                new Ellipse("red", 11, 9)
        };

        for (Figure f : figuros) {
            System.out.println("Area: " + f.getArea() +
                    ", double area: " + f.getArea(2));
        }
    }
}
