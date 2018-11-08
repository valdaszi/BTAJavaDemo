package lt.baltictalents.p14.demo5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Double> list = new ArrayList<>();
        list.add(1.0);
        list.add(2.5);
        list.add(3.4);

        System.out.println("Suma = " + Utils.<Double>sum(list)); // <Double> galima nenurodyti
        System.out.println(Utils.concat(list));
    }
}
