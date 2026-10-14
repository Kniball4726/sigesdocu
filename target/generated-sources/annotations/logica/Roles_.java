package logica;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2026-10-13T21:00:44", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Roles.class)
public class Roles_ { 

    public static volatile SingularAttribute<Roles, Integer> id_rol;
    public static volatile SingularAttribute<Roles, Date> creacion;
    public static volatile SingularAttribute<Roles, String> rol;
    public static volatile SingularAttribute<Roles, Boolean> activo;

}