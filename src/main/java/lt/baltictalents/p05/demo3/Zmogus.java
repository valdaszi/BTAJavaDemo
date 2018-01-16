package lt.baltictalents.p05.demo3;

class Zmogus {

    String vardas;

    String pavarde;

    Zmogus(String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;
    }

    String pilnasVardas() {
        return vardas + (pavarde == null ? "" : ' ' + pavarde);
    }
}
