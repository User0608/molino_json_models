package com.saucedo.molino_json_models.almacen;

import java.time.LocalDate;
import java.time.LocalTime;

import com.saucedo.molino_json_models.personal.JEmpleado;

public class JRegistroIngreso {
	private Long id;
	private int numeroSacos;
	private double kilosPorSaco;
	private double totalKilos;
	private LocalDate fecha;
	private LocalTime hora;		
	
	private JCamionProductor transporte;		
	private JEmpleado empleado;

	public JRegistroIngreso() {
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getNumeroSacos() {
		return numeroSacos;
	}
	public void setNumeroSacos(int numeroSacos) {
		this.numeroSacos = numeroSacos;
	}
	public double getKilosPorSaco() {
		return kilosPorSaco;
	}
	public void setKilosPorSaco(double kilosPorSaco) {
		this.kilosPorSaco = kilosPorSaco;
	}
	public double getTotalKilos() {
		return totalKilos;
	}
	public void setTotalKilos(double totalKilos) {
		this.totalKilos = totalKilos;
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
	public JCamionProductor getTransporte() {
		return transporte;
	}
	public void setTransporte(JCamionProductor transporte) {
		this.transporte = transporte;
	}
	public JEmpleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(JEmpleado empleado) {
		this.empleado = empleado;
	}
	@Override
	public String toString() {
		return "JRegistroIngreso [id=" + id + ", numeroSacos=" + numeroSacos + ", kilosPorSaco=" + kilosPorSaco
				+ ", totalKilos=" + totalKilos + ", fecha=" + fecha + ", hora=" + hora + "]";
	}
	
	
	
}
