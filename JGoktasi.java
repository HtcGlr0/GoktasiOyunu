import java.awt.Polygon;
/*import org.w3c.dom.html.HTMLOptGroupElement;*/



class JGoktasi extends Polygon {
    int uSolXpoz, uSolYPoz;

    int xYonu = 1;
    int yYonu = 1;

    int genislik = JOyunalani.oyunAlaniGenislik;
    int yukseklik = JOyunalani.oyunAlaniYukseklik;

    int [] cokgenXArray , cokgenYArray;
    
    public static int[] hbCokgenXArray = {10,17,26,34,27,36,26,14,8,1,5,1,10};
    public static int[] hbCokgenYArray = {10,17,26,34,27,36,26,14,8,1,5,1,10};

    public JGoktasi (int [] cokgenXArray, int [] cokgenYArray, int cokgenNokta, int rastXBasPoz, int rastYBasPoz){

        super(cokgenXArray,  cokgenYArray, cokgenNokta);

        this.xYonu = (int) (Math.random() * 4 + 1);
        this.yYonu = (int) (Math.random() * 4 + 1);

        this.uSolXpoz = rastXBasPoz;
        this.uSolYPoz = rastYBasPoz;
    }
    //Göktaşı hareket ettirme metodu
    public void hareketEt(){

        int uSolXpoz = super.xpoints[0];
        int uSolYPoz = super.xpoints[0];

        if( uSolXpoz < 0  || (uSolXpoz+25) > genislik) xYonu = -xYonu;
        if( uSolXpoz < 0  || (uSolXpoz+50) > yukseklik) yYonu = -yYonu;

        for(int i=0; i < super.xpoints.length; i++){
            super.xpoints[i] += xYonu;
            super.ypoints[i] += yYonu;
        }

    } //Hareket sonu


    //Göktaşının x noktalarını çağırıyoruz
    public static int[] getCokgenXArray(int rastXBasPoz) {
        int [] rastCokgenXArray = (int[]) hbCokgenXArray.clone(); 
              for(int i=0; i < rastCokgenXArray.length; i++){
                rastCokgenXArray[i] += rastXBasPoz;
              }
        return rastCokgenXArray;

    }


    //Göktaşının y noktalarını çağırıyoruz
    public static int[] getCokgenYArray(int rastYBasPoz) {
        int [] rastCokgenYArray = (int[]) hbCokgenYArray.clone(); 
              for(int i=0; i < rastCokgenYArray.length; i++){
                rastCokgenYArray[i] += rastYBasPoz;
              }
        return rastCokgenYArray;

    }


    
}
