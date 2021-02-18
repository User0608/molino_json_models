package com.saucedo.molino_json_models.almacen;

import java.util.List;

public class JAreaSecado {	
	private Long id;
	private String ubicacion;
	private int capacidad;
	private List<JUbicacion> ubicaciones;
	public JAreaSecado() {
	}
	
	public JAreaSecado(String ubicacion, int capacidad) {
		this.ubicacion = ubicacion;
		this.capacidad = capacidad;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	public List<JUbicacion> getUbicaciones() {
		return ubicaciones;
	}

	public void setUbicaciones(List<JUbicacion> ubicaciones) {
		this.ubicaciones = ubicaciones;
	}

	@Override
	public String toString() {
		return "JAreaSecado [id=" + id + ", ubicacion=" + ubicacion + ", capacidad=" + capacidad + "]";
	}
	
}
