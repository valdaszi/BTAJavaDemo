package lt.baltictalents.p21.demo4;

public class Demo4 {

    public static void main(String... args) {

                  //01234567890123456789
        String s = "AĄBCČDEĘėfghijklmnop";
        System.out.println(s);

        // startsWith()

        System.out.println("AĄ... " + s.startsWith("AĄ"));
        System.out.println("AA... " + s.startsWith("AA"));
        System.out.println("...ĄBC... " + s.startsWith("ĄBC", 1));

        // endsWith()

        System.out.println("...mnop " + s.endsWith("mnop"));
        System.out.println("...pp " + s.endsWith("pp"));

        // regionMatches()

        System.out.println(s.regionMatches(12, "01234ijkl", 4, 3));
        System.out.println(s.regionMatches(12, "01234ijkl", 5, 3));
        System.out.println(s.regionMatches(12, "01234ijkl", 6, 3));
        System.out.println(s.regionMatches(13, "01234ijkl", 6, 3));

        // substring()

        System.out.println(s.substring(10));
        System.out.println(s.substring(10, 12));

    }
}
