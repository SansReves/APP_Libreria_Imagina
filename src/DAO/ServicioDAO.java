/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Conexion.*;
import Clases.Servicio;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.CallableStatement;

public class ServicioDAO {
    private Connection conexion;

    public ServicioDAO() {
    }
    
    //GUARDAR
    public boolean guardarServicio (Servicio serv) throws SQLException{
        boolean centinela = false;
        
        try {
            this.conexion = new Conexion().obtenerConexion();
            String query = "INSERT INTO servicio VALUES(?,?,?)";
            CallableStatement cstmt = conexion.prepareCall(query);
            
            cstmt.setString (1,serv.getNombre_serv());
            cstmt.setString (2,serv.getDescp_serv());
            cstmt.setInt (3,serv.getPrecio_serv());
            
            int control = cstmt.executeUpdate();
            if (control>0){
                centinela = true; }
            
        } catch (Exception e) {
            System.out.println("Error al Guardar");
        } finally {
            this.conexion.close();
        }
        return centinela;
    }
    
    
}
