package br.com.projetoweb.beans;

import java.io.Serializable;

public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	private String nome;
	private String dtNascimento;
	private String cpf;
	private char sexo;
	
	public Pessoa() {}
	
	public Pessoa(long id, String nome, String dtNascimento, String cpf, char sexo) {
		this.id = id;
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.cpf = cpf;
		this.sexo = sexo;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the dtNascimento
	 */
	public String getDtNascimento() {
		return dtNascimento;
	}
	/**
	 * @param dtNascimento the dtNascimento to set
	 */
	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	/**
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}
	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
	
}
