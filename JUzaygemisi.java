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

    public double getXOrtala(){return ortalaX;}
    public double getYOrtala(){return ortalaY;}

    public void setXOrtala(double ortX){this.ortalaX = ortX;}
    public void setYOrtala(double ortY){this.ortalaY = ortY;}

    public void xPozArttir(double PozArt){this.ortalaX = PozArt;}
    public void yPozArttir(double PozArt){this.ortalaY = PozArt;}

    public double getUSolXPoz(){return uSolXPoz;}
    public double getUSolYPoz(){return uSolYPoz;}

    public void setUSolXPoz(double usXPoz){this.uSolXPoz = usXPoz;}
    public void setUSolYPoz(double usYPoz){this.uSolYPoz = usYPoz;}
    
}
