package br.com.socialbooks.beans;

import java.io.Serializable;

public class Relacionamento implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String tipoRel;
	
	public Relacionamento() {}

	public Relacionamento(int id, String tipoRel) {
		this.id = id;
		this.tipoRel = tipoRel;
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
	 * @return the tipoRel
	 */
	public String getTipoRel() {
		return tipoRel;
	}

	/**
	 * @param tipoRel the tipoRel to set
	 */
	public void setTipoRel(String tipoRel) {
		this.tipoRel = tipoRel;
	}
}
