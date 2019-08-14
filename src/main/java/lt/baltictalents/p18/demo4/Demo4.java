package lt.baltictalents.p18.demo4;

import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

public class Demo4 {

    public static void main(String... args) {

        int planet = 7;
        String event = "a disturbance in the Force";

        String result = MessageFormat.format(
                "At {1,time} on {1,date}, there was {2} on planet {0,number,integer}.",
                planet, new Date(), event);
        System.out.println(result);

        result = MessageFormat.format(
                "{1} planetoje {0} atsitiko toks dalykas.",
                planet, new Date(), event);
        System.out.println(result);

    }
}
