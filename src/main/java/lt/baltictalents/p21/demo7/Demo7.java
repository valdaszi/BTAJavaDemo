package lt.baltictalents.p21.demo7;

public class Demo7 {

    public static void main(String... args) {

        // matches()

        System.out.println("abc ? a.*: " + "abc".matches("a.*"));
        System.out.println("abc ? ab.: " + "abc".matches("ab."));
        System.out.println("abc ? abb: " + "abc".matches("abb"));

        // replaceFirst()

        System.out.println("ananasas: a. -> Nan: " + "ananasas".replaceFirst("a.", "Nan"));

        // replaceAll()

        System.out.println("ananasas: a. -> Nan: " + "ananasas".replaceAll("a.", "Nan"));
        System.out.println("13/12/2018 -> " + "13/12/2018".replaceAll("(\\d+)/(\\d+)/(\\d+)", "$3-$2-$1"));

        // split()

        String[] strings = "ananasas\t agurkas   apelsinas abrikosas".split("as((\\s+)|$)");
        System.out.println(strings.length + ": ");
        for (String s : strings) System.out.println(s);

        strings = "ananasas agurkas apelsinas abrikosas".split("as\\s+", 2);
        System.out.println(strings.length + ": ");
        for (String s : strings) System.out.println(s);

        strings = "aronija2 ananasas,agurkas-apelsinas;abrikosas.arbuzas?agurotis!agrastas_anakardis$avokadas"
                .split("[\\d_\\W]+");
        System.out.println(strings.length + ": ");
        for (String s : strings) System.out.println(s);
    }
}
