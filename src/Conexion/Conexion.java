/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private static Connection conexion;
	
    private String user = "dbLibreria";
    private String pass = "dbLibreria";
    
    private String url = "jdbc:oracle:thin:"+user+"/"+pass+"@localhost:1521:xe";
    
    public Conexion(){
        try {
            Class.forName("oracle.jdbc.OracleDriver").newInstance();
            this.conexion = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.out.println("Error de Conexión: " +e.getMessage());
        }
    }

    public Connection obtenerConexion(){
	return conexion;
    }
}