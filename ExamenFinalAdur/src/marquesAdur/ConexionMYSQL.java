/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marquesAdur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConexionMYSQL {
	
	public String db="examenAdur";
	public String url="jdbc:mysql://localhost:3306/"+db+"?serverTimezone=UTC";
	public String user="root";
	public String pass="";
        
	public ConexionMYSQL(){
		
	}
	
	public Connection conectar(){
            try{
                //Cargamos el Driver de MySQL
                Connection con=DriverManager.getConnection(this.url,this.user,this.pass);
                return con;
            }catch (SQLException e){
                    JOptionPane.showMessageDialog(null, e);
            }
            return null;
	}
}
