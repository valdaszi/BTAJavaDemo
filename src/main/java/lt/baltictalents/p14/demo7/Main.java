package lt.baltictalents.p14.demo7;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> listI = new ArrayList<Integer>();
        List<? extends Number> listN;

        listN = listI;

        listN = new ArrayList<BigDecimal>();

        print(listI);
        print(listN);
    }

    static <T extends Number> void print(List<T> listas) {
        for (T o : listas) {
            System.out.println(o);
        }
    }
    
}
