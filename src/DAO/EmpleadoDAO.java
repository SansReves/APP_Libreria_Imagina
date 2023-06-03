/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Conexion.*;
import Clases.Empleado;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
        
public class EmpleadoDAO {
    private Connection conexion;

    public EmpleadoDAO() {
    }

    //ADD
    public boolean guardarEmpleado (Empleado emp) throws SQLException{
        boolean centinela = false;
        
        try {
            //abre conexion
            this.conexion = new Conexion().obtenerConexion();
            String query = "INSERT INTO empleado VALUES(?,?,?,?,?,?,?,?)";
            //query como un CallableStatement
            CallableStatement cstmt = conexion.prepareCall(query);
            // paso de informacion
            cstmt.setInt(1, emp.getRut_emp());
            cstmt.setString(2, emp.getDv_emp());
            cstmt.setString(3, emp.getNombre_emp());
            cstmt.setString(4, emp.getAp_paterno_emp());
            cstmt.setString(5, emp.getCorreo());
            cstmt.setInt(6, emp.getTipoEmpleado());
            cstmt.setString(7, emp.getUsuario_emp());
            cstmt.setString(8, emp.getContrasenia_emp());
            
            int control = cstmt.executeUpdate();
            if(control>0){
                //Se guarda exitosamente
                centinela = true;
            }
            
        } catch (Exception e) {
            System.out.println("Error al Guardar"+e.getMessage());
        } finally {
            //Cierra conexion
            this.conexion.close();
        }
        return centinela;
    }
    
    //DELETE
    
    //EDIT
    
    //LIST
    public List<Empleado> listarEmpleados()throws SQLException{
        List<Empleado> listado = new ArrayList<>();
        try {
            this.conexion = new Conexion().obtenerConexion();
            String llamada = "SELECT nombre_emp, ap_paterno_emp,rut_emp,correo_emp,id_tp_emp FROM empleado";
            CallableStatement cstmt = this.conexion.prepareCall(llamada);
            
            ResultSet rs = cstmt.executeQuery();
            
            while (rs.next()) {
                Empleado e = new Empleado();
                e.setNombre_emp(rs.getString("nombre_emp"));
                e.setAp_paterno_emp(rs.getString("ap_paterno_emp"));
                e.setRut_emp(rs.getInt("rut_emp"));
                e.setCorreo(rs.getString("correo_emp"));
                e.setTipoEmpleado(rs.getInt("id_tp_emp"));
                
                listado.add(e);
            }
            
        } catch (Exception e) {
            System.out.println("Error al Listar "+e.getMessage());
        } finally {
            this.conexion.close();
        }
        
        return listado;
    }
    
    
    //SEARCH
    
    
    
    
    
    
    
    
    
    
    
}

