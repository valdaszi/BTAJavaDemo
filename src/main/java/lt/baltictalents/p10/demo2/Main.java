package lt.baltictalents.p10.demo2;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        Long a = new Long(1);

        for (int i = 0; i < 64; i++) a = new Long(a.longValue() * 2);

        System.out.println(a);



        BigInteger b = BigInteger.valueOf(1);

        for (int i = 0; i < 64; i++) b = b.multiply(BigInteger.valueOf(2));

        System.out.println(b);



        BigInteger c = BigInteger.ONE;

        for (int i = 0; i < 1000; i++) c = c.multiply(BigInteger.valueOf(2));

        System.out.println(c);
    }
}
