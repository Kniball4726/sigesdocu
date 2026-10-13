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
public class Logistica {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_logistica;
    @Column
    private String logistica;
    @Temporal(TemporalType.TIMESTAMP)
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
