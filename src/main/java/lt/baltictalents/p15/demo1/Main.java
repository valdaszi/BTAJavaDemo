package lt.baltictalents.p15.demo1;

import lt.baltictalents.p15.data.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Kazys", 1400.0, "administration"));
        list.add(new Employee("Jonas", 800.0, "store"));
        list.add(new Employee("Ona", 900.0, "sales"));
        list.add(new Employee("Petras", 1200.0, "sales"));
        list.add(new Employee("Ada", 1500.0, "administration"));

        // atspausdinti tuos kurie uzdirba daugiau nei 900
        System.out.println("visi >900:");
        filter(list, 900.0);

        // atspausdinti tuos kurie uzdirba daugiau nei 900
        // ir dirba administracijoje
        System.out.println(">900 is administracijos:");
        Check<Employee> check = new Check<Employee>() {
            @Override
            public boolean test(Employee e) {
                return e.getSalary() > 900 &&
                        e.getDepartment().equals("administration");
            }
        };
        filterByFilter(list, check);

        System.out.println(">1400 is administracijos:");
        filterByFilter(list, e ->
                        e.getSalary() > 1400 &&
                                e.getDepartment().equals("administration")
        );

        System.out.println("<1000 is visur:");
        filterByFilter(list, x -> x.getSalary() < 1000);


        System.out.println("Pagal atlyginimo mazejima:");
        list.sort((o1, o2) -> {
            int b = 2;
            return Double.compare(o2.getSalary(), o1.getSalary() * b);
        });
        for (Employee e : list) {
            System.out.println(e);
        }


//        Collections.sort(list, (a, b) -> {
//            int comp = a.getDepartment().compareTo(b.getDepartment());
//            if (comp != 0) return comp;
//            comp = a.getName().compareTo(b.getName());
//            return comp;
//        });
//        System.out.println(list);
    }

    public static void filter(List<Employee> list, double salary) {
        for (Employee e : list) {
            if (e.getSalary() > salary) {
                System.out.println(e);
            }
        }
    }

    public static void filterByFilter(List<Employee> list, Check<Employee> filter) {
        for (Employee e : list) {
            if (filter.test(e)) {
                System.out.println(e);
            }
        }
    }

    @FunctionalInterface
    interface Check<T> {

        boolean test(T e);

    }

}
