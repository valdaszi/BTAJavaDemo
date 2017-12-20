package lt.baltictalents.p06.demo3;

public class Zmogus {

    private String vardas;

    private String pavarde;

    private int age;

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

    //TODO sugeneruoti geterius ir seterius
}
