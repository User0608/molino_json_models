package com.saucedo.molino_json_models.security;

public class JRole {
	public static final String ROLE_ADMIN="ADMIN";
	public static final String ROLE_RECEPCION="RECEPCION";
	public static final String ROLE_SECADO="SECADO";
	private Long id;
	private String name;

	public JRole() {
	}
	


	public JRole(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}