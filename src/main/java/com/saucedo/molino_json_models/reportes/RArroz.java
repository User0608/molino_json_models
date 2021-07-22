package com.saucedo.molino_json_models.reportes;

public class RArroz {
	private String procedencia;
	private String tipoArroz;
	private String sacos;
	
	public RArroz() {
	}
	public RArroz(String procedencia, String tipoArroz, String sacos) {
		this.procedencia = procedencia;
		this.tipoArroz = tipoArroz;
		this.sacos = sacos;
	}
	public String getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	public String getTipoArroz() {
		return tipoArroz;
	}
	public void setTipoArroz(String tipoArroz) {
		this.tipoArroz = tipoArroz;
	}
	public String getSacos() {
		return sacos;
	}
	public void setSacos(String sacos) {
		this.sacos = sacos;
	}
	@Override
	public String toString() {
		return "RArroz [procedencia=" + procedencia + ", tipoArroz=" + tipoArroz + ", sacos=" + sacos + "]";
	}
	
	
	
}
