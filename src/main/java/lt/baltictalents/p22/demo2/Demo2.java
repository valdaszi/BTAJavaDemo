package lt.baltictalents.p22.demo2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Demo2 {

    public static void main(String... args) {

        List<A> list = new ArrayList<>();

        B b = new B("abrikosas", 100);

        list.add(new A("obuolys", b, new B("apelsinas", 200)));
        list.add(new A("slyva", new B("citrina", 300), b));

        // writing
        try (
                ObjectOutput ou = new ObjectOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream("src/main/java/lt/baltictalents/p22/output.txt")))
        ) {
            ou.writeUTF("Abrakadabra");
            ou.writeObject(list);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
