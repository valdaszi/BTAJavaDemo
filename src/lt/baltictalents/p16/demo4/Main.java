package lt.baltictalents.p16.demo4;

import lt.baltictalents.p16.data.Employee;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        // Filter
        IntStream stream = IntStream.range(1, 101);
        //System.out.println("Viso " + stream.count());
        long count2 = stream.filter(x -> x % 2 == 0).count();
        System.out.println("Viso lyginių " + count2);

        // Map
        int suma = IntStream.range(1, 201).filter(x -> x % 2 == 0).map(x -> x / 2).sum();
        System.out.println("Suma " + suma);

        // Sorted
        System.out.print("sorted");
        stream = new Random().ints(10, 1, 1000);
        stream.sorted().forEach(x -> System.out.print(" " + x));
        System.out.println();

    }
}