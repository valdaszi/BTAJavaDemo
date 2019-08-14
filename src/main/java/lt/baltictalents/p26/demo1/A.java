package lt.baltictalents.p26.demo1;

import java.io.IOException;

/**
 * Labai svarbi klasė šitame projekte
 */
public class A {

    /**
     * Demo1 klasės objektas kažkam reikalingas
     */
    Demo1 demo1;

    /**
     * Na o čia svarbus metodas
     * @throws IOException kai kažkas atsitinka
     *
     * @see Versions
     */
    public void m() throws IOException {
        String v = Versions.method("Demo", 1);
    }
}
