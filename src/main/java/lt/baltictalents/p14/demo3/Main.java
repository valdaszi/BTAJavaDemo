package lt.baltictalents.p14.demo3;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        // Galima i eile prideti "String" tipo elementus
        Queue<String> queue = new Queue();
        queue.push("Pirmas");
        queue.push("Antras");
        queue.push("Trečias");
        queue.push("Ketvirtas");
        //queue.push( 5);

        queue.pull();

        System.out.println(queue);

        // Galima i sita eile prideti "Integer" tipo elementus
        Queue<Integer> q2 = new Queue<>();
        q2.push(100);
        q2.push(200);
        System.out.println("pull: " + q2.pull());
        System.out.println("pull: " + q2.pull());
        System.out.println("pull: " + q2.pull());
        q2.push(300);
        //q2.push("400");

        System.out.println(q2);

        Queue<Number> q = new Queue<>();
        q.push(1);
        q.push(1.5);
        q.push(BigDecimal.valueOf(123.45454545454));
        //q.push("10");

        double suma = 0;
        Number n;
        while ((n = q.pull()) != null) {
            suma += n.doubleValue();
        }
        System.out.println("Suma " + suma);
    }
}
