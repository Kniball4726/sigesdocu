package logica;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Clientes;
import logica.Logistica;
import logica.Usuarios;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2026-10-13T21:00:44", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Pedidos.class)
public class Pedidos_ { 

    public static volatile SingularAttribute<Pedidos, Clientes> cliente;
    public static volatile SingularAttribute<Pedidos, Integer> bultos;
    public static volatile SingularAttribute<Pedidos, Integer> numero;
    public static volatile SingularAttribute<Pedidos, Integer> nota_pedido;
    public static volatile SingularAttribute<Pedidos, Boolean> entregado;
    public static volatile SingularAttribute<Pedidos, Date> creacion;
    public static volatile SingularAttribute<Pedidos, Usuarios> usuario;
    public static volatile SingularAttribute<Pedidos, Logistica> logistica;
    public static volatile SingularAttribute<Pedidos, Integer> id_pedido;
    public static volatile SingularAttribute<Pedidos, String> nota;

}