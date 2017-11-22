package lt.baltictalents.p10.demo6;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        BigDecimal a = new BigDecimal(1.23);
        BigDecimal b = new BigDecimal("1.23");

        System.out.println("1.23 = " + a);
        System.out.println("1.23 = " + b);

    }
}
