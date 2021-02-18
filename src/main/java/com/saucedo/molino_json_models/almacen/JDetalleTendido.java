package com.saucedo.molino_json_models.almacen;

import java.time.LocalDate;
import java.time.LocalTime;

public class JDetalleTendido {
	private Long id;
	private String ubicacion;
	private LocalDate fecha;
	private LocalTime hora;

	private JDetalleRecojo detalleRecojo;
	
	public JDetalleTendido() {
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
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public JDetalleRecojo getDetalleRecojo() {
		return detalleRecojo;
	}
	public void setDetalleRecojo(JDetalleRecojo detalleRecojo) {
		this.detalleRecojo = detalleRecojo;
	}
	@Override
	public String toString() {
		return "JDetalleTendido [id=" + id + ", ubicacion=" + ubicacion + ", fecha=" + fecha + ", hora=" + hora + "]";
	}
}
