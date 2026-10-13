/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author glrd4
 */
public class ClientesJpaController implements Serializable {

    private final EntityManagerFactory emf;
       
    public ClientesJpaController(EntityManagerFactory emf){
        this.emf = emf;
    }
    
    public ClientesJpaController(){
        emf = Persistence.createEntityManagerFactory("sigesdocuPU");
    }
    
    
}
