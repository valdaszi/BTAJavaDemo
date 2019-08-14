package lt.baltictalents.p21.demo5;

public class Demo5 {

    public static void main(String... args) {

                  //0123456789012345678901234567890123456789
        String s = "Geri vyrai geroj girioj gerą girą gers";
        System.out.println(s);

        // indexOf(), lastIndexOf()

        System.out.println("indexOf(ger) = " + s.indexOf("ger"));
        System.out.println("indexOf(ger, 20) = " + s.indexOf("ger", 20));
        System.out.println("lastIndexOf(ger) = " + s.lastIndexOf("ger"));
        System.out.println("indexOf(ger) = " + s.indexOf("ger"));
        System.out.println("indexOf(geg) = " + s.indexOf("geg"));

        // replace()
        System.out.println("replace(ger, Gier) = " + s.replace("ger", "Gier"));

    }
}
