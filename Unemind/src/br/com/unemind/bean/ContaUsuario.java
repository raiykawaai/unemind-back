package br.com.unemind.bean;

import java.time.LocalDate;

public class ContaUsuario {

	//Atributos
	private int codigoUsuario;
	private String nomeCompleto;
	private String email;
	private String senha;
	private String genero;
	private LocalDate dataNascimento;
	private String interesse1;
	private String interesse2;
	private String grauHumor1;
	private String grauAnsiedade1;
	private String faculdade;
	private String curso;
	
	
	//Construtor
	public ContaUsuario() {}
	
	public ContaUsuario(int codigoUsuario, String nomeCompleto, String email, String senha, String genero, LocalDate novaData,
			String interesse1, String interesse2, String grauHumor1, String grauAnsiedade1, String faculdade, String curso) {
		this.codigoUsuario = codigoUsuario;
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.senha = senha;
		this.genero = genero;
		this.dataNascimento = novaData;
		this.faculdade = faculdade;
		this.curso = curso;
		this.interesse1 = interesse1;
		this.interesse2 = interesse2;
		this.grauHumor1 = grauHumor1;
		this.grauAnsiedade1 = grauAnsiedade1;
	}

	//Getters & Setters

	public int getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	
	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public LocalDate getData() {
		return dataNascimento;
	}
	
	public void setData(LocalDate data) {
		this.dataNascimento = data;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getInteresse1() {
		return interesse1;
	}

	public void setInteresse1(String interesse1) {
		this.interesse1 = interesse1;
	}

	public String getInteresse2() {
		return interesse2;
	}

	public void setInteresse2(String interesse2) {
		this.interesse2 = interesse2;
	}
	
	public String getGrauHumor1() {
		return grauHumor1;
	}

	public void setGrauHumor1(String grauHumor1) {
		this.grauHumor1 = grauHumor1;
	}

	public String getGrauAnsiedade1() {
		return grauAnsiedade1;
	}

	public void setGrauAnsiedade1(String grauAnsiedade1) {
		this.grauAnsiedade1 = grauAnsiedade1;
	}

	public String getFaculdade() {
		return faculdade;
	}
	
	public void setFaculdade(String faculdade) {
		this.faculdade = faculdade;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}



}
