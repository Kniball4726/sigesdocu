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
public class DetallePedidoJpaController {
    
    private final EntityManagerFactory emf;
    
    public DetallePedidoJpaController(EntityManagerFactory emf){
        this.emf = emf;
    }
    
    public DetallePedidoJpaController(){
        emf = Persistence.createEntityManagerFactory("sigesdocuPU");
    }
}
