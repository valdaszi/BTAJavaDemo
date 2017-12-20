package lt.baltictalents.p06.demo2;

public class Zmogus {

    String vardas;

    String pavarde;

    public Zmogus(String vardas) {
        this.vardas = vardas;
    }

    public Zmogus(String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;
    }

    public String pilnasVardas() {
        return vardas + (pavarde == null ? "" : ' ' + pavarde);
    }

}
