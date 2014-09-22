package ar.edu.unju.fi.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import ar.edu.unju.fi.manager.ManagerProducto;
import ar.edu.unju.fi.model.Producto;



@ManagedBean
@SessionScoped
public class ProductListBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8194186654346103799L;
	private Integer codigo;
	private String nombre;
	private List<Producto>productList;

	/**
	 * Búsqueda de productos
	 * @return
	 */
	public String search(){
//		ProductDao dao = new ProductDaoImpl();
		
//		//FIXME aquí debería implementarse la búsqueda con parámetros
//		System.out.println("codigo: " + codigo);
//		System.out.println("nombre: " + nombre);
		productList = ManagerProducto.productos;
		
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Buscando Productos...", "Se realizó la búsqueda de productos");
        FacesContext.getCurrentInstance().addMessage(null, message);
		
		return null;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public List<Producto> getProductList() {
		return productList;
	}
	public void setProductList(List<Producto> productList) {
		this.productList = productList;
	}
	
	
}
