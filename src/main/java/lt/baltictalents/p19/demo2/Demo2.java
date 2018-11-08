package lt.baltictalents.p19.demo2;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Demo2 {

    public static void main(String... args) {

        try {
            int a = calc(10, 0);
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Klaida su dalyba!!!");
            e.printStackTrace();
        }

        try {
            List<Integer> b = new ArrayList<>();
            System.out.println(get(b, 1));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Klaida su kolekcija!!! " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Pabaiga");
    }

    static int calc(int a, int b) {
        return a / b;
    }

    static Integer get(List<Integer> list, int index) {
        return list.get(index);
    }
}
