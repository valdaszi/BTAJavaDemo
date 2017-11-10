package lt.baltictalents.p06.demo1;

class Zmogus {

    String vardas;

    String pavarde;

    Zmogus(String vardas) {
        this.vardas = vardas;
    }

    Zmogus(String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;
    }

    String pilnasVardas() {
        return vardas + (pavarde == null ? "" : ' ' + pavarde);
    }

    public static void main(String[] args) {

        Zmogus zmogus1 = new Zmogus("Karolis XV");
        System.out.println(zmogus1.pilnasVardas());

        Zmogus zmogus2 = new Zmogus("Ieva", "Ievaitė");
        System.out.println(zmogus2.pilnasVardas());
    }

}
