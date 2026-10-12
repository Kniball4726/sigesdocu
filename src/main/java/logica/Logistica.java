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
public class Logistica {
    private int id_logistica;
    private String logistica;
    private Date creacion;

    public Logistica() {
    }

    public Logistica(int id_logistica, String logistica, Date creacion) {
        this.id_logistica = id_logistica;
        this.logistica = logistica;
        this.creacion = creacion;
    }

    public int getId_logistica() {
        return id_logistica;
    }

    public void setId_logistica(int id_logistica) {
        this.id_logistica = id_logistica;
    }

    public String getLogistica() {
        return logistica;
    }

    public void setLogistica(String logistica) {
        this.logistica = logistica;
    }

    public Date getCreacion() {
        return creacion;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    @Override
    public String toString() {
        return "Logistica{" + "id_logistica=" + id_logistica + ", logistica=" + logistica + ", creacion=" + creacion + '}';
    }
    
    
}
