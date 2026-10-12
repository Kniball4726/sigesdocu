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
public class DetallePedido {
    private int id_detalle;
    private Productos productos;
    private Pedidos pedido;
    private Date creacion;

    public DetallePedido() {
    }

    public DetallePedido(int id_detalle, Productos productos, Pedidos pedido, Date creacion) {
        this.id_detalle = id_detalle;
        this.productos = productos;
        this.pedido = pedido;
        this.creacion = creacion;
    }

    public int getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(int id_detalle) {
        this.id_detalle = id_detalle;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    public Pedidos getPedido() {
        return pedido;
    }

    public void setPedido(Pedidos pedido) {
        this.pedido = pedido;
    }

    public Date getCreacion() {
        return creacion;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    @Override
    public String toString() {
        return "DetallePedido{" + "id_detalle=" + id_detalle + ", productos=" + productos + ", pedido=" + pedido + ", creacion=" + creacion + '}';
    }
    
    
    
}
