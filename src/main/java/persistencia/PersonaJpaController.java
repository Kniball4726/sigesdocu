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
public class PersonaJpaController implements Serializable {

    private final EntityManagerFactory emf;
    private String sigesdocuPU;

    public PersonaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public PersonaJpaController() {
        emf = Persistence.createEntityManagerFactory(sigesdocuPU);
    }
    
    
    
    
}
