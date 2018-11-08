package lt.baltictalents.p17.demo5;

import java.time.LocalDateTime;

public class Demo5 {

    public static void main(String... args) {

        LocalDateTime dateTime = LocalDateTime.parse("2017-12-01T23:59:59.999");
        System.out.println(dateTime);

        dateTime = LocalDateTime.of(2017, 12, 1, 23, 59, 0, 12345678);
        System.out.println(dateTime);

        dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        dateTime = dateTime.plusDays(10);
        System.out.println(dateTime);

        dateTime = dateTime.plusYears(1);
        System.out.println(dateTime);

        dateTime = dateTime.plusSeconds(3600);
        System.out.println(dateTime);
    }
}
