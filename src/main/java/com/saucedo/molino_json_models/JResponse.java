package com.saucedo.molino_json_models;

public class JResponse {
	public static final String OK ="success";
	public static final String ERROR ="Error";
	public static final String REGISTRO_NOT_FOUND ="No se encontro el registro";
	public static final String REGISTRO_DNI_DUPLICADO ="El DNI ya existe.";
	
	public static final String ERROR_USUARI_EXISTE ="USUARIO EXISTE";
	private String response;
	
	public JResponse() {
	}
	public JResponse(String response) {
		this.response = response;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	@Override
	public String toString() {
		return "JResponse [response=" + response + "]";
	}
}
