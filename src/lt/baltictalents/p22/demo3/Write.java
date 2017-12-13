package lt.baltictalents.p22.demo3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Write {

    public static void main(String... args) {

        List<A> list = new ArrayList<>();

        B b = new B("abrikosas", 100);

        list.add(new A("obuolys", b, new B("apelsinas", 200)));
        list.add(new A("slyva", new B("citrina", 300), b));

        for (A a : list) {
            System.out.println(a);
        }

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


    }
}
