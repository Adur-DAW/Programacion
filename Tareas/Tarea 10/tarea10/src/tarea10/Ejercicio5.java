package tarea10;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;

public class Ejercicio5 extends JPanel implements ActionListener {
    protected JTextField tituloField, autorField, editorialField, fechaPublicacionField, isbnField;
    protected JButton botonGuardar;
    
    public String db="pruebas";
    public String url="jdbc:mysql://localhost:3306/"+db+"?serverTimezone=UTC";
    public String user="root";
    public String pass="";
    
    public Connection con;
    
    public DefaultTableModel tableModel;
    public JTable tabla;
     
    public Ejercicio5()
    {
        try {
            this.con= DriverManager.getConnection(this.url,this.user,this.pass);
        } 
        catch (SQLException ex) {}
        
        crearTablaBiblioteca();
        
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
        
        botonGuardar = crearBoton("Guardar", "guardar");
        panel2.add(crearBoton("Nuevo", "nuevo"));
        panel2.add(botonGuardar);
        panel2.add(crearBoton("Salir", "salir"));
        
        add(panel1);
        add(crearTabla());
        add(panel2);
    }
    
    private void crearTablaBiblioteca()
    {
        String createTableSumin = "CREATE TABLE Biblioteca (TITULO VARCHAR(32), AUTOR VARCHAR(32), EDITORIAL VARCHAR(32), FECHA_PUBLICACION VARCHAR(32), ISBN VARCHAR(32))";

        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate(createTableSumin);
            stmt.close();
        } catch (SQLException ex) {}
    }
        
    private JTable crearTabla()
    {
        String[] nombreColumnas = {"Titulo","Autor","Editorial", "Fecha publicacion","ISBN"};
        
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(nombreColumnas);
        
        cargarDatosBBDDYAsignarTabla();
       
        tabla = new JTable(tableModel);
        tabla.setComponentPopupMenu(crearPopupMenu());

        return tabla;
    }

    private JPopupMenu crearPopupMenu()
    {
        JPopupMenu popupMenu = new JPopupMenu();
        
        JMenuItem modificarItem = new JMenuItem("Modificar");
        modificarItem.addActionListener((ActionEvent e) -> ponerDatosFilaSeleccionadaEnFormulario());
        
        JMenuItem borrarItem = new JMenuItem("Borrar");
        borrarItem.addActionListener((ActionEvent e) -> borrarFilaYDeBBDD());
        
        popupMenu.add(modificarItem);
        popupMenu.add(borrarItem);
        
        return popupMenu;
    }
    
    private void cargarDatosBBDDYAsignarTabla()
    {   
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT titulo, autor, editorial, fecha_publicacion, isbn FROM biblioteca;");

            while(rs.next()){
               añadirFilaTabla(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
            }
        } catch (SQLException ex) {}
    }
    
    private void añadirFilaTabla(String titulo, String autor, String editor, String fecha_publicacion, String isbn)
    {
        Object[] datosFilas = {titulo, autor, editor, fecha_publicacion, isbn};
        tableModel.addRow(datosFilas);
    }
    
    private void ponerDatosFilaSeleccionadaEnFormulario()
    {
        String titulo = tableModel.getValueAt(tabla.getSelectedRow(), 0).toString();
        String autor = tableModel.getValueAt(tabla.getSelectedRow(), 1).toString();
        String editor = tableModel.getValueAt(tabla.getSelectedRow(), 2).toString();
        String fecha = tableModel.getValueAt(tabla.getSelectedRow(), 3).toString();
        String isbn = tableModel.getValueAt(tabla.getSelectedRow(), 4).toString();

        setFormulario(titulo, autor, editor, fecha, isbn);
        
        botonGuardar.setText("Actualizar");
    }
    
    private void borrarFilaYDeBBDD()
    {
        String isbn = tableModel.getValueAt(tabla.getSelectedRow(), 4).toString();
        
        try {
           String eliminarLibro = "DELETE FROM Biblioteca WHERE isbn = ?";
           PreparedStatement preparedStmt = con.prepareStatement(eliminarLibro);
           preparedStmt.setString(1, isbn);
           preparedStmt.execute();
           con.close();
        } catch (SQLException ex) {}
        
        tableModel.removeRow(tabla.getSelectedRow());
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

    private void setFormulario(String titulo, String autor, String editor, String fecha, String isbn)
    {
        tituloField.setText(titulo);
        autorField.setText(autor); 
        editorialField.setText(editor); 
        fechaPublicacionField.setText(fecha);
        isbnField.setText(isbn);
    }
    
    private void borrarFormulario()
    {
        setFormulario("","","","","");
    }
    
    private boolean comprobarSiExisteLibro(String isbn)
    {
        try {
            String consulta = "SELECT titulo, autor, editorial, fecha_publicacion, isbn FROM biblioteca where isbn = ?";
            PreparedStatement preparedStmt = con.prepareStatement(consulta);
            preparedStmt.setString(1, isbn);
            ResultSet rs =  preparedStmt.executeQuery();
            
            if (rs.next()) return true;
        } catch (SQLException ex) {}
        
        return false;
    }
    
    private void guardarFormulario()
    {
        if (comprobarSiExisteLibro(isbnField.getText()))
            actualizarLibro();
        else 
            crearNuevoLibro();
        
        borrarFormulario();
    }
    
    private void actualizarLibro()
    {  
        try {
            String actualizarLibro = "UPDATE biblioteca SET titulo = ?, autor = ?, editorial = ?, fecha_publicacion = ? WHERE isbn = ?";
            PreparedStatement preparedStmt = con.prepareStatement(actualizarLibro);
            preparedStmt.setString(1, tituloField.getText());
            preparedStmt.setString(2, autorField.getText());
            preparedStmt.setString(3, editorialField.getText());
            preparedStmt.setString(4, fechaPublicacionField.getText());
            preparedStmt.setString(5, isbnField.getText());
            preparedStmt.execute();
            
            tableModel.setValueAt(tituloField.getText(), tabla.getSelectedRow(), 1);
            tableModel.setValueAt(autorField.getText(), tabla.getSelectedRow(), 2);
            tableModel.setValueAt(editorialField.getText(), tabla.getSelectedRow(), 3);
            tableModel.setValueAt(fechaPublicacionField.getText(), tabla.getSelectedRow(), 4);
        } catch (SQLException ex) {
        }
        
        botonGuardar.setText("Crear");
    }
    
    private void crearNuevoLibro()
    {
        String insertDataCafe = "INSERT INTO biblioteca VALUES "
            + "('"+tituloField.getText()+"', '"+autorField.getText()+"', '"+editorialField.getText()+"', '"+fechaPublicacionField.getText()+"', '"+isbnField.getText()+"')";
        
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate(insertDataCafe);
        } catch (SQLException ex) {
        }
        
        añadirFilaTabla(tituloField.getText(), autorField.getText(), editorialField.getText(), fechaPublicacionField.getText(), isbnField.getText());
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
        }
        
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio 5");
        frame.addWindowListener(new WindowAdapter() {
            public void windowclosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.getContentPane().add(new Ejercicio5(),BorderLayout.CENTER);
        frame.setPreferredSize(new Dimension(400, 400));
        frame.pack();
        frame.setVisible(true);
    }
}