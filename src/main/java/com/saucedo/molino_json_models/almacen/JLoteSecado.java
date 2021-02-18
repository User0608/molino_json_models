package com.saucedo.molino_json_models.almacen;

import java.time.LocalDate;

public class JLoteSecado {
	private Long id;
	private LocalDate fecha;
	private int totalSacos;
	private JLoteArroz lotearroz;
	private JUbicacion ubicacion;
	private JIngresoSecado ingreso;
	private JDetalleTendido tendido; 
	public JLoteSecado() {
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



	public int getTotalSacos() {
		return totalSacos;
	}



	public void setTotalSacos(int totalSacos) {
		this.totalSacos = totalSacos;
	}



	public JLoteArroz getLotearroz() {
		return lotearroz;
	}



	public void setLotearroz(JLoteArroz lotearroz) {
		this.lotearroz = lotearroz;
	}



	public JUbicacion getUbicacion() {
		return ubicacion;
	}



	public void setUbicacion(JUbicacion ubicacion) {
		this.ubicacion = ubicacion;
	}



	public JIngresoSecado getIngreso() {
		return ingreso;
	}



	public JDetalleTendido getTendido() {
		return tendido;
	}



	public void setTendido(JDetalleTendido tendido) {
		this.tendido = tendido;
	}



	public void setIngreso(JIngresoSecado ingreso) {
		this.ingreso = ingreso;
	}

	@Override
	public String toString() {
		return "JLoteSecado [id=" + id + ", fecha=" + fecha + ", totalSacos=" + totalSacos + ", lotearroz=" + lotearroz
				+ "]";
	}	
}
