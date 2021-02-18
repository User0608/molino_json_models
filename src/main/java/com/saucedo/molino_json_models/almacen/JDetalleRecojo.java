package com.saucedo.molino_json_models.almacen;

import java.time.LocalDate;
import java.time.LocalTime;

public class JDetalleRecojo {
	private Long id;
	private LocalDate fecha;
	private LocalTime hora;
	private int numeroSacos;
	private Double humedad;

	public JDetalleRecojo(LocalDate fecha, LocalTime hora, int numeroSacos, Double humedad,
			JDetalleTendido detalleTendido) {
		this.fecha = fecha;
		this.hora = hora;
		this.numeroSacos = numeroSacos;
		this.humedad = humedad;
	}

	public JDetalleRecojo() {
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


	@Override
	public String toString() {
		return "JDetalleRecojo [id=" + id + ", fecha=" + fecha + ", hora=" + hora + ", numeroSacos=" + numeroSacos
				+ ", humedad=" + humedad + "]";
	}
	
}
