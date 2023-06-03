/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author ignac
 */
public class Producto {
    private String nombre_prod;
    private int precio;
    private int stock;
    // private imagen imagen_prod;
    private int id_tipo_prod;

    public Producto() {
    }

    public Producto(String nombre_prod, int precio, int stock, int id_tipo_prod) {
        this.nombre_prod = nombre_prod;
        this.precio = precio;
        this.stock = stock;
        this.id_tipo_prod = id_tipo_prod;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre_prod=" + nombre_prod + ", precio=" + precio + ", stock=" + stock + ", id_tipo_prod=" + id_tipo_prod + '}';
    }

    public String getNombre_prod() {
        return nombre_prod;
    }

    public void setNombre_prod(String nombre_prod) {
        this.nombre_prod = nombre_prod;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getId_tipo_prod() {
        return id_tipo_prod;
    }

    public void setId_tipo_prod(int id_tipo_prod) {
        this.id_tipo_prod = id_tipo_prod;
    }
    
    
    
    
    
}
