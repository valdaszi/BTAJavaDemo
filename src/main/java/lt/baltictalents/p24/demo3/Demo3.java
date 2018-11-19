package lt.baltictalents.p24.demo3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Demo3 {

    public static void main(String... args) throws InterruptedException, IOException {

        Logger logger = Logger.getLogger(Demo3.class.getName());
        logger.setLevel(Level.ALL);

        Logger root = Logger.getLogger("");
        for (Handler handler : root.getHandlers()) {
            handler.setLevel(Level.FINER);
        }

        logger.severe("Klaida");
        logger.warning("Įspėjimas");
        logger.info("Pranešimas");
        logger.config("Konfigūravimas");
        logger.fine("Detalus");
        logger.finer("Detalesnis");
        logger.finest("Detaliausias");

        logger.log(Level.WARNING, "Kitas Įspėjimas");
        logger.log(Level.SEVERE, "Klaida 2");
    }
}
