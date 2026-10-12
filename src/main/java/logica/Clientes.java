/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Date;

/**
 *
 * @author glrd4
 */
public class Clientes {
    private int id_cliente;
    private String cliente;
    private String cuil;
    private String direccion;
    private String telefono;
    private String email;
    private Date creacion;

    public Clientes() {
    }

    public Clientes(int id_cliente, String cliente, String cuil, String direccion, String telefono, String email, Date creacion) {
        this.id_cliente = id_cliente;
        this.cliente = cliente;
        this.cuil = cuil;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.creacion = creacion;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreacion() {
        return creacion;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    @Override
    public String toString() {
        return "Clientes{" + "id_cliente=" + id_cliente + ", cliente=" + cliente + ", cuil=" + cuil + ", direccion=" + direccion + ", telefono=" + telefono + ", email=" + email + ", creacion=" + creacion + '}';
    }
    
    
}
