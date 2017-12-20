package lt.baltictalents.p24.demo4;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.logging.*;

public class Demo4 {

    static final Logger logger = Logger.getLogger(Demo4.class.getName());

    public static void main(String... args) throws IOException {

        logger.addHandler(new ConsoleHandler());
        logger.addHandler(new FileHandler("src/main/java/lt/baltictalents/p24/demo4/output-xml.txt"));

        Handler logSimpleTxt = new FileHandler("src/main/java/lt/baltictalents/p24/demo4/output-simple-txt.txt");
        logSimpleTxt.setFormatter(new SimpleFormatter());
        logger.addHandler(logSimpleTxt);

        Handler logTxt = new FileHandler("src/main/java/lt/baltictalents/p24/demo4/output-txt.txt");
        logTxt.setFormatter(new Formatter() {

            @Override
            public String format(LogRecord record) {
                return LocalDateTime.ofInstant(Instant.ofEpochMilli(record.getMillis()), ZoneId.of("UTC")).toString() + '\t' +
                        record.getSourceClassName() + '\t' +
                        record.getSourceMethodName() + '\t' +
                        record.getLevel() + '\t' +
                        record.getMessage() + '\n';
            }
        });
        logger.addHandler(logTxt);


        logger.warning("Įspėjimas");
        logger.severe("Klaida");
        logger.info("Pranešimas #1");
        logger.info("Pranešimas #2");
        logger.info("Pranešimas #3");
    }

}
