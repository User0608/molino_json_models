package com.saucedo.molino_json_models;



public class RProductor {
	private String dni;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String telefon;
	private Long sacos;
	
	
	
	public RProductor(String dni, String nombre, String apellidoPaterno, String apellidoMaterno, String telefon,
			Long sacos) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.telefon = telefon;
		this.sacos = sacos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public Long getSacos() {
		return sacos;
	}
	public void setSacos(Long sacos) {
		this.sacos = sacos;
	}
	@Override
	public String toString() {
		return "RProductor [dni=" + dni + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno
				+ ", apellidoMaterno=" + apellidoMaterno + ", telefon=" + telefon + ", sacos=" + sacos + "]";
	}
	
}
