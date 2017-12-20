package lt.baltictalents.p21.demo7;

public class Demo7 {

    public static void main(String... args) {

        // matches()

        System.out.println("abc ? a.*: " + "abc".matches("a.*"));
        System.out.println("abc ? ab.: " + "abc".matches("ab."));
        System.out.println("abc ? abb: " + "abc".matches("abb"));

        // replaceFirst()

        System.out.println("ananasas: an -> Nan: " + "ananasas".replaceFirst("an", "Nan"));

        // replaceAll()

        System.out.println("ananasas: an -> Nan: " + "ananasas".replaceAll("an", "Nan"));
        System.out.println("13/12/2018 -> " + "13/12/2018".replaceAll("(\\d+)/(\\d+)/(\\d+)", "$3-$2-$1"));

        // split()

        String[] strings = "ananasas agurkas apelsinas abrikosas".split("as ");
        System.out.println(strings.length + ": ");
        for (String s : strings) System.out.println(s);

        strings = "ananasas agurkas apelsinas abrikosas".split("as ", 2);
        System.out.println(strings.length + ": ");
        for (String s : strings) System.out.println(s);
    }
}
