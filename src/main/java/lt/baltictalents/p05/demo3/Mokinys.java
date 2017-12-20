package lt.baltictalents.p05.demo3;

class Mokinys extends Zmogus {

    /**
     * Klases numeris: pvz 6 arba 9
     */
    int klase;

    /**
     * masyvas mokinio trimestro pažymių
     */
    int[] trimestras;

    Mokinys(String vardas, String pavarde, int klase) {
        super(vardas, pavarde);
        this.klase = klase;
    }

    Mokinys(String vardas, String pavarde, int klase, int[] trimestras) {
        this(vardas, pavarde, klase);
        this.trimestras = trimestras;
    }

}
