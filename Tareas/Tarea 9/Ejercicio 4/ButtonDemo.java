import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo extends JPanel implements ActionListener {
    protected JButton boton;
    protected JLabel texto;

    protected int contador;

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public ButtonDemo()
    {
        crearBoton();
        crearContador();
    }

    private void crearContador()
    {
        texto = new JLabel();
        texto.setText(String.valueOf(getContador()));
        texto.setFont(new Font("Arial", Font.BOLD, 30));
        add(texto);
    }

    private void crearBoton()
    {
        boton = new JButton("Incrementar");
        boton.setVerticalTextPosition(AbstractButton.CENTER);
        boton.setHorizontalTextPosition(AbstractButton.LEFT);
        boton.setMnemonic(KeyEvent.VK_D);
        boton.setActionCommand("incrementar");
        boton.addActionListener(this);
        boton.setToolTipText("Haz click sobre este botón para incrementar el contador.");
        add(boton);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("incrementar")) {
            setContador(getContador() + 1);
            texto.setText(String.valueOf(getContador()));
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
        frame.setPreferredSize(new Dimension(250, 200));
        frame.pack();
        frame.setVisible(true);
    }
}