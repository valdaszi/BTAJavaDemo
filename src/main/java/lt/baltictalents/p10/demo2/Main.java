package lt.baltictalents.p10.demo2;

import java.math.BigInteger;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        Long a = 1L;

        for (int i = 0; i < 64; i++) a = a * 2;

        System.out.println(a);



        BigInteger b = BigInteger.valueOf(1);

        for (int i = 0; i < 64; i++) b = b.multiply(BigInteger.valueOf(2));

        System.out.println(b);

//
//
//        BigInteger c = BigInteger.ONE;
//
//        for (int i = 0; i < 1000; i++) c = c.multiply(BigInteger.valueOf(2));
//
//        System.out.println(c);
    }
}
