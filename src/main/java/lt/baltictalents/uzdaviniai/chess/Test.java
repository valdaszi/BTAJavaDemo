package lt.baltictalents.uzdaviniai.chess;

/**
 * demo
 * Created by valdas on 2018-02-07.
 */
public class Test {

    public static void main(String[] args) {
        int[][] masyvas1 = new int[][]{new int[]{1,2}, new int[]{3,4}};
        System.out.println("Pries keitimus: " + masyvas1[0][0] + masyvas1[0][1] + masyvas1[1][0] + masyvas1[1][1]);

        int[][] masyvas2 = masyvas1.clone();
        for (int i = 0; i < masyvas1.length; i++) {
            masyvas2[i] = masyvas1[i].clone();
        }



//        int[][] masyvas2 = masyvas1.clone();

        masyvas2[0][0] = 6;
        masyvas2[0][1] = 7;
        masyvas2[1][0] = 8;
        masyvas2[1][1] = 9;
        System.out.println("keitimai");
        System.out.println("Pirmas" + masyvas1[0][0] + masyvas1[0][1] + masyvas1[1][0] + masyvas1[1][1]);
        System.out.println("Antras" + masyvas2[0][0] + masyvas2[0][1] + masyvas2[1][0] + masyvas2[1][1]);
    }
}
