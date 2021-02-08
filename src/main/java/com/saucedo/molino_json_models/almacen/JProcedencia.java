package com.saucedo.molino_json_models.almacen;


public class JProcedencia {	
	private Long id;
	private String lugar;
	public JProcedencia() {
	}
	
	public JProcedencia(String lugar) {
		this.lugar = lugar;
	}

	public JProcedencia(Long id, String lugar) {
		this.id = id;
		this.lugar = lugar;
	}
		
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	@Override
	public String toString() {
		return "JProcedencia [id=" + id + ", lugar=" + lugar + "]";
	}
	
}
