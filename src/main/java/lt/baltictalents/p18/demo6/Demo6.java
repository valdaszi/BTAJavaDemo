package lt.baltictalents.p18.demo6;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Butinai reikia subuildinti i jar faila (maven package)
 * Ir tada galim paleisti is terminalo:
 * java -cp target/demo-1.0-SNAPSHOT.jar lt.baltictalents.p18.demo6.Demo6
 */

public class Demo6 {

    public static void main(String... args) {

        Locale.setDefault(Locale.GERMAN);
        messages();

        Locale.setDefault(Locale.forLanguageTag("lt"));
        messages();

        Locale.setDefault(Locale.US);
        messages();

    }

    private static void messages() {

        System.out.println(Locale.getDefault().getDisplayName());

//        ResourceBundle messages = ResourceBundle.getBundle("lt.baltictalents.p18.demo6.MessagesBundle");
        ResourceBundle messages = ResourceBundle.getBundle(Demo6.class.getPackage().getName() + ".MessagesBundle");

        String message = messages.getString("message");
        String thing = messages.getString("thing");

        for (int i = 0; i < 5; i++) {

            String result = MessageFormat.format(message, i, thing);
            System.out.println(result);

        }
    }

}
