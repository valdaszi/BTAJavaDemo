package lt.baltictalents.p06;

import lt.baltictalents.p06.demo2.Zmogus;

public class Demo2 {

    public static void main(String[] args) {

        lt.baltictalents.p06.demo2.Zmogus zmogus1 = new lt.baltictalents.p06.demo2.Zmogus("Jonas Paulius II");
        System.out.println(zmogus1.pilnasVardas());

        Zmogus zmogus2 = new Zmogus("Rasa", "Pelėda");
        System.out.println(zmogus2.pilnasVardas());

    }
}
