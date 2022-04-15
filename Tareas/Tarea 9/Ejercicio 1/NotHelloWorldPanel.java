import java.awt.*;
import javax.swing.*;

public class NotHelloWorldPanel extends JPanel {
    public static final int MESSAGE_X = 75;
    public static final int MESSAGE_Y = 100;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Not a Hello World Program", MESSAGE_X, MESSAGE_Y);
    }
}