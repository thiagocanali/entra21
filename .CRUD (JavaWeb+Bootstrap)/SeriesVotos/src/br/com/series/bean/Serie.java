package br.com.series.bean;

import java.io.Serializable;

public class Serie implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nome;
	private int voto;
	
	public Serie() {}
	
	public Serie(int id, String nome, int voto) {
		this.id = id;
		this.nome = nome;
		this.voto = voto;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
