package lt.baltictalents.p09.demo3;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("Jonas");
        employee.setSalary(20);
        System.out.println(employee.getName() + " rate " + employee.getSalary() + "€/hour");
        System.out.println(employee.getName() + " rate " + employee.getTotal(25) + "€/hour");

    }
}
