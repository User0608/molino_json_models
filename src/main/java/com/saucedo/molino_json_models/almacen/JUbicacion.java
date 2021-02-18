package com.saucedo.molino_json_models.almacen;


public class JUbicacion {	
	private Long id;
	private String codigo;
	private String descripcion;
	
	public JUbicacion() {
	}
	public JUbicacion(String codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "JUbicacion [id=" + id + ", codigo=" + codigo + ", descripcion=" + descripcion + "]";
	}	
}
