
public class Conta {
	
	//encapsulamento as variáveis são private
	//atributos da classe
	
	private double tipoConta; //variáveis final/constantes são maiúsculas
	
	static int qtdContas; //variável da classe
	
	private String numeroConta; //variável de objeto/instância
	private int senha;
	private double saldo;
	private double limite;
	
	Banco banco = new Banco();
	
	//construtor
	public Conta(String numeroConta, int senha, double saldoInicial, double limite, int tipoConta) {
		setnumeroConta(numeroConta);
		setsenha(senha);
		setsaldo(saldoInicial);
		setlimite(limite);
		settipoConta(tipoConta);
		qtdContas++;
	}
	
	public Conta(String numeroConta, int senha, Banco banco, int tipoConta) {
		setnumeroConta(numeroConta);
		setsenha(senha);
		settipoConta(tipoConta);
		setbanco(banco);
		qtdContas++;
	}
	
	
	//métodos acessor
	
	public Banco getbanco() {
		return banco;
	}
	public String getnumeroConta() {
		return numeroConta;
	}
	
	public int getsenha() {
		return senha;
	}
	
	public double getsaldo() {
		return saldo;
	}
	
	public double getlimite() {
		return limite;
	}
	
	public double getTipoConta() {
			return tipoConta;
	}
	
	//métodos mutator vai alterar
	
	public void setbanco(Banco banco) {
		this.banco = banco;
	}
	public void setnumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public void setsenha(int novaSenha) {
		this.senha = novaSenha;
	}
	
	public String setsaldo(double saldo) {
		if (saldo > 0) {
			this.saldo = saldo;
		}
		else {
			return "0007 - valor de saldo inicial incorreto!";
		}
		return "0000 - operação efetuada com sucesso";
		
	}
	
	public String setlimite(double limite) {
		if (limite >= 0) {
			this.limite = limite;
		}
		else {
			return "0008 - valor do limite inválido";
		}
		return "0000 - operação efetuada com sucesso";
	}
	
	public String settipoConta(int tipoConta) {
		switch (tipoConta) {
		case 1: // conta corrente pessoa fisica
		case 2: // conta corrente pessoa juridica
		case 3: // conta poupança
		case 4: // conta investimento
			this.tipoConta = tipoConta;
			break;
			
		default:
			return "0009 - Tipo de conta inválida";
		}
		return "0000 - operação efetuada com sucesso";
		
	}
	
	//métodos worker
	/*
	 * Return code:
	 * 0000 - operação efetuada com sucesso
	 * 0001 - reservado warning
	 * 0002 - reservado warning
	 * 0003 - reservado warning
	 * 0004 - reservado warning
	 * 0005 - valor de depósito inválido
	 * 0006 - reservado erro
	 * 0007 - reservado erro
	 */
	public String sacar(double valorSaque) {
		
		if ((saldo + limite) < valorSaque) {
			return "0006 - Saldo insuficiente para a operação";
		}
		else {
			saldo = saldo - valorSaque;
		}
		
		return "0000 - Operação efetuada com sucesso";
	}
	
	public String depositar(double valorDeposito) {
		if (valorDeposito > 0) {
			saldo = saldo + valorDeposito;
		} else {
			return "0005 - Valor de depósito inválido";
		}
		return "0000 - Operação efetuada com sucesso";
	}
	
	
}
