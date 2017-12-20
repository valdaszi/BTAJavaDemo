package lt.baltictalents.p06.pratimas1;

public class Mokinys {

    String name;

    int[] a;

    public Mokinys(String name, int[] a) {
        this.name = name;
        this.a = a;
    }

    double vidurkis() {
        double suma = 0;
        for (int p : this.a) {
            suma += p;
        }
        return suma / this.a.length;
    }
}
