package lt.baltictalents.p22.demo1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {

    public static void main(String... args) {

        List<A> list = new ArrayList<>();

        B b = new B("abrikosas", 100);

        list.add(new A("obuolys", b, new B("apelsinas", 200)));
        list.add(new A("slyva", new B("citrina", 300), b));

        // writing
        try (
                ObjectOutput ou = new ObjectOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream("src/lt/baltictalents/p22/output.txt")))
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
