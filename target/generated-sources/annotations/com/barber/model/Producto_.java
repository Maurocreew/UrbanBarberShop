package com.barber.model;

import com.barber.model.Bodega;
import com.barber.model.DespachoProducto;
import com.barber.model.DetallePedido;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-09-11T10:53:31")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> descripcion;
    public static volatile ListAttribute<Producto, DetallePedido> detallePedidoList;
    public static volatile SingularAttribute<Producto, Float> precio;
    public static volatile ListAttribute<Producto, DespachoProducto> despachoProductoList;
    public static volatile SingularAttribute<Producto, Integer> idProducto;
    public static volatile SingularAttribute<Producto, Integer> cantidad;
    public static volatile SingularAttribute<Producto, Bodega> bodegaIdBodega;
    public static volatile SingularAttribute<Producto, String> nombreProducto;

}