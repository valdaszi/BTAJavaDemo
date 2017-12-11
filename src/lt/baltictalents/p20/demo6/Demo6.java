package lt.baltictalents.p20.demo6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Demo of ObjectInputStream, ObjectOutputStream
 */
public class Demo6 {

    public static void main(String... args) {

        List<A> list = new ArrayList<>();

        B b = new B("abrikosas", 100);

        list.add(new A("obuolys", b, new B("apelsinas", 200)));
        list.add(new A("slyva", new B("citrina", 300), b));

        // writing
        try (
                ObjectOutput ou = new ObjectOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream("src/lt/baltictalents/p20/output.txt")))
        ) {
            ou.writeUTF("Abrakadabra");
            ou.writeObject(list);


        } catch (IOException e) {
            e.printStackTrace();
        }


        // reading
        try (
                ObjectInput in = new ObjectInputStream(
                        new BufferedInputStream(
                                new FileInputStream("src/lt/baltictalents/p20/output.txt")))
        ) {

            System.out.println(in.readUTF());

            Object object = in.readObject();
            if (object instanceof List) {
                List<A> list2 = (List<A>) object;
                System.out.println("elementų: " + list2.size());
                for (A a : list2) {
                    System.out.println(a);
                }
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();

        }

    }
}
