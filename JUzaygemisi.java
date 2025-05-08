import java.awt.Polygon;

@SuppressWarnings("serial")
public class JUzaygemisi extends Polygon {

    private double xHiz = 0, yHiz = 0;

    int oAGenislik = JOyunalani.oyunAlaniGenislik;
    int oAYukseklik = JOyunalani.oyunAlaniYukseklik;

    private double ortalaX = oAGenislik/2, ortalaY = oAYukseklik/2 ;
    

    public static int[] cokgenXArray = {-13, 14, -13, -5, -13};
    public static int[] cokgenYArray = {-15, 0, 15, 0, -15};

    private int gemiGenislik = 27, gemiYukseklil = 30;

    private double uSolXPoz = getXOrtala() + this.cokgenXArray[0];
    private double uSolYPoz = getYOrtala() + this.cokgenYArray[0];

    private double yonAcisi = 0, hareketAcisi = 0;

    public JUzaygemisi(){
        super(cokgenXArray, cokgenYArray, 5);
    }

}
