package lt.baltictalents.p19.demo3;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {

    public static void main(String... args) {

        try {
            int a = calc(10, 1);
            System.out.println(a);

            List<Integer> b = new ArrayList<>();
            System.out.println(get(b, 1));

        } catch (ArithmeticException e) {
            //e.printStackTrace();
            System.out.println("Aritmetinė klaida: " + e.getLocalizedMessage());

        } finally {
            System.out.println("bet šiaip tai viskas gerai :)");
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
