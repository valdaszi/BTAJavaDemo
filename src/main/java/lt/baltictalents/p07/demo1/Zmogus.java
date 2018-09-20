package lt.baltictalents.p07.demo1;

public class Zmogus {

    private static int kiekis = 0;

    private String vardas;

    private String pavarde;

    public Zmogus(String vardas) {
        this.vardas = vardas;
        kiekis++;
    }

    public static int getKiekis() {
        return kiekis;
    }

    public String pilnasVardas() {
        return vardas + (pavarde == null ? "" : ' ' + pavarde);
    }
}
