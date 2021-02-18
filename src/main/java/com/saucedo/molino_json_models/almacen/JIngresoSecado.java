package com.saucedo.molino_json_models.almacen;

import java.time.LocalDate;
import java.time.LocalTime;

import com.saucedo.molino_json_models.personal.JEmpleado;


public class JIngresoSecado {
	private Long id;
	private LocalDate fecha;
	private LocalTime hora;
	private int numeroSacos;
	private Double humedad;
	
	private JEmpleado empleado;	
	
	public JIngresoSecado() {
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public int getNumeroSacos() {
		return numeroSacos;
	}
	public void setNumeroSacos(int numeroSacos) {
		this.numeroSacos = numeroSacos;
	}
	public Double getHumedad() {
		return humedad;
	}
	public void setHumedad(Double humedad) {
		this.humedad = humedad;
	}
	public JEmpleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(JEmpleado empleado) {
		this.empleado = empleado;
	}

	@Override
	public String toString() {
		return "JIngresoSecado [id=" + id + ", fecha=" + fecha + ", hora=" + hora + ", numeroSacos=" + numeroSacos
				+ ", humedad=" + humedad + "]";
	}
	
}
