package lt.baltictalents.p05.demo3;

public class Main {

    public static void main(String[] args) {

        Mokinys mokinys1 = new Mokinys("Jonas", "Jonaitis", 3);

        System.out.println(mokinys1.vardas + ' ' + mokinys1.pavarde + " iš " + mokinys1.klase + " klasės");


        Mokinys mokinys2 = new Mokinys("Ona", "Onaitė", 2, new int[] {9, 10, 10});

        System.out.println(mokinys1.vardas + ' ' + mokinys1.pavarde + " iš " + mokinys2.klase + " klasės");

    }

}
