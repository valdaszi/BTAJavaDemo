package lt.baltictalents.uzdaviniai.chess;

import java.util.Scanner;

/**
 * demo
 * Created by valdas on 2018-02-07.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int ejimoNr = 1;
        boolean sachas = false;
        boolean matas = false;
        int[] shakh = new int[]{0, 3, 1, 1, 1};

        while (true) {

            // metodo figura taip kerta testas
            F[][] padetis2 = Padetis.padetis.clone();
            for (int i = 0; i < Padetis.padetis.length; i++) {
                padetis2[i] = Padetis.padetis[i].clone();
            }

            //nupiesiamos lenta ir debuginimo lenta
            System.out.println("          Zaidimo padeties lenta                     Debug informacijos lenta");
            System.out.println("  --------------------------------------      --------------------------------------");
            for (int i = 8; i >= 1; i--) {
                System.out.print("" + i + ' ' + '|' + ' ');
                for (int j = 1; j <= 8; j++) {
                    System.out.print("" + Padetis.padetis[j][i].piesinys + ' ' + '|' + ' ');
                }
                System.out.print("" + ' ' + ' ' + ' ' + (i) + ' ' + '|' + ' ');
                for (int j = 1; j <= 8; j++) {
                    System.out.print("" + padetis2[j][i].piesinys + ' ' + '|' + ' ');
                }
                System.out.println("");
                System.out.println("  --------------------------------------      --------------------------------------");
            }
            System.out.println("    A 　 B 　 C 　 D 　 E 　 F 　 G 　 H           A 　 B 　 C 　 D 　 E 　 F 　 G 　 H");


            if (sachas) System.out.println("Šachas !!!!!!!!!!!");
            if (matas) System.out.println("Matas ????????????");

            int isX, isY, iX, iY;
            while (true) {
                System.out.print((ejimoNr % 2 == 0 ? "Juoduju" : "Baltuju") + " ejimas: ");
                String bandEjimas = scanner.nextLine();

                //Jei ejimas nurodomas ne 4 simboliu ejimo kodu, prasom ivesti ejima is naujo
                if (bandEjimas.length() != 4) continue;

                char[] ejimas = bandEjimas.toCharArray();

                // Jei ejimas nurodomas ne teisingu formatu "x0x0", prasom ivesti ejima is naujo
                if (ejimas[0] < 0x61 || ejimas[0] > 0x68 || ejimas[1] < 0x31 || ejimas[1] > 0x38 &&
                        ejimas[2] < 0x61 || ejimas[2] > 0x68 || ejimas[3] < 0x31 || ejimas[3] > 0x38) {
                    continue;
                }

                isX = Character.getNumericValue((char) (ejimas[0] - 0x30));
                isY = Character.getNumericValue(ejimas[1]);
                iX = Character.getNumericValue((char) (ejimas[2] - 0x30));
                iY = Character.getNumericValue(ejimas[3]);

                // jei ivedamas programos uzdarymo kodas "a1a1", iseinam is ciklo (salyga tikrinama dar karta)
                if (isX == 1 && isY == 1 && iX == 1 && iY == 1) break;

                // jei pradiniam laukely nera einanciojo figuros, prasom ivesti ejima is naujo
                if (!Padetis.yraEinanciojoFigura(isX, isY, ejimoNr)) continue;

                // jei galiniame langelyje yra to paties zaidejo figura, prasom ivesti ejima is naujo
                if (Padetis.yraManoFigura(isX, isY, iX, iY)) continue;

                // jei taip figure neina, prasom ivesti ejima is naujo
                if (!Padetis.figuraTaipEina(isX, isY, iX, iY)) {
                    System.out.println(Padetis.taipNeinaPranesimas);
                    continue;
                }

                break;

            }

            // Baigti zaidima, jei irasoma "a1a1"
            if (isX == 1 && isY == 1 && iX == 1 && iY == 1) break;

//            System.out.println("Ejimas: " + isX + isY + iX + iY);

            Padetis.eiti(isX, isY, iX, iY);
            shakh = Padetis.isSachas(ejimoNr % 2);
            sachas = shakh[0] == 1;

            if (sachas) {
                matas = Padetis.isMatas(shakh[1], shakh[2], shakh[3], shakh[4]);
            }

            ejimoNr++;

        }
    }
}
