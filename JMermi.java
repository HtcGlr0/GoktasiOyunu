import java.awt.Polygon;
import java.awt.Rectangle;


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

    public void setXHiz(double xHiz){this.xHiz = xHiz;}
    public void setYHiz(double yHiz){this.yHiz = yHiz;}

    public int getGenislik(){return mermiGenislik;}
    public int getYukseklik(){return mermiYukseklik;}

    public void setHareketAcisi(double hareketAcisi){this.hareketAcisi = hareketAcisi;}
    public double getHareketAcisi(){return hareketAcisi;}

    public Rectangle getSekme(){
        return new Rectangle((int) getXOrtala()-6, (int) getYOrtala()-6, getGenislik(), getYukseklik());
    }

    public double mermiXHareketAcisi(double xHareketAcisi){
        return(double) (Math.cos(xHareketAcisi * Math.PI/180));
    }

    public double mermiYHareketAcisi(double yHareketAcisi){
        return(double) (Math.sin(yHareketAcisi * Math.PI/180));
    }

    public void hareketEt(){
        if(this.ekranda){
            this.xPozisyonDegistir(this.getXHiz());
            if(this.getXOrtala() < 0){
                this.ekranda = false;
            }
            else if (this.getXOrtala() > oAGenislik) {
                this.ekranda = false;  
            }

            this.yPozisyonDegistir(this.getYHiz());
            if(this.getYOrtala() < 0){
                this.ekranda = false;
            }
            else if (this.getYOrtala() > oAYukseklik) {
                this.ekranda = false;  
            }
        }
    }

    
}
