package logica;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Pedidos;
import logica.Productos;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2026-10-13T21:01:15", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(DetallePedido.class)
public class DetallePedido_ { 

    public static volatile SingularAttribute<DetallePedido, Integer> id_detalle;
    public static volatile SingularAttribute<DetallePedido, Pedidos> pedido;
    public static volatile SingularAttribute<DetallePedido, Date> creacion;
    public static volatile SingularAttribute<DetallePedido, Productos> productos;

}