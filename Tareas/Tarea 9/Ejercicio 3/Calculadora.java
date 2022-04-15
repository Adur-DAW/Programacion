import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora extends JPanel implements ActionListener {
    protected JButton botonSumar, botonRestar, botonMultiplicar, botonDividir;
    protected JTextField numero1Field;
    protected JTextField numero2Field;

    protected Numero numero;

    public Calculadora()
    {
        numero = new Numero();

        numero1Field = crearField("actualizarNumero1");
        numero2Field = crearField("actualizarNumero2");

        add(numero1Field);
        add(numero2Field);

        botonSumar = crearBoton("Sumar", "sumar");
        botonRestar = crearBoton("Restar", "restar");
        botonMultiplicar = crearBoton("Multiplicar", "multiplicar");
        botonDividir = crearBoton("Dividir", "dividir");

        add(botonSumar);
        add(botonRestar);
        add(botonMultiplicar);
        add(botonDividir);
    }

    private JTextField crearField(String comando)
    {
        JTextField nuevoField = new JTextField(10);
        nuevoField.setPreferredSize( new Dimension( 200, 24 ) );
        nuevoField.setActionCommand(comando);
        nuevoField.addActionListener(this);

        return nuevoField;
    }

    private JButton crearBoton(String texto, String comando)
    {
        JButton nuevoBoton = new JButton(texto);
        nuevoBoton.setVerticalTextPosition(AbstractButton.CENTER);
        nuevoBoton.setHorizontalTextPosition(AbstractButton.LEFT);
        nuevoBoton.setMnemonic(KeyEvent.VK_D);
        nuevoBoton.setActionCommand(comando);
        nuevoBoton.addActionListener(this);

        return nuevoBoton;
    }

    public void actionPerformed(ActionEvent e)
    {
        numero.setNumero1(numero1Field.getText());
        numero.setNumero2(numero2Field.getText());

        if (e.getActionCommand().equals("sumar"))
            mostrarResultado(numero.sumar());
        else if (e.getActionCommand().equals("restar"))
            mostrarResultado(numero.restar());
        else if (e.getActionCommand().equals("multiplicar"))
            mostrarResultado(numero.multiplicar());
        else  if (e.getActionCommand().equals("dividir"))
            mostrarResultado(numero.dividir());
    }

    private void mostrarResultado(int resultado)
    {
        JOptionPane.showMessageDialog(null, "El resultado es: " + Integer.toString(resultado));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.addWindowListener(new WindowAdapter() {
            public void windowclosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.getContentPane().add(new Calculadora(),BorderLayout.CENTER);
        frame.setPreferredSize(new Dimension(250, 200));
        frame.pack();
        frame.setVisible(true);
    }
}