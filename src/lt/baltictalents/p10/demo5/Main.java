package lt.baltictalents.p10.demo5;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {

        BigDecimal a = BigDecimal.valueOf(1234, 2);
        BigDecimal b = a.multiply(BigDecimal.valueOf(3.49));
        BigDecimal c = b.setScale(2, BigDecimal.ROUND_HALF_UP);

        System.out.println("1234 x 10-2 = " + a);
        System.out.println("12.34 x 3.49 = " + b);
        System.out.println("12.34 x 3.49 = " + c);

        BigDecimal d = new BigDecimal("2.1");
        BigDecimal e = d.divide(BigDecimal.valueOf(2),1, RoundingMode.HALF_UP);
        BigDecimal f = d.divide(BigDecimal.valueOf(2),1, RoundingMode.HALF_DOWN);
        BigDecimal g = d.divide(BigDecimal.valueOf(2),1, RoundingMode.HALF_EVEN);

        System.out.println("2.1 / 2 = 1.05 = " + e + " HALF_UP");
        System.out.println("2.1 / 2 = 1.05 = " + f + " HALF_DOWN");
        System.out.println("2.1 / 2 = 1.05 = " + g + " HALF_EVEN");

        BigDecimal i = new BigDecimal("2.3");
        BigDecimal j = i.divide(BigDecimal.valueOf(2),1, RoundingMode.HALF_UP);
        BigDecimal k = i.divide(BigDecimal.valueOf(2),1, RoundingMode.HALF_DOWN);
        BigDecimal l = i.divide(BigDecimal.valueOf(2),1, RoundingMode.HALF_EVEN);

        System.out.println("2.3 / 2 = 1.15 = " + j + " HALF_UP");
        System.out.println("2.3 / 2 = 1.15 = " + k + " HALF_DOWN");
        System.out.println("2.3 / 2 = 1.15 = " + l + " HALF_EVEN");
    }
}
