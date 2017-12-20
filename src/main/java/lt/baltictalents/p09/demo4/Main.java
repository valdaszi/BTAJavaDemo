package lt.baltictalents.p09.demo4;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setSalary(20);
        System.out.println(" Salary " + employee.getSalary() + "€/hour");
        System.out.println(" Bonus " + employee.getBonus() + "€/hour");

    }
}
