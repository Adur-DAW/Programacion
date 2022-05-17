package tarea10;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;

public class Ejercicio4 extends JPanel implements ActionListener {
    protected JTextField tituloField, autorField, editorialField, fechaPublicacionField, isbnField;

    public String db="pruebas";
    public String url="jdbc:mysql://localhost:3306/"+db+"?serverTimezone=UTC";
    public String user="root";
    public String pass="";
    
    public Connection con;
     
    public Ejercicio4()
    {
        try {
            this.con= DriverManager.getConnection(this.url,this.user,this.pass);
        } 
        catch (SQLException ex) {}
        
        String createTableSumin = "CREATE TABLE Biblioteca (TITULO VARCHAR(32), AUTOR VARCHAR(32), EDITORIAL VARCHAR(32), FECHA_PUBLICACION VARCHAR(32), ISBN VARCHAR(32))";

        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate(createTableSumin);
            stmt.close();
        } catch (SQLException ex) {}
          
        JPanel panel1 = new JPanel(new GridLayout(8,2));
 
        panel1.add(crearLabel("Titulo"));
        tituloField = crearField("tituloField");
        panel1.add(tituloField);
        
        panel1.add(crearLabel("Autor"));
        autorField = crearField("autorField");
        panel1.add(autorField);
        
        panel1.add(crearLabel("Editorial"));
        editorialField = crearField("editorialField");
        panel1.add(editorialField);
        
        panel1.add(crearLabel("Fecha publicación"));
        fechaPublicacionField = crearField("fechaPublicacionField");
        panel1.add(fechaPublicacionField);
        
        panel1.add(crearLabel("ISBN"));
        isbnField = crearField("isbField");
        panel1.add(isbnField);
        
        JPanel panel2 = new JPanel(new GridLayout(1,3));
        
        panel2.add(crearBoton("Nuevo", "nuevo"));
        panel2.add(crearBoton("Guardar", "guardar"));
        panel2.add(crearBoton("Salir", "salir"));
        
        add(panel1);
        add(panel2);
    }

    private JTextField crearField(String comando)
    {
        JTextField nuevoField = new JTextField(10);
        nuevoField.setPreferredSize( new Dimension( 500, 24 ) );
        nuevoField.setActionCommand(comando);
        nuevoField.addActionListener(this);

        return nuevoField;
    }
    
    private JLabel crearLabel(String texto)
    {
        return new JLabel(texto);
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

    private void borrarFormulario()
    {
        tituloField.setText("");
        autorField.setText(""); 
        editorialField.setText(""); 
        fechaPublicacionField.setText("");
        isbnField.setText("");
    }
    
    private void guardarFormulario()
    { System.out.println("E1 café: ");
        String insertDataCafe = "INSERT INTO biblioteca VALUES "
            + "('"+tituloField.getText()+"', '"+autorField.getText()+"', '"+editorialField.getText()+"', '"+fechaPublicacionField.getText()+"', '"+isbnField.getText()+"')";
        
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate(insertDataCafe);
        } catch (SQLException ex) {
        }
    }
    
    private void cerrarPrograma()
    {
        System.exit(0);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        switch (e.getActionCommand()) {
            case "nuevo":
                borrarFormulario();
                break;
            case "guardar":
                guardarFormulario();
                break;
            case "salir":
                cerrarPrograma();
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio 4");
        frame.addWindowListener(new WindowAdapter() {
            public void windowclosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.getContentPane().add(new Ejercicio4(),BorderLayout.CENTER);
        frame.setPreferredSize(new Dimension(250, 300));
        frame.pack();
        frame.setVisible(true);
    }
}