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
public class DetallePedido {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_detalle;
    @Column
    private Productos productos;
    @Column
    private Pedidos pedido;
    @Temporal(TemporalType.TIMESTAMP)
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
