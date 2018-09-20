package lt.baltictalents.p23.demo6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo6 {

    static final long LOOP = 100;

    public static void main(String... args) throws InterruptedException {

        List<Integer> list = new ArrayList<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < LOOP; i++) {
                list.add(list.size());
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < LOOP; i++) {
                list.add(list.size());
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("size=" + list.size() + ", " + list);

    }
}
