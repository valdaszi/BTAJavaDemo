package lt.baltictalents.p16.demo1;

import java.util.Optional;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Function<String, Integer> convert = Integer::parseInt;
        System.out.println("convert 123 -> " + convert.apply("123"));

        Predicate<Integer> positive = x -> x > 0;
        System.out.println("positive(1) " + positive.test(1));
        System.out.println("positive(-2) " + positive.test(-2));

        Supplier<Integer> generator = new Random()::nextInt;
        System.out.println("random #1 -> " + generator.get());
        System.out.println("random #2 -> " + generator.get());
        System.out.println("random #3 -> " + generator.get());

        for (int i = 0; i < 5; i++) {
            Optional<Integer> opt = generator.get() < 0 ? Optional.empty() : Optional.of(100);
            System.out.println(opt);
        }

    }
}
