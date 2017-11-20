package lt.baltictalents.p07.demo2;

public class Main {

    public static void main(String[] args) {

        System.out.println("Viso žmonių " + Zmogus.getCount());

        Zmogus zmogus1 = new Zmogus("Adomas");
        System.out.println(zmogus1.pilnasVardas());

        Zmogus zmogus2 = new Zmogus("Ieva");
        System.out.println(zmogus2.pilnasVardas());


        Zmogus zmogus3 = new Zmogus("Kainas");
        System.out.println(zmogus3.pilnasVardas());

        Zmogus.setCount(4);

        System.out.println("Viso žmonių " + Zmogus.getCount());
        System.out.println("Viso žmonių iš tiesų " + Zmogus.getReal());

    }
}
