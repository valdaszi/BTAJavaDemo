package lt.baltictalents.p18.demo5;

import java.text.ChoiceFormat;
import java.text.MessageFormat;

public class Demo5 {

    public static void main(String... args) {

        String message = "Ant {1} guli {0} obuolys(iai)";

        for (int i = 0; i < 5; i++) {

            String result = MessageFormat.format(message, i, "stalo");
            System.out.println(result);

        }

        System.out.println("Bandymas #2");

        message = "Ant {1} guli {0,choice,0#nulis obuolių | 1#vienas obuolys | 2#{0} obuoliai}";

        for (int i = 0; i < 5; i++) {

            String result = MessageFormat.format(message, i, "stalo");
            System.out.println(result);

        }
        System.out.println(MessageFormat.format(message, 10, "stalo"));


        System.out.println("Bandymas #3");

        double[] limits = {0, 1, 2, 10, 21, 22, 30, 31, 32};
        String[] part = {
                "nulis obuolių",
                "vienas obuolys",
                "{0} obuoliai",
                "{0} obuolių",
                "{0} obuolys",
                "{0} obuoliai",
                "{0} obuolių",
                "{0} obuolys",
                "{0} obuoliai"
        };
        ChoiceFormat choiceFormat = new ChoiceFormat(limits, part);

        message = "Ant {1} guli {0}";

        MessageFormat messageFormat = new MessageFormat(message);
        messageFormat.setFormatByArgumentIndex(0, choiceFormat);

        for (int i = 0; i < 5; i++) {

            String result = messageFormat.format(new Object[] {i, "stalo"});
            System.out.println(result);

        }

        System.out.println(messageFormat.format(new Object[] { 10, "stalo" }));
        System.out.println(messageFormat.format(new Object[] { 20, "stalo" }));
        System.out.println(messageFormat.format(new Object[] { 21, "stalo" }));
        System.out.println(messageFormat.format(new Object[] { 29, "stalo" }));
        System.out.println(messageFormat.format(new Object[] { 30, "stalo" }));

    }
}
