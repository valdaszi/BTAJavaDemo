package lt.baltictalents.p07.demo2;

public class Zmogus {

    private static int count = 0;

    private static int real = 0;

    private String vardas;

    private String pavarde;

    public Zmogus(String vardas) {
        this.vardas = vardas;
        count++;
        real++;
    }

    public String pilnasVardas() {
        return vardas + (pavarde == null ? "" : ' ' + pavarde);
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Zmogus.count = count;
    }

    public static int getReal() {
        return real;
    }
}
