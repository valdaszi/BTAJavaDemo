package lt.baltictalents.p19.demo1;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

    public static void main(String... args) {

        int a = calc(10, 2);
        System.out.println(a);

        a =  calc(10, 0);
        System.out.println(a);

        List<Integer> b = new ArrayList<>();
        System.out.println(get(b, 1));

        System.out.println("Pabaiga");

    }

    static int calc(int a, int b) {
        return a / b;
    }

    static Integer get(List<Integer> list, int index) {
        return list.get(index);
    }
}
