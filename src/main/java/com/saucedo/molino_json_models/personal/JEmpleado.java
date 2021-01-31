package com.saucedo.molino_json_models.personal;

import java.time.LocalDate;

import com.saucedo.molino_json_models.security.JUsuario;

public class JEmpleado {
		 private Long id;

		private String nombre;
		private String apellidoPaterno;
		private String apellidoMaterno;
		private String dni;
		
		private String telefon;
		private String direccion;
		private String email;	
		
		private double sueldo;
		private LocalDate fechaContrato;
		private boolean estado;
		
		private JUsuario usuario;
		
		public JEmpleado() {
			this.fechaContrato= LocalDate.now();
			this.estado=true;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
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
		public String getDni() {
			return dni;
		}
		public void setDni(String dni) {
			this.dni = dni;
		}
		public String getTelefon() {
			return telefon;
		}
		public void setTelefon(String telefon) {
			this.telefon = telefon;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public double getSueldo() {
			return sueldo;
		}
		public void setSueldo(double sueldo) {
			this.sueldo = sueldo;
		}
		public LocalDate getFechaContrato() {
			return fechaContrato;
		}
		public void setFechaContrato(LocalDate fechaContrato) {
			this.fechaContrato = fechaContrato;
		}
		public boolean isEstado() {
			return estado;
		}
		public void setEstado(boolean estado) {
			this.estado = estado;
		}
		public JUsuario getUsuario() {
			return usuario;
		}
		public void setUsuario(JUsuario usuario) {
			this.usuario = usuario;
		}
		@Override
		public String toString() {
			return "JEmpleado [id=" + id + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno
					+ ", apellidoMaterno=" + apellidoMaterno + ", dni=" + dni + ", telefon=" + telefon + ", direccion="
					+ direccion + ", email=" + email + ", sueldo=" + sueldo + ", fechaContrato=" + fechaContrato
					+ ", estado=" + estado + ", usuario=" + usuario + "]";
		}
		
		
}
