package banco;

public class Conta {

	private int numConta; 
	private double saldo; 
	private double limite; 
	private int tipo; 
	private int senha;
	private Banco banco; 
	
	//Metodos Construtores
	public Conta(int numConta, double saldo, double limite, int tipo, int senha, Banco banco) {
		setNumConta(numConta);
		setSaldo(saldo);
		setLimite(limite);
		setSenha(senha);
		setTipo(tipo);
		setBanco(banco);
	}
	
	public Conta(int numConta, int tipo, int senha, Banco banco) {
		setNumConta(numConta);
		setTipo(tipo);
		setSenha(senha);
		setBanco(banco);
	}
	
	//Metodos de acesso 
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public String setSaldo(double saldo) {
		if (saldo > 0) {
			this.saldo = saldo;
		}else {
			return "0007 - Valor de Saldo Inicial Inválido"; 
		}
		return "0000 - Operação efetuada com Sucesso";    
	}
	
	
	public String setLimite(double limite) {
		if (limite >= 0) {
			this.limite = limite;
			return "0008 - Valor do Limite Inválido"; 
		}
		return "0000 - Operação efetuada com Sucesso";    
	}
	
	
	public String setTipo(int tipo) {
		switch (tipo) {
		case 1: //conta corrente pessoa fisíca 
		case 2: //conta corrente pessoa jurídica
		case 3: //conta poupança 
		case 4: //conta investimento
			this.tipo = tipo; 
			break;

		default:
			return "0009 - Tipo de Conta inválido"; 
			//break;
		}
		return "0000 - Operação efetuada com Sucesso"; 
	}
	
	public void setSenha(int senha) {
		this.senha = senha; 
	}
	
	public void setBanco(Banco banco) {
		this.banco = banco; 
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public double getSaldo() {
		return saldo; 
	}

	public double getLimite() {
		return limite; 
	}
	
	public int getTipo() {
		return tipo;
	}
	
	public int getSenha() {
		return senha;
	}
	
	public Banco getBanco() {
		return banco; 
	}
	
	//Metodos Worker 
	/**
	 * Return Code: 
	 *    0000 - Operação efetuada com Sucesso 
	 *    0001 - Reservado Warning
	 *    0002 - Reservado Warning
	 *    0003 - Reservado Warning
	 *    0004 - Reservado Warning
	 *    0005 - Valor de depósito Inválido
	 *    0006 - Reservado Erro 
	 *    0007 - Reservado Erro 
	 *    0008 - Reservado Erro 
	 *     
	 */
	
	
	public String depositar(double valDeposito) {
		if (valDeposito > 0) {
			saldo = saldo + valDeposito;	
		}else {
			return "0005 - Valor de depósito inválido"; 
		}
		return "0000 - Operação efetuada com sucesso"; 
	}
	
	
	public String sacar(double valSaque) {
		if ((saldo + limite) < valSaque) {
			return "0006 - Saldo insuficiente para a operação"; 
		}else {
			saldo = saldo - valSaque; 
		}
		
		return "0000 - Operação efetuada com sucesso";
	}
}
