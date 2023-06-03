/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TEST;

import Clases.Empleado;
import DAO.EmpleadoDAO;
import java.util.List;
        
public class TestEmp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            List<Empleado> lista = new EmpleadoDAO().listarEmpleados();   
            for (Empleado empleado : lista){
                System.out.println(empleado.toString());
        }
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }

    }
    
}
