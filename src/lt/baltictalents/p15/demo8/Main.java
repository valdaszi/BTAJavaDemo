package lt.baltictalents.p15.demo8;

public class Main {

    @FunctionalInterface
    interface Calculate<N> {

        N calc(N n1, N n2);

    }

    static class A {

        double n;

        A(Double n) {
            this.n = n;
        }

        Double calculate(Double d1, Double d2) {
            return (d1 + d2) / n;
        }

    }

    public static void main(String[] args) {

        A a = new A(2.0);

        Calculate<Double> c = a::calculate;

        Double result = c.calc(10.0, 11.0);
        System.out.println("result = " + result);
    }

}
