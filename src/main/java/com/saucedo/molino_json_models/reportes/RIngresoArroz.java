package com.saucedo.molino_json_models.reportes;

public class RIngresoArroz {
	private String mes;
	private String sacos;
	
	public RIngresoArroz() {
	}

	public RIngresoArroz(String mes, String sacos) {
		this.mes = mes;
		this.sacos = sacos;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getSacos() {
		return sacos;
	}

	public void setSacos(String sacos) {
		this.sacos = sacos;
	}

	@Override
	public String toString() {
		return "RIngresoArroz [mes=" + mes + ", sacos=" + sacos + "]";
	}
	
}
