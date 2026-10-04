package logica;

/**
 *
 * @author glrd4
 */

public class MenuPrincipal {
    public static void menuPrincipal(){
        int seleccion = 0;
     
        do {
         
            try{
                System.out.println("=======================================================");
                System.out.println("Bienvenidos al Sistema de Gestion documental SISGEDOCU");
                System.out.println("=======================================================");
                System.out.println("1.- Agregar pedido");
                System.out.println("2.- Ver pedidos");
                System.out.println("3.- Buscar pedido");
                System.out.println("4.- Modificar pedido");
                System.out.println("5.- Eliminar pedido");
                System.out.println("0.- Salir");
                seleccion = Utils.leerInt();
                
                switch (seleccion){
                    case 1 -> MenuSecundario.agregarPedido();
                    case 2 -> MenuSecundario.verPedidos();
                    case 3 -> MenuSecundario.buscarPedido();
                    case 4 -> MenuSecundario.modificarPedido();
                    case 5 -> MenuSecundario.eliminarPedido();
                    case 0 -> {
                        System.out.println("\nSaliendo . . .");
                        Thread.sleep(2000);
                        System.exit(0);
                    }
                    default -> System.out.println("Indique un numero dentro del menu");
                    
                }
            }catch(Exception e){
                System.out.println("Ocurrio un Error: "+e);
            }
 
        } while (seleccion != 0);
            
    }
}
