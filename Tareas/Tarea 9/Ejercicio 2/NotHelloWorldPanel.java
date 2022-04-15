import java.awt.*;
import javax.swing.*;

public class NotHelloWorldPanel extends JPanel {
    public static final int MESSAGE_X = 75;
    public static final int MESSAGE_Y = 100;

    private Font f;
    private Font fi;
    private FontMetrics fm;
    private FontMetrics fim;
    public void setFonts(Graphics g){
        if(f!=null) return;
        f = new Font("SansSerif", Font.BOLD, 14);
        fi = new Font("SansSerif", Font.BOLD + Font.ITALIC, 14);
        fm = g.getFontMetrics(f);
        fim = g.getFontMetrics(fi);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        setFonts(g);
        String s1 = "Not a ";
        String s2 = "Hello world";
        String s3 = " Program";
        int w1 = fm.stringWidth(s1);
        int w2 = fm.stringWidth(s2);
        int w3 = fm.stringWidth(s3);
        Dimension d = getSize();
        int cx = (d.width - w1 - w2 - w3) / 2;
        int cy = (d.height - fm.getHeight()) / 2 + fm.getAscent();
        g.setFont(f);
        g.drawString(s1, cx, cy);
        cx += w1;
        g.setFont(fi);
        g.drawString(s2, cx, cy);
        cx += w2;
        g.setFont(f);
        g.drawString(s3, cx, cy);
    }
}