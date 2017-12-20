package lt.baltictalents.uzdaviniai;

public class Main {

    public static void main(String... args) {

        int s = 0;
        for (int i = 0; i < 1000000; i++) {
            boolean r = random();
            if (r) {
                s++;
            } else {
                s--;
            }

        }
        System.out.println(s);
    }

    static boolean random() {
        double r = Math.random();
        if (r < 0.5) {
            return true;
        } else {
            return false;
        }
    }

}
