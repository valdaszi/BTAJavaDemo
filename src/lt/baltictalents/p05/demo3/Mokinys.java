package lt.baltictalents.p05.demo3;

class Mokinys extends Zmogus {

    int klase;            // pvz 6 ar 9 

    int[] trimestras;  // masyvas mokinio trimestro pažymių

    Mokinys(String vardas, String pavarde, int klase) {
        super(vardas, pavarde);
        this.klase = klase;
    }

    Mokinys(String vardas, String pavarde, int klase, int[] trimestras) {
        this(vardas, pavarde, klase);
        this.trimestras = trimestras;
    }


    public static void main(String[] args) {

        Mokinys mokinys1 = new Mokinys("Jonas", "Jonaitis", 3);

        System.out.println(mokinys1.vardas + ' ' + mokinys1.pavarde + " iš " + mokinys1.klase + " klasės");


        Mokinys mokinys2 = new Mokinys("Ona", "Onaitė", 2, new int[] {9, 10, 10});

        System.out.println(mokinys1.vardas + ' ' + mokinys1.pavarde + " iš " + mokinys2.klase + " klasės");

    }
}
