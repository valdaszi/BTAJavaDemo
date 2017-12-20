package lt.baltictalents.p18.demo1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Demo1 {

    public static void main(String... args) {

        LocalDateTime dateTime = LocalDateTime.now();

        Locale locale = new Locale("lt");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(locale);
        System.out.println("lt: " + dateTimeFormatter.format(dateTime));

        locale = new Locale("en", "AU");
        dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(locale);
        System.out.println("en_AU: " + dateTimeFormatter.format(dateTime));

        locale = new Locale("en", "UK");
        dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(locale);
        System.out.println("en_UK: " + dateTimeFormatter.format(dateTime));

        locale = new Locale.Builder().setLanguage("ja").setRegion("JP").build();
        dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(locale);
        System.out.println("ja_JP: " + dateTimeFormatter.format(dateTime));

        locale = Locale.GERMAN;
        dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(locale);
        System.out.println("GERMAN: " + dateTimeFormatter.format(dateTime));
    }
}
