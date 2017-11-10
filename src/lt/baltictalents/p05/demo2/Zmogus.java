package lt.baltictalents.p05.demo2;

class Zmogus {

    String vardas;

    String pavarde;

    Zmogus(String v) {
        vardas = v;
    }

    Zmogus(String v, String p) {
        vardas = v;
        pavarde = p;
    }


    public static void main(String[] args) {

        Zmogus zmogus1 = new Zmogus("Jonas Paulius II");
        System.out.println(zmogus1.vardas);

        Zmogus zmogus2 = new Zmogus("Rasa", "Pelėda");
        System.out.println(zmogus2.vardas + ' ' + zmogus2.pavarde);

    }
}
