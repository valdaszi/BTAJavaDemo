package lt.baltictalents.p21.demo6;

import java.util.Calendar;
import java.util.Date;

public class Demo6 {

    public static void main(String... args) {

        // valueOf()

        System.out.println(String.valueOf(123));
        System.out.println(String.valueOf(12.3));
        System.out.println(String.valueOf(new char[] {'a', 'b', 'c', 'd'}, 1, 2));

        // format()

        System.out.println(String.format("Labas: %d;%05d;%2d", 123, 123, 123));
        System.out.println(String.format("%g %e=%2$10.2f", 10.2987654321, 1.2987654321));
        System.out.println(String.format("Dabar: %1$tA, %1$tY %1$tB", new Date()));
        System.out.format("Local time: %tT", Calendar.getInstance());
    }
}
