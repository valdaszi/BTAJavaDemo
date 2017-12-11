package lt.baltictalents.p18.demo2;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Demo2 {

    public static void main(String... args) throws ParseException {

        System.out.println(Locale.getDefault().getDisplayName());

        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        System.out.println(numberFormat.getClass().getName());

        Number n = 1079252848.8;
        System.out.println(numberFormat.format(n));

        numberFormat = NumberFormat.getNumberInstance(Locale.FRANCE);
        System.out.println(numberFormat.format(n));

        Number x = numberFormat.parse("1 000 000,01");
        System.out.println(x);

        System.out.println(numberFormat.format(x));

    }
}
