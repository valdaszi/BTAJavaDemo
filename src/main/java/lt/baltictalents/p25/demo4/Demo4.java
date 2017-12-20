package lt.baltictalents.p25.demo4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class Demo4 {

    public static void main(String... args) throws FileNotFoundException {

        System.out.println("Pranešimas");
        System.err.println("Klaida");

        OutputStream output = new FileOutputStream("src/main/java/lt/baltictalents/p25/demo4/out.txt");
        PrintStream printOut = new PrintStream(output);

        System.setOut(printOut);

        System.out.println("Pranešimas A");
        System.out.println("Pranešimas B");
        System.out.flush();

    }
}
