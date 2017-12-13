package org.formacio.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_COTXES")
public class Cotxe {

	@Id 
	@Column(name="COT_MATRICULA")
	private String matricula;

	@Column(name="COT_MODEL")
    private String model;
	
	@ManyToOne
	@JoinColumn(name="COT_PROPIETARI")
	private Persona propietari;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Persona getPropietari() {
		return propietari;
	}
	public void setPropietari(Persona propietari) {
		this.propietari = propietari;
	}
}
