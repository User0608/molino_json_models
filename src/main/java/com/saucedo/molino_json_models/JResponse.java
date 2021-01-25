package com.saucedo.molino_json_models;

public class JResponse {
	public static final String OK ="EXITO";
	public static final String ERROR ="ERROR";
	
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
