package lt.baltictalents.p16.demo2;

import lt.baltictalents.p16.data.Employee;
import lt.baltictalents.p30.demo3_Composite.Ellipse;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Kazys", 1400.0, "administration"));
        list.add(new Employee("Jonas", 800.0, "store"));
        list.add(new Employee("Ona", 900.0, "sales"));
        list.add(new Employee("Petras", 1200.0, "sales"));
        list.add(new Employee("Ada", 1500.0, "administration"));


        System.out.println("stream:");
//        list.stream().filter(new Predicate<Employee>() {
//                                 @Override
//                                 public boolean test(Employee employee) {
//                                     return employee.getSalary() > 1000.0;
//                                 }
//        }).forEach(new Consumer<Employee>() {
//            @Override
//            public void accept(Employee employee) {
//                System.out.println(employee);
//            }
//        });
        list.stream()
                .filter(employee -> employee.getSalary() > 1000.0)
                .forEach(x -> System.out.println(x));

        System.out.println("parallelStream:");
        list.parallelStream()
                .filter(e -> e.getSalary() < 1400.0)
                .forEach(System.out::println);
    }
}
