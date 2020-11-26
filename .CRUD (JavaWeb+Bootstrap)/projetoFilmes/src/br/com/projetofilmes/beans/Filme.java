package br.com.projetofilmes.beans;

public class Filme {

	private long id;
	private String titulo;
	private int classificacao;
	private String genero;
	
	public Filme() {
	
	}
	
	public Filme(long id, String titulo, int classificacao, String genero) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.classificacao = classificacao;
		this.genero = genero;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
}
