package lt.baltictalents.p06.pratimas1;

public class Mokinys {

    String name;

    int[] a;

    public Mokinys(String name, int[] a) {
        this.name = name;
        this.a = a;
    }

    double vidurkis() {
        if (a == null) return 0;
        int sum = 0;
        for (int p : a) {
            sum += p;
        }
        return (double)sum / a.length;
    }
}
