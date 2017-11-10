package lt.baltictalents.p07.demo2;

public class Zmogus {

    private static int kiekis = 0;

    private String vardas;

    private String pavarde;

    public Zmogus(String vardas) {
        this.vardas = vardas;
        kiekis++;
    }

    public String pilnasVardas() {
        return vardas + (pavarde == null ? "" : ' ' + pavarde);
    }

    public static int kiek() {
        return kiekis;
    }

    public static void main(String[] args) {

        System.out.println("Viso žmonių " + Zmogus.kiek());

        Zmogus zmogus1 = new Zmogus("Adomas");
        System.out.println(zmogus1.pilnasVardas());

        Zmogus zmogus2 = new Zmogus("Ieva");
        System.out.println(zmogus2.pilnasVardas());


        Zmogus zmogus3 = new Zmogus("Kainas");
        System.out.println(zmogus3.pilnasVardas());

        System.out.println("Viso žmonių " + Zmogus.kiek());

    }
}
