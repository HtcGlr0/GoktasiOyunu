import java.awt.Polygon;


@SuppressWarnings("serial")
public class JMermi extends Polygon {

    int oAGenislik = JOyunalani.oyunAlaniGenislik;
    int oAYukseklik = JOyunalani.oyunAlaniYukseklik;

    private double ortalaX = 0, ortalaY = 0;

    public static int[] cokgenXArray = {-3, 3, 3, -3, -3};
    public static int[] cokgenYArray = {-3, 3, 3, -3, -3};

    private int mermiGenislik = 6, mermiYukseklik = 6;

    public boolean ekranda = false;

    private double hareketAcisi = 0;

    private double xHiz = 5, yHiz = 5;

    public JMermi(double ortalaX, double ortalaY, double hareketAcisi){
        super(cokgenXArray, cokgenYArray, 5);
        this.ortalaX = ortalaX;
        this.ortalaY = ortalaY;
        this.hareketAcisi = hareketAcisi;

        this.setXHiz(this.mermiXHareketAcisi(hareketAcisi)*10);
        this.setYHiz(this.mermiYHareketAcisi(hareketAcisi)*10);

    }

    public double getXOrtala(){return ortalaX;}
    public double getYOrtala(){return ortalaY;}

    public void setXOrtala(double ortalaX){this.ortalaX = ortalaX;}
    public void setYOrtala(double ortalaY){this.ortalaY = ortalaY;}

    public void xPozisyonDegistir(double Arttir){this.ortalaX += Arttir;}
    public void yPozisyonDegistir(double Arttir){this.ortalaY += Arttir;}

    public double getXHiz(){return xHiz;}
    public double getYHiz(){return yHiz;}

    public void getXHiz(double xHiz){this.xHiz = xHiz;}
    public void getYHiz(double yHiz){this.yHiz = yHiz;}

    public int getGenislik(){return mermiGenislik;}
    public int getYukseklik(){return mermiYukseklik;}
    
}
