/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.lang.System.Logger;
import java.util.logging.Level;
import logica.Clientes;

/**
 *
 * @author glrd4
 */
public class ControladoraPersistencia {
    
    ClientesJpaController cliJpa = new ClientesJpaController();
    DetallePedidoJpaController detaJpa = new DetallePedidoJpaController();
    LogisticaJpaController logJpa = new LogisticaJpaController();
    PersonaJpaController persoJpa = new PersonaJpaController();
    
    public void crearCliente(Clientes cli){
        try{
            cliJpa.create(cli);
        }catch (Exception ex){
            System.out.println("Error: "+ex);
        }
    }
    
}

