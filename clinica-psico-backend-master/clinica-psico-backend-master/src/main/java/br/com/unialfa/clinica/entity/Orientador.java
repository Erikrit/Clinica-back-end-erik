package br.com.unialfa.clinica.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Orientador {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	//private Long idEstagiario;
	//private String nomeEstagiario;
	//private String matriculaEstagiario;
	private String matriculaOrientador;
	private String nomeOrientador;
	private String telefoneResidencial;
	private String celular;
	private String email;
	private String titulacao;
	private String abordagem;
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;

	}
	public String getMatriculaOrientador() {
		return matriculaOrientador;
	}
	public void setMatriculaOrientador(String matriculaOrientador) {
		this.matriculaOrientador = matriculaOrientador;
	}
	public String getNomeOrientador() {
		return nomeOrientador;
	}
	public void setNomeOrientador(String nomeOrientador) {
		this.nomeOrientador = nomeOrientador;
	}
	public String getTelefoneResidencial() {
		return telefoneResidencial;
	}
	public void setTelefoneResidencial(String telefoneResidencial) {
		this.telefoneResidencial = telefoneResidencial;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	public String getAbordagem() {
		return abordagem;
	}
	public void setAbordagem(String abordagem) {
		this.abordagem = abordagem;
	}
	
	
	
	
	
}
