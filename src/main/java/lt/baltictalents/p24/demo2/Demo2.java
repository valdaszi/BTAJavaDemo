package lt.baltictalents.p24.demo2;

import java.util.logging.Logger;

public class Demo2 {

    public static void main(String... args) throws InterruptedException {

        Logger logger = Logger.getLogger(Demo2.class.getName());

        System.out.println("Logger name: " + logger.getName());
        System.out.println("Logger Level: " + logger.getParent().getHandlers()[0].getLevel());

        logger.severe("Klaida");
        logger.warning("Įspėjimas");
        logger.info("Pranešimas");
        logger.config("Konfigūravimas");
        logger.fine("Detalus");
        logger.finer("Detalesnis");
        logger.finest("Detaliausias");

    }
}
