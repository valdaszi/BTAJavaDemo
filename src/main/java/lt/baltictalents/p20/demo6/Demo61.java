package lt.baltictalents.p20.demo6;

/**
 * demo
 * Created by valdas on 11/10/2018.
 */
public class Demo61 {

    public static void main(String[] args) {

        D61Node d = new D61Node("d");
        D61Node e = new D61Node("e");

        D61Node b = new D61Node("b");
        b.setChildL(d);
        b.setChildR(e);

        D61Node c = new D61Node("c");

        D61Node a = new D61Node("a");
        a.setChildL(b);
        a.setChildR(c);

        spausdinti(a);
    }

    public static void spausdinti(D61Node root) {
        //???
    }

}

class D61Node {
    String name;
    D61Node childL, childR;

    public D61Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public D61Node getChildL() {
        return childL;
    }

    public void setChildL(D61Node childL) {
        this.childL = childL;
    }

    public D61Node getChildR() {
        return childR;
    }

    public void setChildR(D61Node childR) {
        this.childR = childR;
    }
}
