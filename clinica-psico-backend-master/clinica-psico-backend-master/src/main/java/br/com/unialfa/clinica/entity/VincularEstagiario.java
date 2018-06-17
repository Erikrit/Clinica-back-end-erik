package br.com.unialfa.clinica.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VincularEstagiario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		private long id;
	 private String matricula;
	private String nomeCompleto;
	private String matriculaOrientador;
	private String nomeCompletoOrientador;
	private String dataI;
	private String dataF;
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getMatriculaOrientador() {
		return matriculaOrientador;
	}
	public void setMatriculaOrientador(String matriculaOrientador) {
		this.matriculaOrientador = matriculaOrientador;
	}
	public String getNomeCompletoOrientador() {
		return nomeCompletoOrientador;
	}
	public void setNomeCompletoOrientador(String nomeCompletoOrientador) {
		this.nomeCompletoOrientador = nomeCompletoOrientador;
	}
	public String getDataI() {
		return dataI;
	}
	public void setDataI(String dataI) {
		this.dataI = dataI;
	}
	public String getDataF() {
		return dataF;
	}
	public void setDataF(String dataF) {
		this.dataF = dataF;
	}
	
	
	

}
