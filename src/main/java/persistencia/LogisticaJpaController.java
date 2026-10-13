/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author glrd4
 */
public class LogisticaJpaController {
    
    private final EntityManagerFactory emf;
   
    public LogisticaJpaController(EntityManagerFactory emf){
        this.emf = emf;
    }
    
    public LogisticaJpaController(){
        emf = Persistence.createEntityManagerFactory("sigesdocuPU");
    }
}
