/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.edu.unju.fi.model;

public class Usuario {    
	private Integer documento;
	private String nombre;
    private String apellido;
    private String password;
    private String estado;
    private Rol rol;
    
    public Usuario(Integer documento, String nombre, String apellido, String password, String estado, Rol rol) {
		super();
		this.documento = documento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.password = password;
		this.estado = estado;
		this.rol = rol;
	}
	public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Integer getDocumento() {
        return documento;
    }
    public void setDocumento(Integer documento) {
        this.documento = documento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }    
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	
}
