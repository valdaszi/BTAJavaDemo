package lt.baltictalents.p05.demo2;

public class Main {

    public static void main(String[] args) {

        Zmogus zmogus1 = new Zmogus("Jonas Paulius II");
        System.out.println(zmogus1.vardas);

        Zmogus zmogus2 = new Zmogus("Rasa", "Pelėda");
        System.out.println(zmogus2.vardas + ' ' + zmogus2.pavarde);
    }
}
