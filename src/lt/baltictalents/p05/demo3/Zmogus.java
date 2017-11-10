package lt.baltictalents.p05.demo3;

class Zmogus {

    String vardas;

    String pavarde;

    Zmogus(String v, String p) {
        vardas = v;
        pavarde = p;
    }

    String pilnasVardas() {
        return vardas + (pavarde == null ? "" : ' ' + pavarde);
    }
}
