package applibreriaimagina;

import Clases.Empleado;
import DAO.EmpleadoDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppLibreriaImagina {

    public static void main(String[] args) {
        EmpleadoDAO dao = new EmpleadoDAO();
        Empleado emp = new Empleado(20243164,"K","Ignacia","Mendez","ig.mendez@imagina.cl",1,"ig.mendez","imagina");
        
        try {
            if(dao.guardarEmpleado(emp)){
                System.out.println("Empleado Guardado");
            } else {
                System.out.println("Empleado No Guardado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AppLibreriaImagina.class.getName()).log(Level.SEVERE, null, ex);
        }
                    

    }
    
}
