package lt.baltictalents.p10.demo1;

public class Main {

    public static void main(String[] args) {

        int a = 11;
        Integer b = new Integer(3);

        System.out.println(a / b.intValue());
        System.out.println(a / b.doubleValue());

        Double c = null;
        System.out.println(a / c.doubleValue());
    }
}
