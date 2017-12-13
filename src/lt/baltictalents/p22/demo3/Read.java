package lt.baltictalents.p22.demo3;

import java.io.*;
import java.util.List;

public class Read {

    public static void main(String... args) {

        // reading
        try (
                ObjectInput in = new ObjectInputStream(
                        new BufferedInputStream(
                                new FileInputStream("src/lt/baltictalents/p22/output.txt")))
        ) {

            System.out.println(in.readUTF());

            List<A> list2 = (List<A>) in.readObject();

            System.out.println("elementų: " + list2.size());
            for (A a : list2) {
                System.out.println(a);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();

        }
    }
}
