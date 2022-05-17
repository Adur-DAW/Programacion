package tarea10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
/**
 *
 * @author adurt
 */
public class Ejercicios123 {
    
    public String db="pruebas";
    public String url="jdbc:mysql://localhost:3306/"+db+"?serverTimezone=UTC";
    public String user="root";
    public String pass="";
    
    public Connection con;
    
    public Ejercicios123()
    {
        try {
            this.con= DriverManager.getConnection(this.url,this.user,this.pass);
        } 
        catch (SQLException ex) {}
    }
    
    public void ejercicio1()
    {
        String createTableSumin = "CREATE TABLE SUMINISTRADORES (SUMI_ID INTEGER PRIMARY KEY, NOMBRE_SUMI VARCHAR(32), DIRECCION VARCHAR(60), CIUDAD VARCHAR(32), PROVINCIA VARCHAR(32), CP INTEGER)";
        String insertDataSumin = "INSERT INTO SUMINISTRADORES VALUES "
            + "(101, 'Coffee-Imp' , 'Pol. Ind.', 'Getafe', 'Mad', 28280),"
            + "(49, 'La Superior' , 'Lepanto 23', 'Rianza', 'Seg', 40546),"
            + "(150, 'Kaffe' , 'Nueva 34', 'Baeza', 'Jaén', 23375)";
        
        String createTableCafes = "CREATE TABLE CAFES (NOMBRE_CAFE VARCHAR(32),SUMI_ID INTEGER REFERENCES SUMINISTRADORES(SUMI_ID), PRECIO FLOAT, VENTAS INTEGER, ACUMULADO INTEGER)";
        String insertDataCafe = "INSERT INTO CAFES VALUES "
            + "('Colombia' , 101, 7.99, 0, 0),"
            + "('Brasil' , 49, 8.99, 0, 0),"
            + "('Espresso' , 150, 9.99, 0, 0),"
            + "('Colombia Descaf' , 101, 8.99, 0, 0),"
            + "('Brasil Descaf' , 49, 9.99, 0, 0)";

        try {
            Statement stmt = con.createStatement();
            
            stmt.executeUpdate(createTableSumin);
            stmt.executeUpdate(insertDataSumin);
            stmt.executeUpdate(createTableCafes);
            stmt.executeUpdate(insertDataCafe);
        } catch (SQLException ex) {
        }
    }
    
    public void ejercicio2()
    {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT NOMBRE_CAFE, PRECIO FROM CAFES;");
            while(rs.next()){
                System.out.println("E1 café: " + rs.getString(1));
                System.out.println("cuesta " + rs.getFloat(2) + " Euros");
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
        }
    }
    
    public void ejercicio3()
    {
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE CAFES SET VENTAS = ? WHERE NOMBRE_CAFE = ?;");
            ps.setInt(1, 50);
            ps.setString(2, "Colombia");
            ps.executeUpdate();
            
            PreparedStatement psTot = con.prepareStatement("UPDATE CAFES SET ACUMULADO = ACUMULADO ? WHERE NOMBRE_CAFE = ?;");
            psTot.setInt(1, 50);
            psTot.setString(2, "Colombia");
            
            con.commit();
        } catch (SQLException ex) {
        }
    }
}
