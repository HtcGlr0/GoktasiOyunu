import java.awt.Polygon;

class JGoktasi extends Polygon {
    int uSolXpoz, uSolYPoz;

    int xYonu = 1;
    int yYonu = 1;

    int genislik = JOyunalani.oyunAlaniGenislik;
    int yukseklik = JOyunalani.oyunAlaniYukseklik;

    int [] cokgenXArray , cokgenYArray;
    
    public static int[] hbCokgenXArray = {10,17,26,34,27,36,26,14,8,1,5,1,10};
    public static int[] hbCokgenYArray = {10,17,26,34,27,36,26,14,8,1,5,1,10};

    public JGoktasi (int [] cokgenXArray, int [] cokgenYArray, int cokgenNokta, int rastXBasXPoz, int rastYBasYPoz){

        super(cokgenXArray,  cokgenYArray, cokgenNokta);

        this.xYonu = (int) (Math.random() * 4 + 1);
        this.yYonu = (int) (Math.random() * 4 + 1);

        this.uSolXpoz = rastXBasXPoz;
        this.uSolYPoz = rastYBasYPoz;
    }

    public void hareketEt(){

        int uSolXpoz = super.xpoints[0];
        int uSolYPoz = super.xpoints[0];

        if( uSolXpoz < 0  || (uSolXpoz+25) > genislik) xYonu = xYonu;
        if( uSolXpoz < 0  || (uSolXpoz+25) > yukseklik) yYonu = yYonu;


    }


    
}
