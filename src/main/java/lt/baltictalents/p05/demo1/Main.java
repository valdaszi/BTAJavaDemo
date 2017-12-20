package lt.baltictalents.p05.demo1;

public class Main {

    public static void main(String[] args) {

        Zmogus zmogus1 = new Zmogus();
        zmogus1.vardas = "Karolis XV";
        System.out.println(zmogus1.vardas);

        Zmogus zmogus2 = new Zmogus();
        zmogus2.vardas = "Ieva";
        zmogus2.pavarde = "Ievaitė";
        System.out.println(zmogus2.vardas + ' ' + zmogus2.pavarde);
    }
}
