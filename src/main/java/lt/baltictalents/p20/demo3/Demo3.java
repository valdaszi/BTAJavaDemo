package lt.baltictalents.p20.demo3;

import java.io.*;

/**
 * Demo of BufferedReader, BufferedWriter
 */
public class Demo3 {

    public static void main(String... args) {

        long startTime = System.nanoTime();

        try (
                Reader in = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream("src/main/java/lt/baltictalents/p20/java-iso-8859-13.txt"),
                                "ISO-8859-13"));

                Writer out = new BufferedWriter(new FileWriter("src/main/java/lt/baltictalents/p20/output.txt"));
        ) {

            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }

        } catch (IOException e) {
            e.printStackTrace();

        }

        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Laikas: " + (estimatedTime / 1e6) + "ms");

    }
}
