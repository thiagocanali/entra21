package Entidade;

import java.util.Date;

public class Cliente {

	private int cod;
	private String rg;
	private String nome;
	private String cpf;
	private String sexo;
	
	public Cliente() {
		
	}
	
	/**
	 * @param cod
	 * @param rg
	 * @param nome
	 * @param cpf
	 * @param datanascimento
	 * @param sexo
	 */
	public Cliente(int cod, String rg, String nome, String cpf, String sexo) {
		setCod(cod);
		setRg(rg);
		setNome(nome);
		setCpf(cpf);
		setSexo(sexo);
	}
	
	
	/**
	 * @return the cod
	 */
	public int getCod() {
		return cod;
	}
	/**
	 * @param cod the cod to set
	 */
	public void setCod(int cod) {
		this.cod = cod;
	}
	/**
	 * @return the rg
	 */
	public String getRg() {
		return rg;
	}
	/**
	 * @param rg the rg to set
	 */
	public void setRg(String rg) {
		this.rg = rg;
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
	public String getSexo() {
		return sexo;
	}
	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Cliente [cod=" + cod + ", rg=" + rg + ", nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + "]";
	}
	
	
	
	
	
}
