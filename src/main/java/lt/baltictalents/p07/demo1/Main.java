package lt.baltictalents.p07.demo1;

public class Main {

    public static void main(String[] args) {

        System.out.println("Viso žmonių " + Zmogus.getKiekis());

        Zmogus zmogus1 = new Zmogus("Adomas");
        System.out.println(zmogus1.pilnasVardas());

        Zmogus zmogus2 = new Zmogus("Ieva");
        System.out.println(zmogus2.pilnasVardas());

        System.out.println("Viso žmonių " + Zmogus.getKiekis());

        //Zmogus.kiekis++;

        System.out.println("Viso žmonių " + Zmogus.getKiekis());

    }
}
