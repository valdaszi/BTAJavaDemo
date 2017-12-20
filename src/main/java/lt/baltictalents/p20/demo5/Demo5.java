package lt.baltictalents.p20.demo5;

import java.io.*;

/**
 * Demo of DataInputStream, DataOutputStream
 */
public class Demo5 {

    public static void main(String... args) {

        int a = 101;
        double d = 123.987654321;
        boolean b = true;
        char c = 'x';
        String s = "Loren ipsum";

        // writing
        try (
                DataOutputStream ou = new DataOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream("src/main/java/lt/baltictalents/p20/output.txt")))
        ) {

            ou.writeChar(c);
            ou.writeInt(a);
            ou.writeDouble(d);
            ou.writeBoolean(b);
            ou.writeUTF(s);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // reading
        try (
                DataInputStream in = new DataInputStream(
                        new BufferedInputStream(
                                new FileInputStream("src/main/java/lt/baltictalents/p20/output.txt")))
        ) {

            System.out.println("c = " + in.readChar());
            System.out.println("i = " + in.readInt());
            System.out.println("d = " + in.readDouble());
            System.out.println("b = " + in.readBoolean());
            System.out.println("s = " + in.readUTF());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
