/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorproyectos;

import GUI.Principal;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ixone
 */
public class GestorProyectos {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        
        //Cargar el driver
	Class.forName("com.mysql.jdbc.Driver");
        Connection conexion;
        
        
        Principal principal = new Principal();
        principal.setVisible(true);
        
        

        /*      PRUEBA CONEXION
       
      		 //Cargar el driver
		 Class.forName("com.mysql.jdbc.Driver");
		 // Establecemos la conexion con la BD
		 Connection conexion  = (Connection) DriverManager.getConnection("jdbc:mysql://192.168.33.10/scotchbox","root", "root");
  

		 // Preparamos la consulta
		 Statement sentencia = (Statement) conexion.createStatement();
		 ResultSet result = sentencia.executeQuery ("SELECT * FROM pieza");
                 while(result.next()){
                    System.out.println(result.getString("codigo")+" " +result.getFloat("precio")+" " +result.getString("descripcion"));
		 }
                         
                 
                 result.close();
		 sentencia.close();
                 conexion.close();
         */
    }
}
