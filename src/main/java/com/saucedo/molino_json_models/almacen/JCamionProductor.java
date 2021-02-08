package com.saucedo.molino_json_models.almacen;

public class JCamionProductor {
	private Long id;
	private String  placa;
	private String chofer;
	private String descripcion;
		
	public JCamionProductor() {
	}
	public JCamionProductor(String placa, String chofer, String descripcion) {
		this.placa = placa;
		this.chofer = chofer;
		this.descripcion = descripcion;
	}
	public JCamionProductor(Long id, String placa, String chofer, String descripcion) {
		this.id = id;
		this.placa = placa;
		this.chofer = chofer;
		this.descripcion = descripcion;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getChofer() {
		return chofer;
	}
	public void setChofer(String chofer) {
		this.chofer = chofer;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "CamionProductor [placa=" + placa + ", chofer=" + chofer + ", descripcion=" + descripcion + "]";
	}	
}