package lt.baltictalents.p26.demo1;

import java.io.IOException;

/**
 * Demo kaip naudoti javadoc komandas
 * <br>Klasė reikalinga kažką padaryti
 * <ul>
 *     <li>Pirmas</li>
 *     <li>Antras</li>
 * </ul>
 *
 * @author Jonas
 * @version 2.0
 *
 */
public class Demo1 {

    public static void main(String... args) throws IOException {

        System.out.println(Versions.method("Programa", 2));
        System.out.println(Versions.method("Programa", 3, 1));
        System.out.println(Versions.method("Programa", 0));

    }

}