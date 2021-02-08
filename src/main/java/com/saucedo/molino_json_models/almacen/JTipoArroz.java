package com.saucedo.molino_json_models.almacen;


public class JTipoArroz {	
	private Long id;
	private String  nombre;
	private String descripcion;
	
	public JTipoArroz() {
	}
	public JTipoArroz(Long id, String nombre, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	public JTipoArroz(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "JTipoArroz [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
}
