package lt.baltictalents.p14.demo2;

public class Main {

    public static void main(String[] args) {

        double earthWeight = 100; // 100kg

        double mass = earthWeight/Planet.EARTH.surfaceGravity();

        for (Planet p : Planet.values()) {
            if (p != Planet.EARTH) {
                System.out.println("Your weight on " + p +
                        "(" + p.ordinal() + ")" + " is " + p.surfaceWeight(mass) + "kg");
            }
        }

        System.out.println("SUN: " + Planet.SUN.ordinal());
        System.out.println("MERCURY: " + Planet.MERCURY.ordinal());
    }
}
