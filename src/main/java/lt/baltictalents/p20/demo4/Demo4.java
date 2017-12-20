package lt.baltictalents.p20.demo4;

import java.io.*;

/**
 * Demo of BufferedInputStream, BufferedOutputStream
 */
public class Demo4 {

    public static void main(String... args) {

        long startTime = System.nanoTime();

        try (
                InputStream in = new BufferedInputStream(
                        new FileInputStream("src/main/java/lt/baltictalents/p20/java-iso-8859-13.txt"));
                OutputStream out = new BufferedOutputStream(
                        new FileOutputStream("src/main/java/lt/baltictalents/p20/output.txt"));
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
