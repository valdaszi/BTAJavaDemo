package lt.baltictalents.p07.demo1;

public class Zmogus {

    static int kiekis = 0;

    private String vardas;

    private String pavarde;

    public Zmogus(String vardas) {
        this.vardas = vardas;
        kiekis++;
    }

    public String pilnasVardas() {
        return vardas + (pavarde == null ? "" : ' ' + pavarde);
    }

    public static void main(String[] args) {

        System.out.println("Viso žmonių " + Zmogus.kiekis);

        Zmogus zmogus1 = new Zmogus("Adomas");
        System.out.println(zmogus1.pilnasVardas());

        Zmogus zmogus2 = new Zmogus("Ieva");
        System.out.println(zmogus2.pilnasVardas());

        System.out.println("Viso žmonių " + zmogus2.kiekis);

    }
}
