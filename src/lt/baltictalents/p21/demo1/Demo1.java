package lt.baltictalents.p21.demo1;

public class Demo1 {

    public static void main(String... args) {

        String s1 = "Sveiki";

        System.out.println(s1);

        String s2 = new String("Viso");

        System.out.println(s2);

        char[] chars = { 'L', 'a', 'b', 'a', 's' };

        String s3 = new String(new char[] { 'L', 'a', 'b', 'a', 's' });

        System.out.println(s3);

        String s4 = new String(new char[] { 'L', 'a', 'b', 'a', 's' }, 3, 2);

        System.out.println(s4);

    }
}
