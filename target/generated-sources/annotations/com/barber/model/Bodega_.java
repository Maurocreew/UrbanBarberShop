package com.barber.model;

import com.barber.model.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-09-11T10:53:31")
@StaticMetamodel(Bodega.class)
public class Bodega_ { 

    public static volatile SingularAttribute<Bodega, Integer> existencias;
    public static volatile SingularAttribute<Bodega, Integer> idBodega;
    public static volatile ListAttribute<Bodega, Producto> productoList;
    public static volatile SingularAttribute<Bodega, String> nombre;

}