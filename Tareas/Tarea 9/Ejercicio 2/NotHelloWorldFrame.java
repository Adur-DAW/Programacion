import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NotHelloWorldFrame extends JFrame
{
    public NotHelloWorldFrame()
    {
        super.setTitle("NotHelloWorld");
        super.setSize(300, 200);

        //Evento cerrar ventana
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Container contentPane = getContentPane();
        contentPane.add(new NotHelloWorldPanel());
    }

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NotHelloWorldFrame().setVisible(true);
            }
        });
    }
}
