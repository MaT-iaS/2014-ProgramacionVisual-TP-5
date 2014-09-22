package ar.edu.unju.fi.bean;

import java.util.List;

import ar.edu.unju.fi.manager.ManagerProducto;
import ar.edu.unju.fi.model.Producto;

public class ListaProductosBean {
	List<Producto> listaProductos=ManagerProducto.productos;
	
	
}
