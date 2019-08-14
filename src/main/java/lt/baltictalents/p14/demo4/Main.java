package lt.baltictalents.p14.demo4;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        ListIntSum<Double> list = new ListIntSum<>();
        list.add(1.0);
        list.add(1.9);
        list.add(1.1);

        System.out.println("Suma = " + list.sum());
    }
}
