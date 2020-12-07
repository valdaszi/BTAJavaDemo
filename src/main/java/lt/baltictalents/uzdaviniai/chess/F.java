package lt.baltictalents.uzdaviniai.chess;

// Cia surasytos visos figuros su pavadinimu, paveiksliuku, galimais ejimais
// Ejimo pirmas skaicius - kryptis X (horizontaliai), antras - kryptis Y (vertikaliai)
// trecias - maksimalus atstumas ta kryptimi

//unikodiniai sachmatai - https://unicode-table.com/en/#miscellaneous-symbols

public enum F {
    //baltieji
    K (true, "Baltuju", "Karalius",   '\u2654', new byte[]{ 1,1,1}, new byte[]{ 1,0,1}, new byte[]{ 1,-1,1}, new byte[]{0, 1,1},
            new byte[]{-1,1,1}, new byte[]{-1,0,1}, new byte[]{-1,-1,1}, new byte[]{0,-1,1}),
    V (true, "Baltuju", "Valdovė",    '\u2655', new byte[]{ 1,1,7}, new byte[]{ 1,0,7}, new byte[]{ 1,-1,7}, new byte[]{0, 1,7},
            new byte[]{-1,1,7}, new byte[]{-1,0,7}, new byte[]{-1,-1,7}, new byte[]{0,-1,7}),
    B (true, "Baltuju", "Bokštas",    '\u2656', new byte[]{-1,0,7}, new byte[]{0,-1,7}, new byte[]{ 1, 0,7}, new byte[]{0, 1,7}),
    R (true, "Baltuju", "Rikis",      '\u2657', new byte[]{-1,1,7}, new byte[]{ 1,1,7}, new byte[]{-1,-1,7}, new byte[]{1,-1,7}),
    Z (true, "Baltuju", "Žirgas",     '\u2658', new byte[]{2,-1,1}, new byte[]{ 2, 1,1}, new byte[]{ 1, 2,1}, new byte[]{-1,2,1},
            new byte[]{-2,1,1}, new byte[]{-2,-1,1}, new byte[]{-1,-2,1}, new byte[]{1,-2,1}),
    P (true, "Baltuju", "Pėstininkas",'\u2659', new byte[]{ 1,1,1}, new byte[]{-1,1,1}),

    //juodieji
    k (false,"Juoduju", "Karalius",   '\u265A', new byte[]{ 1,1,1}, new byte[]{ 1,0,1}, new byte[]{ 1,-1,1}, new byte[]{0, 1,1},
            new byte[]{-1,1,1}, new byte[]{-1,0,1}, new byte[]{-1,-1,1}, new byte[]{0,-1,1}),
    v (false,"Juoduju", "Valdovė",    '\u265B', new byte[]{ 1,1,7}, new byte[]{ 1,0,7}, new byte[]{ 1,-1,7}, new byte[]{0, 1,7},
            new byte[]{-1,1,7}, new byte[]{-1,0,7}, new byte[]{-1,-1,7}, new byte[]{0,-1,7}),
    b (false,"Juoduju", "Bokštas",    '\u265C', new byte[]{ 1,0,7}, new byte[]{ 0,1,7}, new byte[]{-1, 0,7}, new byte[]{0,-1,7}),
    r (false,"Juoduju", "Rikis",      '\u265D', new byte[]{-1,1,7}, new byte[]{ 1,1,7}, new byte[]{-1,-1,7}, new byte[]{1,-1,7}),
    z (false,"Juoduju", "Žirgas",     '\u265E', new byte[]{2,-1,1}, new byte[]{ 2, 1,1}, new byte[]{ 1, 2,1}, new byte[]{-1,2,1},
            new byte[]{-2,1,1}, new byte[]{-2,-1,1}, new byte[]{-1,-2,1}, new byte[]{1,-2,1}),
    p (false,"Juoduju", "Pėstininkas",'\u265F', new byte[]{1,-1,1}, new byte[]{-1,-1,1}),

    o (null, "Tiesiog", "Tuscia", '\u3000'),
    x (null, "Tiesiog", "Tuscia", '\u263A');


    public final Boolean baltieji;
    public final String figSpalv;
    public final String figName;
    public final char piesinys;
    public final byte[][] ejimai;

    F(Boolean baltieji, String figSpalv, String figName, char piesinys, byte[]... ejimai ) {
        this.baltieji = baltieji;
        this.figSpalv = figSpalv;
        this.figName = figName;
        this.piesinys = piesinys;
        this.ejimai = ejimai;
    }

}
