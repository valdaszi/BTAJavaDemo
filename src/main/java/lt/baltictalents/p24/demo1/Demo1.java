package lt.baltictalents.p24.demo1;

import java.util.logging.Logger;

public class Demo1 {

    public static void main(String... args) {

        System.out.println("Šiaip pranešimas #1");
        System.err.println("Klaida #1");
        System.out.println("Šiaip pranešimas #2");
        System.out.println("Šiaip pranešimas #3");
        System.err.println("Klaida #2");

        Logger logger = Logger.getLogger(Demo1.class.getName());

        logger.severe("Rimta klaida !!!");
    }
}
