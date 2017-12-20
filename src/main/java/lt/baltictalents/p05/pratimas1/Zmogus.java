package lt.baltictalents.p05.pratimas1;

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

    public static void main(String[] args) {

        Zmogus[] zmones = new Zmogus[3];
        zmones[0] = new Zmogus("Henrikas VII");
        zmones[1] = new Zmogus("Jonas", "Jonaitis");
        zmones[2] = new Zmogus("Ona", "Onaitė");

        for (Zmogus z : zmones) {
            System.out.println(z.vardas + (z.pavarde == null ? "" : ' ' + z.pavarde));
        }
    }
}
