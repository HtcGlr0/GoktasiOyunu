import java.awt.Polygon;

@SuppressWarnings("serial")
public class JUzaygemisi extends Polygon {
    int uSolXpoz = 500;
    int uSolYPoz = 400;

    int xYonu = 0;
    int yYonu = 0;

    int genislik = JOyunalani.oyunAlaniGenislik;
    int yukseklik = JOyunalani.oyunAlaniYukseklik;

    public static int[] cokgenXArray = {-13, 14, -13, -5, -13};
    public static int[] cokgenYArray = {-15, 0, 15, 0, -15};

    static int yonAcisi = 0;

    public JUzaygemisi(){
        super(cokgenXArray, cokgenYArray, 5);
    }

    public void hareketEt(){
        /* 
        int uSolXpoz = super.xpoints[0];
        int uSolYpoz = super.ypoints[0];

        if( uSolXpoz < 0  || (uSolXpoz+25) > genislik) xYonu = -xYonu;
        if( uSolXpoz < 0  || (uSolXpoz+50) > yukseklik) yYonu = -yYonu;

        for(int i=0; i < super.xpoints.length; i++){
            super.xpoints[i] += xYonu;
            super.ypoints[i] += yYonu;
        } */

        super.xpoints = JUzaygemisi.cokgenXArray;
        super.ypoints = JUzaygemisi.cokgenYArray;
    }
    



}
