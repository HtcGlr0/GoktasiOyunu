import java.awt.Polygon;
import java.awt.Rectangle;

@SuppressWarnings("serial")
public class JUzaygemisi extends Polygon {

    private double xHiz = 0, yHiz = 0;

    int oAGenislik = JOyunalani.oyunAlaniGenislik;
    int oAYukseklik = JOyunalani.oyunAlaniYukseklik;

    private double ortalaX = oAGenislik/2, ortalaY = oAYukseklik/2 ;
    

    public static int[] cokgenXArray = {-13, 14, -13, -5, -13};
    public static int[] cokgenYArray = {-15, 0, 15, 0, -15};

    private int gemiGenislik = 27, gemiYukseklik = 30;

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

    public int getGemiGenislik(){return gemiGenislik;}
    public int getGemiYukseklik(){return gemiYukseklik;}

    public double getXHiz(){return xHiz;}
    public double getYHiz(){return yHiz;}

    public void setXHiz(double xHiz){this.xHiz = xHiz;}
    public void setYHiz(double yHiz){this.yHiz = yHiz;}

    public void xHizArttir(double xHizArt){this.xHiz += xHizArt;}
    public void yHizArttir(double yHizArt){this.yHiz += yHizArt;}

    public void xHizAzalt(double xHizAz){this.xHiz -= xHizAz;}
    public void yHizAzalt(double yHizAz){this.yHiz -= yHizAz;}

    public void setHareketAcisi(double hareketAcisi) {this.hareketAcisi = hareketAcisi;}
    public double getHareketAcisi(){return hareketAcisi;}

    public void setHareketAcisiArttir(double hareketAcisi) {this.hareketAcisi += hareketAcisi;}
    
    public double gemiXHareketAcisi(double aci){
        return Math.cos(Math.toRadians(aci));
    }

    public double gemiYHareketAcisi(double aci){
        return Math.sin(Math.toRadians(aci));
    }

    public double getYonAcisi(){return yonAcisi;}

    public void yonAcisiArttir(){
        if(getYonAcisi() >= 355){yonAcisi = 0;}
        else{yonAcisi += 5;}
    }

     public void yonAcisiAzalt(){
        if(getYonAcisi() < 0){yonAcisi = 355;}
        else{yonAcisi -= 5;}
    }

    public Rectangle getSekme(){
        return new Rectangle((int) getXOrtala() - 14, (int) getYOrtala() - 14, getGemiGenislik(), getGemiYukseklik());

    }

    public double getGemiBurunX(){
        return this.getXOrtala() + Math.cos(Math.toRadians(yonAcisi)) * 14;
    }

    public double getGemiBurunY(){
        return this.getYOrtala() + Math.sin(Math.toRadians(yonAcisi)) * 14;    }

    public void hareketEt(){
        this.xPozArttir(this.getXHiz());
        if(this.getXOrtala() < 0){
            this.setXOrtala(oAGenislik);
        }
        else 
            if(this.getXOrtala() > oAGenislik){
                this.setXOrtala(0);
            }

        this.yPozArttir(this.getYHiz());
        if(this.getYOrtala() < 0){
            this.setYOrtala(oAYukseklik);
        }
        else 
            if(this.getYOrtala() > oAYukseklik){
                this.setYOrtala(0);
            }
        }   


}
