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
class Roles {
    private int id_rol;
    private String rol;
    private Boolean activo;
    private Date creacion;

    public Roles() {
    }

    public Roles(int id_rol, String rol, Boolean activo, Date creacion) {
        this.id_rol = id_rol;
        this.rol = rol;
        this.activo = activo;
        this.creacion = creacion;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Date getCreacion() {
        return creacion;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    @Override
    public String toString() {
        return "Roles{" + "id_rol=" + id_rol + ", rol=" + rol + ", activo=" + activo + ", creacion=" + creacion + '}';
    }
    
    
}
