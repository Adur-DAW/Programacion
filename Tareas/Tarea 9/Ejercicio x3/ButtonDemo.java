import java.awt.*;
import java.awt.event.*;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class ButtonDemo extends JPanel implements ActionListener {
    protected JButton b1, b2, b3;

    public ButtonDemo() {
        ImageIcon leftButtonIcon = new ImageIcon("images/right.gif");
        ImageIcon middleButtonIcon = new ImageIcon("images/middle.gif");
        ImageIcon rightButtonIcon = new ImageIcon("images/left.gif");

        b1 = new JButton("Deshabilita el botón central", leftButtonIcon);
        b1.setVerticalTextPosition(AbstractButton.CENTER);
        b1.setHorizontalTextPosition(AbstractButton.LEFT);
        b1.setMnemonic(KeyEvent.VK_D);
        b1.setActionCommand("disable");
        b2 = new JButton("Botón central", middleButtonIcon);
        b2.setVerticalTextPosition(AbstractButton.BOTTOM);
        b2.setHorizontalTextPosition(AbstractButton.CENTER);
        b2.setMnemonic(KeyEvent.VK_M);
        b3 = new JButton("Habilita el botón central", rightButtonIcon);

        // Utiliza la alineación de texto por defecto
        b3.setMnemonic(KeyEvent.VK_E);
        b3.setActionCommand("enable");
        b3.setEnabled(false);

        //Escucha por acciones de los botones 1 Y 3
        b1.addActionListener(this);
        b3.addActionListener(this);
        b1.setToolTipText("Haz click sobre este botón para deshabilitar el central.");
        b2.setToolTipText("Este botón no hace nada cuando clickeas sobre él.");
        b3.setToolTipText("Haz click sobre este botón para habilitar el central.");

        // Añade las componentes al contenedor, empleando el gestor de componentes por defecto FlowLayout.
        add(b1);
        add(b2);
        add(b3);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("disable")) {
            b2.setEnabled(false);
            b1.setEnabled(false);
            b3.setEnabled(true);
        } else {
            b2.setEnabled(true);
            b1.setEnabled(true);
            b3.setEnabled(false);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ButtonDemo");
        frame.addWindowListener(new WindowAdapter() {
            public void windowclosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.getContentPane().add(new ButtonDemo(),BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}