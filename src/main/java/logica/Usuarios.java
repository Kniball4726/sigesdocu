/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author glrd4
 */
@Entity
public class Usuarios {
    @Id
    @Column(nullable = false, length = 100)
    private String usuario;
    @Column(nullable = false)
    private String clave;
    @Column
    private String email;
    @ManyToOne
    @JoinColumn(name = "id_rol")
    private Roles rol;
    @Temporal(TemporalType.TIMESTAMP)
    private Date creacion;

    public Usuarios() {
    }

    public Usuarios(String usuario, String clave, String email, Roles rol, Date creacion) {
        this.usuario = usuario;
        this.clave = clave;
        this.email = email;
        this.rol = rol;
        this.creacion = creacion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Roles getRol() {
        return rol;
    }

    public void setRol(Roles rol) {
        this.rol = rol;
    }

    public Date getCreacion() {
        return creacion;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "usuario=" + usuario + ", clave=" + clave + ", email=" + email + ", rol=" + rol + ", creacion=" + creacion + '}';
    }
    
    
}
