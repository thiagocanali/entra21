
public class Pedido {
	private int numPedido;
	private Cliente clientes;
	private ItemPedido[] itens = new ItemPedido[1];
	private double valorFinal;
	
	public Pedido(ItemPedido[] itens, int cod, Cliente clientes) {
		//setItens(itens);
		setCod(cod);
		setCliente(clientes);
	}
	
	public int getCod() {
		return numPedido;
	}
	
	public Cliente getCliente() {
		return clientes;
	}
	
	public ItemPedido[] getItens() {
		return itens;
	}
	
	public void setCod(int cod) {
		this.numPedido = cod;
	}
	
	public void setCliente(Cliente cliente) {
		this.clientes = cliente;
	}
	
	public void setItens(ItemPedido[] item) {
		item = new ItemPedido[item.length + 1]; 
		for (int i = 0; i < itens.length; i++) {
			
			if (itens[i] == null) {
				itens[i] = item[i];
				break;
			}
			
		}
		item = itens;
	}
	
	public void adicionarCliente(Cliente clientes) {
		
		}
}
