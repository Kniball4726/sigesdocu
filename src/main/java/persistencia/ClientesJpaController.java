/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import logica.Clientes;

/**
 *
 * @author glrd4
 */
public class ClientesJpaController implements Serializable {

       
    public ClientesJpaController(EntityManagerFactory emf){
    }
    
    public ClientesJpaController(){
        Persistence.createEntityManagerFactory("sigesdocuPU");
    }

    void create(Clientes cli) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
