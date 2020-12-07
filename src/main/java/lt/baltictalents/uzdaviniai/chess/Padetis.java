package lt.baltictalents.uzdaviniai.chess;

import java.util.Scanner;

public class Padetis {

    static F[][] padetis = {
            {null, null, null, null, null, null, null, null},
            {null, F.B, F.P, F.o, F.o, F.o, F.o, F.p, F.b},
            {null, F.Z, F.P, F.o, F.o, F.o, F.o, F.p, F.z},
            {null, F.R, F.P, F.o, F.o, F.o, F.o, F.p, F.r},
            {null, F.V, F.P, F.o, F.o, F.o, F.o, F.p, F.v},
            {null, F.K, F.P, F.o, F.o, F.o, F.o, F.p, F.k},
            {null, F.R, F.P, F.o, F.o, F.o, F.o, F.p, F.r},
            {null, F.Z, F.P, F.o, F.o, F.o, F.o, F.p, F.z},
            {null, F.B, F.P, F.o, F.o, F.o, F.o, F.p, F.b},
    };

//    // sita dalis atkomentuojama, jei debuginimo tikslais reikalinga ne pradine lentos padetis
//    static {
//        padetis = new F[][]{
//                {null, null, null, null, null, null, null, null},
//                {null, F.B, F.o, F.o, F.o, F.o, F.o, F.p, F.o},
//                {null, F.o, F.P, F.o, F.o, F.o, F.o, F.p, F.o},
//                {null, F.V, F.o, F.o, F.o, F.o, F.o, F.o, F.o},
//                {null, F.o, F.o, F.o, F.o, F.o, F.o, F.o, F.o},
//                {null, F.K, F.P, F.o, F.o, F.o, F.o, F.p, F.k},
//                {null, F.o, F.P, F.o, F.o, F.o, F.o, F.p, F.o},
//                {null, F.o, F.P, F.o, F.o, F.o, F.o, F.p, F.o},
//                {null, F.B, F.o, F.o, F.o, F.o, F.o, F.p, F.b},
//        };
//    }


    private static int[][] karaliausKoord = new int[][]{new int[]{5,1}, new int[]{5,8}}; // Baltuju / Juoduju
    private static boolean[][] judinta = new boolean[9][9];
    private static int[] priesTaiEjimas = new int[4];
    private static boolean prasilenkiantisKirtimas = false;
    private static boolean sachas;
    public static String taipNeinaPranesimas;

    public static void eiti(int isX, int isY, int iX, int iY) {

        System.out.println("Eina " + padetis[isX][isY].figName + " Is:" + isX + "," + isY + " I:" + iX + "," + iY);

        if (padetis[isX][isY] == F.P && iY == 8) { //baltuju pestininkas pasieke lentos gala
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Kokia figura pasirenkate? v / b / r / z: ");
                char pasirinkta = scanner.nextLine().toCharArray()[0];
                if      (pasirinkta == 'v') { padetis[iX][iY] = F.V; padetis[isX][isY] = F.o; break; }
                else if (pasirinkta == 'b') { padetis[iX][iY] = F.B; padetis[isX][isY] = F.o; break; }
                else if (pasirinkta == 'r') { padetis[iX][iY] = F.R; padetis[isX][isY] = F.o; break; }
                else if (pasirinkta == 'z') { padetis[iX][iY] = F.Z; padetis[isX][isY] = F.o; break; }
            }
        } else if (padetis[isX][isY] == F.P && iY == 1) {  //juoduju pestininkas pasieke lentos gala
            Scanner scanner = new Scanner(System.in);
            for (;;) {
                System.out.println("Kokia figura pasirenkate? v / b / r / z: ");
                char pasirinkta = scanner.nextLine().toCharArray()[0];
                if      (pasirinkta == 'v') { padetis[iX][iY] = F.v; padetis[isX][isY] = F.o; break; }
                else if (pasirinkta == 'b') { padetis[iX][iY] = F.b; padetis[isX][isY] = F.o; break; }
                else if (pasirinkta == 'r') { padetis[iX][iY] = F.r; padetis[isX][isY] = F.o; break; }
                else if (pasirinkta == 'z') { padetis[iX][iY] = F.z; padetis[isX][isY] = F.o; break; }
            }
        } else {
            if (prasilenkiantisKirtimas) {
                padetis[iX][isY] = F.o;
                prasilenkiantisKirtimas = false;
            }
            if (padetis[isX][isY].figName.compareTo("Karalius") == 0 && isY == iY && Math.abs(isX-iX) == 2) { // rokiruote
                if (isX-iX == 2) {                                        //ilgoji rokiruote 0-0-0
                    eiti(1, isY,4, isY);
                } else {                                                  // trumpoji rokiruote 0-0
                    eiti(8, isY,6, isY);
                }
            }

            padetis[iX][iY] = padetis[isX][isY];
            padetis[isX][isY] = F.o;
            judinta[isX][isY] = true;

            // Jei paeina karalius, nustatoma nauja karaliaus koordinate (reikalinga sacho detekcijai)
            if (padetis[iX][iY].figName.compareTo("Karalius") == 0) {
                int spalva = padetis[iX][iY].figSpalv.compareTo("Baltuju") == 0 ? 0:1;
                karaliausKoord[spalva][0] = iX;
                karaliausKoord[spalva][1] = iY;
            }

            priesTaiEjimas[0] = isX; priesTaiEjimas[1] = isY; priesTaiEjimas[2] = iX; priesTaiEjimas[3] = iY;
        }

    }

    //Tikrinama, ar pradinime langelyje einanciojo zaidejo yra figura
    public static boolean yraEinanciojoFigura(int isX, int isY, int ejimoNr) {
        if (ejimoNr%2 == 1) {
            if (padetis[isX][isY].figSpalv.compareTo("Baltuju") != 0) {
                System.out.println("Pradiniame laukelyje nera baltuju figuros");
                return false;
            }
        } else {
            if (padetis[isX][isY].figSpalv.compareTo("Juoduju") != 0) {
                System.out.println("Pradiniame laukelyje nera juoduju figuros");
                return false;
            }
        }
        return true;
    }

    //Tikrinama, ar galiniame langelyje yra to paties zaidejo figura
    public static boolean yraManoFigura(int isX, int isY, int iX, int iY) {
        if (padetis[isX][isY].figSpalv.equals(padetis[iX][iY].figSpalv)) {
            System.out.println("Galiniame laukelyje yra to paties zaidejo figura");
            return true;
        }
        return false;
    }

    //Tikrinama, ar figura gali daryti toki ejima
    public static boolean figuraTaipEina(int isX, int isY, int iX, int iY) {

        if (padetis[isX][isY].figName.compareTo("Pėstininkas") == 0) {

            int spalva = padetis[isX][isY].figSpalv.compareTo("Baltuju") == 0 ? 0 : -1;

            // ejimas vienu i prieki
            if (isX == iX && isY+1+spalva*2 == iY && padetis[iX][iY] == F.o) return true;

            //ejimas dviem i prieki jei pradineje padetyje
            if (isX == iX && isY+2+spalva*4 == iY && isY+(5*spalva) == 2
                    && padetis[iX][iY] == F.o && padetis[isX][isY+1+spalva*2] == F.o) return true;
            //kritimas
            if ((isX+1 == iX || isX-1 == iX) && isY+1+spalva*2 == iY ) { //ejimas pirmyn istrizai
                // paprastas kirtimas
                if ( padetis[iX][iY] != F.o  && padetis[isX][isY].figSpalv.compareTo(padetis[iX][iY].figSpalv) != 0)
                    return true;
                    // prasilenkiantis kirtimas
                else {
                    boolean saliaPesk = padetis[iX][isY].figName.compareTo("Pėstininkas") == 0;
                    boolean saliaKitSpalv = padetis[isX][isY].figSpalv.compareTo( padetis[iX][isY].figSpalv) != 0;
                    boolean priesTaiEjStulp = priesTaiEjimas[2] == iX && priesTaiEjimas[0] == iX;
                    boolean priesTaiEjEil = priesTaiEjimas[1] == 7 && priesTaiEjimas[3] == 5 || priesTaiEjimas[1] == 2 && priesTaiEjimas[3] == 4;

                    if (saliaPesk && saliaKitSpalv && priesTaiEjStulp && (priesTaiEjEil )) {
                        prasilenkiantisKirtimas = true;
                        return true;
                    }
                }
            }
        } else if (padetis[isX][isY].figName.compareTo("Karalius") == 0){
            if (isY == iY && Math.abs(isX-iX) == 2) {                          // rokiruote
                if ( !sachas && !judinta[isX][isY]  ) {                                     //karalius nesachuojamas ir nejudintas
                    if (isX-iX == 2) {                                        //ilgoji rokiruote 0-0-0
                        if (!judinta[1][isY]                                                         // bokstas nejudintas
                                && padetis[2][isY]==F.o && padetis[3][isY]==F.o && padetis[4][isY]==F.o // visas tarpas tuscias
                                && nepuolamasKaralius(3, iY, !padetis[isX][isY].baltieji)         // nepuolamas karaliaus tikslas
                                && nepuolamasKaralius(4, iY, !padetis[isX][isY].baltieji) ){      // nepuolamas karaliaus praeinamas laukelis
                            return true;
                        }
                    } else {                                                  // trumpoji rokiruote 0-0
                        if (!judinta[8][isY]                                                         // bokstas nejudintas
                                && padetis[6][isY]==F.o && padetis[7][isY]==F.o                      // visas tarpas tuscias
                                && nepuolamasKaralius(6, iY, !padetis[isX][isY].baltieji)         // nepuolamas karaliaus tikslas
                                && nepuolamasKaralius(7, iY, !padetis[isX][isY].baltieji)) {      // nepuolamas karaliaus praeinamas laukelis
                            return true;
                        }
                    }
                }
            } else {                                                            // karaliaus ejimas ne rokiruote
                for (byte[] tinkEjimas: padetis[isX][isY].ejimai) {
                    if (isX+tinkEjimas[0] == iX && isY+tinkEjimas[1] == iY) {
                        if ( nepuolamasKaralius(iX, iY, !padetis[isX][isY].baltieji) )               // nepuolamas karaliaus tikslas
                            return true;
                    }
                }
            }

        } else {    //jei ne pestininkas ir ne karalius
            for (byte[] tinkEjimas: padetis[isX][isY].ejimai) {
                for (int i = 1; i <= tinkEjimas[2]; i++) {
                    if (isX+tinkEjimas[0]*i == iX && isY+tinkEjimas[1]*i == iY) {

                        //jei randam, kad duotas ejimas galimas, griztam atgal link prad padeties tikrindami ar nera kliuciu
                        for (int j = i-1; j >= 1; j--) {
                            // jei tarpe tarp prad ir gal tasko yra figura
                            if ( padetis[isX+tinkEjimas[0]*j][isY+tinkEjimas[1]*j] != F.o) {
                                taipNeinaPranesimas = "Pakeliui yra kliutis";
                                return false;
                            }
                        }
                        return true;
                    }
                }
            }
        }

        taipNeinaPranesimas = padetis[isX][isY].figName + " taip neina";
        return false;
    }

    private static boolean nepuolamasKaralius(int x, int y, boolean puolantieji) {
        F tmp = padetis[x][y];
        padetis[x][y] = F.o;
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                if (padetis[i][j].baltieji != null && padetis[i][j].baltieji == puolantieji) {
                    if (figuraTaipKertaKaraliu(i,j,x,y)) {
                        padetis[x][y] = tmp;
                        return false;
                    }
                }
            }
        }
        padetis[x][y] = tmp;
        return true;
    }

    static boolean figuraTaipKertaKaraliu(int isX, int isY, int iX, int iY) {

        for (byte[] tinkEjimas: padetis[isX][isY].ejimai) {
            for (int i = 1; i <= tinkEjimas[2]; i++) {
                if (isX+tinkEjimas[0]*i == iX && isY+tinkEjimas[1]*i == iY) {
                    //jei randam, kad duotas ejimas galimas, griztam atgal link prad padeties tikrindami ar nera kliuciu
                    for (int j = i-1; j >= 1; j--) {
                        // jei tarpe tarp prad ir gal tasko yra figura, iskyrus puolamaji karaliu
                        if ( padetis[isX+tinkEjimas[0]*j][isY+tinkEjimas[1]*j] != F.o &&
                                padetis[isX+tinkEjimas[0]*j][isY+tinkEjimas[1]*j] != (padetis[isX][isY].baltieji?F.k:F.K)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] isSachas(int ejNr) {
        String manoSpalva = ejNr == 1 ? "Baltuju":"Juoduju";
        int[] shakch = new int[]{0,0,0,0,0};
        sachas = false;
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                if (padetis[i][j].figSpalv.compareTo(manoSpalva) == 0 &&
                        figuraTaipEina(i,j,karaliausKoord[ejNr][0],karaliausKoord[ejNr][1])) {
                    sachas = true;
                    shakch = new int[]{1, i, j, karaliausKoord[ejNr][0], karaliausKoord[ejNr][1]};
                    return shakch;
                }
            }
        }
        return shakch;
    }

    static boolean isMatas(int isX, int isY, int iX, int iY) {
        // ar karalius gali kur nors pasitraukti
        System.out.println("Sachas is " + tor(isX) + isY + " i " + tor(iX) + iY);
        for (int i = iX - 1; i <= iX + 1; i++) {
            for (int j = iY - 1; j <= iY + 1; j++) {
                if (i>0 && i<9 && j>0 && j<9) {
                    if (figuraTaipEina(iX, iY, i, j) && !yraManoFigura(iX, iY, i, j)) {
                        System.out.println("Karalius gali pabegti i " + tor(i) + j);
                        return false;
                    }
                    else System.out.println("Karalius negali eiti i " + tor(i) + j);
                }
                else System.out.println("Nera langelio " + tor(i) + j);
            }
        }
        // todo ar galima nukirsti sachuojancia figura
        // todo ar galima uzstoti karaliu
        return true;
    }

    // todo pato detekcija

    // debuginimui reikalinga funkcija, atvercianti skaiciavimo koordinate i raide
    // pvz ejimas ejimas e2e4 skaiciavimams verciamas i 5254. tor(5) = e
    private static char tor(int r) { char raide = '\u0060'; raide += r; return raide;}


}
