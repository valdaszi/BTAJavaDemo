package lt.baltictalents.p15.demo1;

import lt.baltictalents.p15.data.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

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
        Predicate<Employee> filter = new Predicate<Employee>() {
            @Override
            public boolean test(Employee e) {
                return e.getSalary() > 900 &&
                        e.getDepartment().equals("administration");
            }
        };
        filterByFilter(list, filter);

        // atspausdinti tuos kurie uzdirba daugiau nei 900
        // ir dirba ne administracijoje
        System.out.println(">900 is ne administracijos:");
        //Predicate<Employee> filter2 = e ->
        //        e.getSalary() > 900 &&
        //                !e.getDepartment().equals("administration");
        //filterByFilter(list, filter2);
        filterByFilter(list, x -> x.getSalary() > 900 &&
                        !x.getDepartment().equals("administration"));

        System.out.println("Pagal atlyginimo mazejima:");
        list.sort((o1, o2) -> {
            //if (o1.getSalary() < o2.getSalary()) return 1;
            //if (o1.getSalary() > o2.getSalary()) return -1;
            //return 0;
            return -Double.compare(o1.getSalary(), o2.getSalary());
        });
        for (Employee e : list) {
            System.out.println(e);
        }

        // Surusiuojame pagal skyrius ir pagal vardus:
        Collections.sort(list, (a, b) -> {
            int comp = a.getDepartment().compareTo(b.getDepartment());
            if (comp != 0) return comp;
            comp = a.getName().compareTo(b.getName());
            return comp;
        });
        System.out.println(list);
    }

    public static void filter(List<Employee> list, double salary) {
        for (Employee e : list) {
            if (e.getSalary() > salary) {
                System.out.println(e);
            }
        }
    }

    public static void filterByFilter(List<Employee> list, Predicate<Employee> filter) {
        for (Employee e : list) {
            if (filter.test(e)) {
                System.out.println(e);
            }
        }
    }
}
