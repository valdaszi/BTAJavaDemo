package lt.baltictalents.p25.demo3;

public class Demo3 {

    public static void main(String... args) {

        System.out.println("length: " + args.length);
        for (String arg : args) {
            System.out.println('"' + arg + '"');
        }
    }
}
