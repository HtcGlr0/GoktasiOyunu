import java.awt.Polygon;
/*import org.w3c.dom.html.HTMLOptGroupElement;*/
import java.util.ArrayList;
import java.awt.Rectangle;



class JGoktasi extends Polygon {
    int uSolXpoz, uSolYPoz;

    int xYonu = 1;
    int yYonu = 1;
    
    int goktasiGenislik = 26;
    int goktasiYukseklik = 31;

    int genislik = JOyunalani.oyunAlaniGenislik;
    int yukseklik = JOyunalani.oyunAlaniYukseklik;

     public static ArrayList<JGoktasi> GokTaslari = new ArrayList<JGoktasi>();

    int [] cokgenXArray , cokgenYArray;


    public static int[] hbCokgenXArray = {45, 54, 63, 72, 81, 90, 84, 78, 72, 63, 54, 48, 42};
    
    public static int[] hbCokgenYArray = {15, 12, 9, 12, 15, 21, 27, 33, 39, 42, 45, 42, 36};
    


    public JGoktasi (int [] cokgenXArray, int [] cokgenYArray, int cokgenNokta, int rastXBasPoz, int rastYBasPoz){

        super(cokgenXArray,  cokgenYArray, cokgenNokta);

        this.xYonu = (int) (Math.random() * 4 + 1);
        this.yYonu = (int) (Math.random() * 4 + 1);

        this.uSolXpoz = rastXBasPoz;
        this.uSolYPoz = rastYBasPoz;
    }
    //Taşları çarptıracağız ve sekecek
    public Rectangle getSekme(){
        return new Rectangle(super.xpoints[0], super.ypoints[0], goktasiGenislik, goktasiYukseklik);
    }





    //Göktaşı hareket ettirme metodu
    public void hareketEt(){

        Rectangle tasKontrol = this.getSekme();

        for(JGoktasi tas : GokTaslari){
            Rectangle digerTas = tas.getSekme();

            if(tas != this && digerTas.intersects(tasKontrol)){

                int rastXYonu = this.xYonu;
                int rastYYonu = this.yYonu;

                this.xYonu = tas.xYonu;
                this.yYonu = tas.yYonu;

                tas.xYonu = rastXYonu;
                tas.yYonu = rastYYonu;
            }
        }


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
