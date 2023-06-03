/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author ignac
 */
public class Servicio {
    private String nombre_serv;
    private String descp_serv;
    private int precio_serv;

    public Servicio() {
    }

    public Servicio(String nombre_serv, String descp_serv, int precio_serv) {
        this.nombre_serv = nombre_serv;
        this.descp_serv = descp_serv;
        this.precio_serv = precio_serv;
    }

    @Override
    public String toString() {
        return "Servicio{" + "nombre_serv=" + nombre_serv + ", descp_serv=" + descp_serv + ", precio_serv=" + precio_serv + '}';
    }

    public String getNombre_serv() {
        return nombre_serv;
    }

    public void setNombre_serv(String nombre_serv) {
        this.nombre_serv = nombre_serv;
    }

    public String getDescp_serv() {
        return descp_serv;
    }

    public void setDescp_serv(String descp_serv) {
        this.descp_serv = descp_serv;
    }

    public int getPrecio_serv() {
        return precio_serv;
    }

    public void setPrecio_serv(int precio_serv) {
        this.precio_serv = precio_serv;
    }
    
    
    
}
