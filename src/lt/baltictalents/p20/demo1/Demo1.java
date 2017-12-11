package lt.baltictalents.p20.demo1;

import java.io.*;

/**
 * Demo of InputStream, OutputStream
 */
public class Demo1 {

    public static void main(String... args) {

        long startTime = System.nanoTime();

        try (
            InputStream in = new FileInputStream("src/lt/baltictalents/p20/java-iso-8859-13.txt");
            OutputStream out = new FileOutputStream("src/lt/baltictalents/p20/output.txt");
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
