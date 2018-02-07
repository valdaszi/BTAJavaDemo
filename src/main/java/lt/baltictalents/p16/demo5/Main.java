package lt.baltictalents.p16.demo5;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        // Reduce
        /*
          reduce(accumulator):

          boolean foundAny = false;
          int result = null;
          for (int element : this stream) {
              if (!foundAny) {
                  foundAny = true;
                  result = element;
              }
              else
                  result = accumulator.applyAsInt(result, element);
          }
          return foundAny ? OptionalInt.of(result) : OptionalInt.empty();
         */
        OptionalInt reduce = IntStream.range(1, 101).reduce((x, y) -> x + y);
        System.out.println("reduce 1: " + reduce);

        /*
          reduce(identity, accumulator):

          int result = identity;
          for (int element : this stream)
              result = accumulator.applyAsInt(result, element)
          return result;
         */
        int sum = IntStream.range(1, 101).reduce(-50, (x, y) -> x + y);
        System.out.println("reduce 2: " + sum);

        /*
          reduce(identity, accumulator, combiner):

          U result = identity;
          for (T element : this stream)
              result = accumulator.apply(result, element)
          return result;

          The identity value must be an identity for the combiner function. This means that for all u, combiner(identity, u) is equal to u
          Additionally, the combiner function must be compatible with the accumulator function; for all u and t, the following must hold:
          combiner.apply(u, accumulator.apply(identity, t)) == accumulator.apply(u, t)
         */
        sum = IntStream.range(1, 11)
                .boxed()
                //.parallel()
                .reduce(0,
                        (s, x) -> {
                            System.out.println("a: (s, x) = (" + s + "," + x + ") -> " + (s + x));
                            return s + x;
                        } /* ,
                        (s, x) -> {
                            System.out.println("c: (s, x) = (" + s + "," + x + ") -> " + (s + x));
                            return s + x;
                        }*/);
        System.out.println("reduce 3.1: " + sum);

        sum = IntStream.range(1, 11)
                .boxed()
                .parallel()
                .reduce(0,
                        (s, x) -> {
                            System.out.println("a: (s, x) = (" + s + "," + x + ") -> " + (s + x));
                            return s + x;
                        },
                        (s, x) -> {
                            System.out.println("c: (s, x) = (" + s + "," + x + ") -> " + (s + x));
                            return s + x;
                        });
        System.out.println("reduce 3.2: " + sum);
    }
}
