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


    
}
