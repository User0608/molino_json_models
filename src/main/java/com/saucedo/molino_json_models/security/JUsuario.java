package com.saucedo.molino_json_models.security;

import java.util.ArrayList;
import java.util.List;


public class JUsuario {
	public static final String STRATUS_ACTIVE="activo";
	public static final String STRATUS_INHABILIDATDO="inhabilitado";
	private Long id;
	private String username;
	private String password;
	private String owner;
	private Long status;
	private List<JRole> roles;

	public JUsuario() {
		this.roles = new ArrayList<JRole>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Long getStatus() {
		return status;
	}
	public String getStringOfStatus() {
		if(this.status!=null) {
			if(this.status>0) return STRATUS_ACTIVE;
			else return STRATUS_INHABILIDATDO;			
		}
		return "";
	}
	public void setStatusWithString(String status) {
		if(status.equals(STRATUS_ACTIVE))this.status=new Long(1);
		if(status.equals(STRATUS_INHABILIDATDO)) this.status=new Long(0);
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public List<JRole> getRoles() {
		return roles;
	}
	public String getStringRoles() {
		String retorno="";
		if(this.roles!=null) {
			for(JRole r:this.roles) {
				retorno+=r.getName() +",";
			}
		}
		if(retorno.length()!=0) retorno=retorno.substring(0,retorno.length()-1);
		return retorno;
	}
	public void setRoles(List<JRole> roles) {
		this.roles = roles;
	}

	public void addRole(JRole role) {
		if (role != null)
			this.roles.add(role);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "JUsuario [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
	
	
}
