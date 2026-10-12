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
public class Pedidos {
    private int id_pedido;
    private int nota_pedido;
    private Clientes cliente;
    private int bultos;
    private int numero;
    private Logistica logistica;
    private Usuarios usuario;
    private String nota;
    private Boolean entregado;
    private Date creacion;

    public Pedidos() {
    }

    public Pedidos(int id_pedido, int nota_pedido, Clientes cliente, int bultos, int numero, Logistica logistica, Usuarios usuario, String nota, Boolean entregado, Date creacion) {
        this.id_pedido = id_pedido;
        this.nota_pedido = nota_pedido;
        this.cliente = cliente;
        this.bultos = bultos;
        this.numero = numero;
        this.logistica = logistica;
        this.usuario = usuario;
        this.nota = nota;
        this.entregado = entregado;
        this.creacion = creacion;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getNota_pedido() {
        return nota_pedido;
    }

    public void setNota_pedido(int nota_pedido) {
        this.nota_pedido = nota_pedido;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public int getBultos() {
        return bultos;
    }

    public void setBultos(int bultos) {
        this.bultos = bultos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Logistica getLogistica() {
        return logistica;
    }

    public void setLogistica(Logistica logistica) {
        this.logistica = logistica;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public Boolean getEntregado() {
        return entregado;
    }

    public void setEntregado(Boolean entregado) {
        this.entregado = entregado;
    }

    public Date getCreacion() {
        return creacion;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    @Override
    public String toString() {
        return "Pedidos{" + "id_pedido=" + id_pedido + ", nota_pedido=" + nota_pedido + ", cliente=" + cliente + ", bultos=" + bultos + ", numero=" + numero + ", logistica=" + logistica + ", usuario=" + usuario + ", nota=" + nota + ", entregado=" + entregado + ", creacion=" + creacion + '}';
    }
    
    
    
}
