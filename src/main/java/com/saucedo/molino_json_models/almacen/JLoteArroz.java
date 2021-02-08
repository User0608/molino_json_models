package com.saucedo.molino_json_models.almacen;


public class JLoteArroz {

	private Long id;
	private int numeroSacos;
	
	private JRegistroIngreso ingreso;		
	private JProductor productor;	
	private JProcedencia procedencia;	
	private JTipoArroz tipoArroz;

	public JLoteArroz() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumeroSacos() {
		return numeroSacos;
	}

	public void setNumeroSacos(int numeroSacos) {
		this.numeroSacos = numeroSacos;
	}

	public JRegistroIngreso getIngreso() {
		return ingreso;
	}

	public void setIngreso(JRegistroIngreso ingreso) {
		this.ingreso = ingreso;
	}

	public JProductor getProductor() {
		return productor;
	}

	public void setProductor(JProductor productor) {
		this.productor = productor;
	}

	public JProcedencia getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(JProcedencia procedencia) {
		this.procedencia = procedencia;
	}

	public JTipoArroz getTipoArroz() {
		return tipoArroz;
	}

	public void setTipoArroz(JTipoArroz tipoArroz) {
		this.tipoArroz = tipoArroz;
	}

	@Override
	public String toString() {
		return "JLoteArroz [id=" + id + ", numeroSacos=" + numeroSacos + "]";
	}
	
}
