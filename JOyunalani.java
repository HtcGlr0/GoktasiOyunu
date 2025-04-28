import java.awt.BorderLayout;
import java.awt.Color;
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

        oyunCizmePanel oyunPanel = new oyunCizmePanel();

        this.add(oyunPanel, BorderLayout.CENTER);

        ScheduledThreadPoolExecutor calistir = new ScheduledThreadPoolExecutor(5);
        calistir.scheduleAtFixedRate(new EkraniTemizle(this), 0L, 20L, TimeUnit.MILLISECONDS);
        this.setVisible(true); 
    }
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

        public static ArrayList<JGoktasi> GokTaslari = new ArrayList<JGoktasi>();

        int[] cokgenXArray = JGoktasi.hbCokgenXArray;
        int[] cokgenYArray = JGoktasi.hbCokgenYArray;
        
        int genislik = JOyunalani.oyunAlaniGenislik;
        int yukseklik = JOyunalani.oyunAlaniYukseklik; 

        public oyunCizmePanel(){

            for(int i=0 ; i<50 ; i++){

                int rastXBasPoz = (int) (Math.random() * (JOyunalani.oyunAlaniGenislik - 40) + 1);
                int rastYBasPoz = (int) (Math.random() * (JOyunalani.oyunAlaniYukseklik - 40) + 1);

                GokTaslari.add(new JGoktasi(JGoktasi.getCokgenXArray(rastXBasPoz), JGoktasi.getCokgenYArray(rastYBasPoz), 13, rastXBasPoz, rastYBasPoz));
            }
            
        }

        public void paint(Graphics g){
            Graphics2D grafikAyarlari = (Graphics2D) g;

            grafikAyarlari.setColor(Color.BLACK);
            grafikAyarlari.fillRect(0, 0, getWidth(), getHeight());

            grafikAyarlari.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            grafikAyarlari.setPaint(Color.WHITE);

            for(JGoktasi tas : GokTaslari){
                tas.hareketEt();
                grafikAyarlari.draw(tas);
            }
        } 
}
