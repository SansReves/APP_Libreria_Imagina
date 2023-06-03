/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class Empleado {
    private int rut_emp;
    private String dv_emp;
    private String nombre_emp;
    private String ap_paterno_emp;
    private String correo;
    private int tipoEmpleado;
    private String usuario_emp;
    private String contrasenia_emp;


//constructor vacio
    public Empleado(){
	}

//constructor con datos
    public Empleado(int rut_emp, String dv_emp, String nombre_emp, String ap_paterno_emp, String correo, int tipoEmpleado, String usuario_emp, String contrasenia_emp) {    
        this.rut_emp = rut_emp;
        this.dv_emp = dv_emp;
        this.nombre_emp = nombre_emp;
        this.ap_paterno_emp = ap_paterno_emp;
        this.correo = correo;
        this.tipoEmpleado = tipoEmpleado;
        this.usuario_emp = usuario_emp;
        this.contrasenia_emp = contrasenia_emp;
    }

//    public Empleado(String rut_emp, String dv_emp, String nombre_emp, String ap_paterno_emp, String correo, int tipoEmpleado, String usuario_emp, String contrasenia_emp) {
//        this.setRut_emp(rut_emp);
//        this.setDv_emp(dv_emp);
//        this.setNombre_emp(nombre_emp);
//        this.setAp_paterno_emp(ap_paterno_emp);
//        this.setCorreo(correo);
//        this.setTipoEmpleado(0);
//        this.setUsuario_emp(usuario_emp);
//        this.setContrasenia_emp(contrasenia_emp);} 

//Getter and Setter con datos	
    public int getRut_emp() {
        return rut_emp;
    }

    public void setRut_emp(int rut_emp) {
        this.rut_emp = rut_emp;
    }

    public String getDv_emp() {
        return dv_emp;
    }

    public void setDv_emp(String dv_emp) {
        this.dv_emp = dv_emp;
    }

    public String getNombre_emp() {
        return nombre_emp;
    }

    public void setNombre_emp(String nombre_emp) {
        this.nombre_emp = nombre_emp;
    }

    public String getAp_paterno_emp() {
        return ap_paterno_emp;
    }

    public void setAp_paterno_emp(String ap_paterno_emp) {
        this.ap_paterno_emp = ap_paterno_emp;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(int tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getUsuario_emp() {
        return usuario_emp;
    }

    public void setUsuario_emp(String usuario_emp) {
        this.usuario_emp = usuario_emp;
    }

    public String getContrasenia_emp() {
        return contrasenia_emp;
    }

    public void setContrasenia_emp(String contrasenia_emp) {
        this.contrasenia_emp = contrasenia_emp;
    }

//Generate toString()con datos
    @Override
    public String toString() {
        return "Empleado{" + "rut_emp=" + rut_emp + ", dv_emp=" + dv_emp + ", nombre_emp=" + nombre_emp + ", ap_paterno_emp=" + ap_paterno_emp + ", correo=" + correo + ", tipoEmpleado=" + tipoEmpleado + ", usuario_emp=" + usuario_emp + ", contrasenia_emp=" + contrasenia_emp + '}';
    }

    
    
}
