import java.awt.BorderLayout;
import java.awt.color.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.swing.JComponent; 
import javax.swing.JFrame;


public class JOyunalani extends JFrame {
    public static int oyunAlaniGenislik = 1000;
    public static int oyunAlaniYukseklik = 800;

    public static void main(String[] args) {
        new JOyunalani();
    }

    public JOyunalani(){
        this.setSize(oyunAlaniGenislik, oyunAlaniYukseklik);
        this.setTitle("ProPhpHocam Java Uzay Oyunu");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(oyunPanel, BorderLayout.CENTER);

        ScheduledThreadPoolExecutor calistir = new ScheduledThreadPoolExecutor(5);
        calistir.scheduleAtFixedRate(new EkraniTemizle(this), 0L, 20L, TimeUnit.MILLISECONDS);
        this.setVisible(true); 
    }

    class EkraniTemizle implements Runnable{

        JOyunalani oyunAlani;

        public EkraniTemizle(JOyunalani oyunAlani){
            this.oyunAlani = oyunAlani;
        }

        public void run(){
            oyunAlani.repaint();
        }
    }

    @SuppressWarnings("serial")

    class oyunCizmePanel extends JComponent{

        public static ArrayList<Goktasi> GokTaslari = new ArrayList<Goktasi>();

        int[] cokgenXArray = Goktasi.hbCokgenXArray;
        int[] cokgenYArray = Goktasi.hbCokgenYArray;
        
        int genislik = JOyunalani.oyunAlaniGenislik;
        int yukseklik = JOyunalani.oyunAlaniYukseklik;

        public oyunCizmePanel(){
            
        }
    }


    
}
