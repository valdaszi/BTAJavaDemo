package lt.baltictalents.p21.demo3;

import java.util.Locale;
import java.util.Objects;

public class Demo3 {

    public static void main(String... args) {

        String s = "AĄBCČDEĘėfghijklmnop-SS-ß";
        System.out.println(s);

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        // equals(Object obj), equalsIgnoreCase(String anotherString)
        System.out.println(s.equals(null));
        System.out.println(s.equals("aąbcčdeęėfghijklmnop-SS-ß"));
        System.out.println(s.equalsIgnoreCase("aąbcčdeęėfghijklmnop-SS-ß"));

        // compareTo(String anotherString), compareToIgnoreCase(String anotherString)
        System.out.println(s.compareTo("aąbcčdeęėfghijklmnop-SS-ß"));
        System.out.println(s.compareToIgnoreCase("aąbcčdeęėfghijklmnop-SS-ß"));
        System.out.println("a ? A " + "a".compareTo("A"));
        System.out.println("a ? ą " + "a".compareTo("ą"));
        System.out.println("ą ? b " + "ą".compareTo("b"));
        System.out.println("a ? b " + "a".compareTo("b"));

    }
}
