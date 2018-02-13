package lt.baltictalents.p18.demo3;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class Demo3 {

    public static void main(String... args) throws ParseException {

        // Currency
        Locale locale = Locale.forLanguageTag("lt");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);

        BigDecimal n = new BigDecimal("123456.789");
        System.out.println(numberFormat.format(n));

        numberFormat.setCurrency(Currency.getInstance("EUR"));
        numberFormat.setGroupingUsed(false);
        System.out.println(numberFormat.format(n));

        numberFormat.setMaximumFractionDigits(3);
        System.out.println(numberFormat.format(n));

        Number x = numberFormat.parse("123456,789 €");
        System.out.println(x.getClass().getName() + ": " + x);

        // Integer
        numberFormat = NumberFormat.getIntegerInstance(locale);
        double c = 123456.789;
        System.out.println(numberFormat.format(c));

        x = numberFormat.parse("123 456,789");
        System.out.println(x.getClass().getName() + ": " + x);

    }
}
