package ar.edu.unju.fi.model;

public class Rol {
	private Integer rolId;
	private String descripcion;
	
	public Rol(Integer rolId, String descripcion) {
		super();
		this.rolId = rolId;
		this.descripcion = descripcion;
	}
	public Integer getRolId() {
		return rolId;
	}
	public void setRolId(Integer rolId) {
		this.rolId = rolId;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
