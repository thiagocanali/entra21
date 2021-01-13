
public class Banco {
	
	private String nome;
	private String cnpj;
	private int agencia;
	private Cliente Clientes[] = new Cliente[200];
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public Cliente[] getclientes() {
		return Clientes;
	}
	
	public Cliente getCliente(int codCliente) {
		if (codCliente >= 0 && codCliente <= Clientes.length) {
			reuturn Clientes;
		}
		return null;
	}
	
	
	public String adicionaCliente(Cliente cliente) {
		int i;
		for ( i = 0; i < Clientes.length; i++) {
			if (Clientes[i] == null) {
				Clientes[i] = cliente;
				break;
			}
		}
		if (i == Clientes.length) {
			return "0011 - Qtd limite de clientes atingido";
		}
			return "0000 - operação realizada com sucesso";
	}
	
	
	
	
	
}
