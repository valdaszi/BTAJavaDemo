package lt.baltictalents.p11.demo1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(0, 40);

        System.out.print("Sąrašas:");
        for (Integer i : list) {
            System.out.print(" " + i);
        }
        System.out.println();

        System.out.println("Ar yra 20? = " + list.contains(20));
        System.out.println("(1) = " + list.get(1));

        System.out.println("Išmetam is sąrašo (0) ir 20");
        list.remove(0);
        list.remove(Integer.valueOf(20));

        System.out.print("Sąrašas:");
        for (Integer i : list) {
            System.out.print(" " + i);
        }
        System.out.println();

    }
}
