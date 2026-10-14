/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author glrd4
 */
@Entity
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_producto;
    @Column
    private int codigo;
    @Column
    private String producto;
    @Column
    private int cantidad;
    @Column
    private double precio;
    @Temporal(TemporalType.TIMESTAMP)
    private Date creacioon;

    public Productos() {
    }

    public Productos(int id_producto, int codigo, String producto, int cantidad, double precio, Date creacioon) {
        this.id_producto = id_producto;
        this.codigo = codigo;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.creacioon = creacioon;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getCreacioon() {
        return creacioon;
    }

    public void setCreacioon(Date creacioon) {
        this.creacioon = creacioon;
    }

    @Override
    public String toString() {
        return "Productos{" + "id_producto=" + id_producto + ", codigo=" + codigo + ", producto=" + producto + ", cantidad=" + cantidad + ", precio=" + precio + ", creacioon=" + creacioon + '}';
    }
    
    
}
