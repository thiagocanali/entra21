package Entidade;

public class Produto {
	
	private int cod;
	private String nomeProduto;
	private String tipo;
	private float preco;
	private int qtd;
	
	public Produto() {
		
	}
	
	/**
	 * @param cod
	 * @param nomeProduto
	 * @param tipo
	 * @param preco
	 * @param qtd
	 */
	public Produto(int cod, String nomeProduto, String tipo, float preco, int qtd) {
		setCod(cod);
		setNomeProduto(nomeProduto);
		setTipo(tipo);
		setPreco(preco);
		setQtd(qtd);
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
	 * @return the nomeProduto
	 */
	public String getNomeProduto() {
		return nomeProduto;
	}
	/**
	 * @param nomeProduto the nomeProduto to set
	 */
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the preco
	 */
	public float getPreco() {
		return preco;
	}
	/**
	 * @param preco the preco to set
	 */
	public void setPreco(float preco) {
		this.preco = preco;
	}
	/**
	 * @return the qtd
	 */
	public int getQtd() {
		return qtd;
	}
	/**
	 * @param qtd the qtd to set
	 */
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	@Override
	public String toString() {
		return "Produto [cod=" + cod + ", nomeProduto=" + nomeProduto + ", tipo=" + tipo + ", preco=" + preco + ", qtd="
				+ qtd + "]";
	}
	
	
	
	
}
