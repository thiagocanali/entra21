package banco;

public class Banco {

	private String nome = "Banco De Blumenau"; 
	private String cnpj = "00.123.121/0001-00"; 
	private int agencia;
	private Cliente clientes[] = new Cliente[1];
	
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public Cliente[] getClientes() {
		return clientes;
	}
	
	/*
	public Cliente getCliente(int codCliente) {
		if (codCliente >= 0 && codCliente <= clientes.length) {
			return clientes[codCliente];
		}
		return null; 
	}
	*/
	
	
	
	public Cliente getClienteConta(int numConta) {
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i].getConta().getNumConta() == numConta) {
				return clientes[i];
			}
		}
		return null;
	}
	
	public String adicionaCliente(Cliente cliente) {
		clientes = novoCliente(clientes); //chamando o método de expandir array
		int i; 
		for (i = 0; i < clientes.length; i++) {
			if (clientes[i] == null) {
				clientes[i] = cliente;
				break;
			}
		}
		
		return "0000 - Operação Realizada com Sucesso."; 
		
	}
	
	public Cliente[] novoCliente(Cliente[] clientes) {
		Cliente[] novoArray = new Cliente[clientes.length + 1];
		for (int i = 0; i < clientes.length; i++) {
			novoArray[i] = clientes[i];
		}
		return novoArray;
	}
}
