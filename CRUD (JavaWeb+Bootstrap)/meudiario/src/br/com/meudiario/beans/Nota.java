package br.com.meudiario.beans;

import java.io.Serializable;

public class Nota implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String assunto;
	private String dtNota;
	private String texto;
	
	public Nota() {}

	public Nota(int id, String assunto, String dtNota, String texto) {
		this.id = id;
		this.assunto = assunto;
		this.dtNota = dtNota;
		this.texto = texto;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the assunto
	 */
	public String getAssunto() {
		return assunto;
	}

	/**
	 * @param assunto the assunto to set
	 */
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	/**
	 * @return the dtNota
	 */
	public String getDtNota() {
		return dtNota;
	}

	/**
	 * @param dtNota the dtNota to set
	 */
	public void setDtNota(String dtNota) {
		this.dtNota = dtNota;
	}

	/**
	 * @return the texto
	 */
	public String getTexto() {
		return texto;
	}

	/**
	 * @param texto the texto to set
	 */
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	
}
