
public class ItemPedido {
	private int cod;
	private String descricao;
	private double valor;
	private int qtd;
	private Cliente cliente = new Cliente(descricao, descricao, descricao, descricao);
	
	public ItemPedido(int cod, String descricao, double valor, int qtd) {
		setCod(cod);
		setDescricao(descricao);
		setValor(valor);
		setQtd(qtd);
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public double getValor() {
		return valor;
	}
	
	public int getQtd() {
		return qtd;
	}
	
	public void setCod(int cod) {
		this.cod = cod;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	
	
	
}
