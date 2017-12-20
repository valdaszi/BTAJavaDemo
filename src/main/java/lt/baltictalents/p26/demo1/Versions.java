package lt.baltictalents.p26.demo1;

import java.io.IOException;

/**
 * Klasė skirta dirbti su versijomis.
 * Joje yra keletas funkcijų darbui su versijomis.
 */
public class Versions {

    /**
     * Paruošia pavadinimą kartu su versijos numeriu
     * @param n pavadinimas
     * @param major pagrindinis versijos numeris
     * @param minor pagalbinis versijos numeris
     * @return paruoštą pavadinimą su versijos numeriu
     * @throws IOException jei versijos nėra
     * @see Demo1 Demo1
     */
    public static String method(String n, Integer major, Integer minor) throws IOException {
        if (major == null || major <= 0) throw new IOException("No version");
        return n + " ver." + major + (minor == null ? "" : "." + minor);
    }


    /**
     * Paruošia pavadinimą kartu su versijos numeriu.
     * See also {@link #method(String, Integer, Integer) method(String, Integer, Integer)}
     *
     * @param n pavadinimas
     * @param major pagrindinis versijos numeris
     * @return paruoštą pavadinimą su versijos numeriu
     * @throws IOException jei versijos nėra arb ji 0
     * @throws ArithmeticException jei kažkas negerai
     * @see Demo1 Demo1
     */
    public static String method(String n, Integer major) throws IOException {
        return method(n, major, null);
    }
}
