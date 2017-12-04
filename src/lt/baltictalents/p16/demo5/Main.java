package lt.baltictalents.p16.demo5;

import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        // Reduce
        OptionalInt reduce = IntStream.range(1, 101).reduce((x, y) -> x + y);
        System.out.println("reduce 1: " + reduce);

        int sum = IntStream.range(1, 101).reduce(-50, (x, y) -> x + y);
        System.out.println("reduce 2: " + sum);

        sum = IntStream.range(1, 11)
                .boxed()
                .parallel()
                .reduce(0,
                        (s, x) -> {
                            System.out.println("(s, x) = (" + s + "," + x + ")");
                            return s + x;
                        },
                        (s1, x1) -> {
                            System.out.println("(s1, x1) = (" + s1 + "," + x1 + ")");
                            return s1 + x1;
                        });
        System.out.println("reduce 3: " + sum);
    }
}
