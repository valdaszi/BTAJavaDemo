package lt.baltictalents.p21.demo2;

public class Demo2 {

    public static void main(String... args) {

        String s = "aąbcčdeęėf".concat("ghijklmnop");

        System.out.println("s = " + s);

        System.out.println("s.lenght() = " + s.length());

        // toCharArray()
        char[] chars = s.toCharArray();

        System.out.print("chars = ");
        for (char c : chars) System.out.print("\'" + c + "\' ");
        System.out.println();

        // getChars()
        char[] dst = {'1', '2', '3', '4', '5', '6'};

        System.out.print("dst (prieš) = ");
        for (char c : dst) System.out.print("\'" + c + "\' ");
        System.out.println();

        s.getChars(2, 4, dst, 3);

        System.out.print("dst (po)    = ");
        for (char c : dst) System.out.print("\'" + c + "\' ");
        System.out.println();

        // charAt()
        System.out.println("s[2] = " + s.charAt(2));
        System.out.println("s[3] = " + s.charAt(3));

    }
}
