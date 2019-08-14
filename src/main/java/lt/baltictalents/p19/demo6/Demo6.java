package lt.baltictalents.p19.demo6;

import java.text.NumberFormat;
import java.text.ParseException;

public class Demo6 {

    public static void main(String... args) {

        try {
            System.out.println(parse("123.45"));
            System.out.println(parse("1a"));
            System.out.println(parse("abc"));
        } catch (ParseException | ArithmeticException e) {
            e.printStackTrace();
            System.err.println("Klaida: " + e.getMessage());
        } finally {
            System.out.println("Beveik pabaiga");
        }

        System.out.println("Tikra pabaiga");
    }

    static int parse(String a) throws ParseException {
        NumberFormat nf = NumberFormat.getIntegerInstance();
        int i = nf.parse(a).intValue();

        if (i == 0) throw new ArithmeticException("Nulis!!!");
        return i;
    }

}
