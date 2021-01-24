package com.saucedo.molino_json_models.security;

import java.util.ArrayList;
import java.util.List;

public class SessionResponse {
	private String token;
	private String username;
	private List<String> roles;

	
	
	public SessionResponse() {
		
	}
	public SessionResponse(String token, String username, List<String> roles) {
		this.token = token;
		this.username = username;
		this.roles = roles;		
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	
	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public List<String> getRoles() {
		return roles;
	}



	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	public void addRole(String role) {
		if(this.roles==null) this.roles=new ArrayList<String>();
		this.roles.add(role);
	}

	@Override
	public String toString() {
		return "AuthenticationResponse [token=" + token + "]";
	}
	
	
}
