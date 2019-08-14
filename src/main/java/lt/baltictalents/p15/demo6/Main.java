package lt.baltictalents.p15.demo6;

public class Main {

    @FunctionalInterface
    interface Calculate<N> {

        N calc(N n1, N n2);

    }

    static class A {

        void calculate() {
            // grazinti didesni skaiciu, t.y. rasti max
//            Calculate<Double> c = (a, b) -> {
//                //if (a > b) return a;
//                //return b;
//                return a > b ? a : b;
//            };

//            Calculate<Double> c = (a, b) -> a > b ? a : b;

//            Calculate<Double> c = (a, b) -> Math.max(a, b);
            Calculate<Double> c = Math::max;

            Double result = c.calc(2.9, 3.0);
            System.out.println("result = " + result);
        }

    }

    public static void main(String[] args) {

        new A().calculate();
    }

}
