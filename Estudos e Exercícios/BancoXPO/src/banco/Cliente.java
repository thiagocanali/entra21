package banco;

public class Cliente {

	private String nome; 
	private String cpf;
	private String rg; 
	private String endereco;
	private Conta conta;
	
	
	/**
	 * @param nome
	 * @param cpf
	 * @param rg
	 * @param endereco
	 * @param conta
	 */
	public Cliente(String nome, String cpf, String rg, String endereco, Conta conta) {
		setNome(nome);
		setCpf(cpf);
		setRg(rg);
		setEndereco(endereco);
		setConta(conta);
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}
	/**
	 * @return the rg
	 */
	public String getRg() {
		return rg;
	}
	/**
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}
	/**
	 * @return the conta
	 */
	public Conta getConta() {
		return conta;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
	
		this.cpf = cpf; 
		/*
		if (validaCpf(cpf)) {
			this.cpf = cpf;
		}else {
			return "0010 - CPF Inválido";  
		}
		return "0000 - CPF inserido com sucesso";
	 */	 			
	}
	
	/**
	 * @param rg the rg to set
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}
	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	/**
	 * @param conta the conta to set
	 */
	public void setConta(Conta conta) {
		this.conta = conta;
	} 
	
	private boolean validaCpf(String cpf) {
		
		int digito1 =  Integer.valueOf(cpf.substring(0,0));
		int digito2 =  Integer.valueOf(cpf.substring(1,1)); 
		int digito3 =  Integer.valueOf(cpf.substring(2,2));
		int digito4 =  Integer.valueOf(cpf.substring(4,4));
		int digito5 =  Integer.valueOf(cpf.substring(5,5));
		int digito6 =  Integer.valueOf(cpf.substring(6,6));
		int digito7 =  Integer.valueOf(cpf.substring(8,8));
		int digito8 =  Integer.valueOf(cpf.substring(9,9));
		int digito9 =  Integer.valueOf(cpf.substring(10,10));
	    int digitoV1 = Integer.valueOf(cpf.substring(12,12));
	    int digitoV2 = Integer.valueOf(cpf.substring(13,13));
	
		int dgV1 = 11 - (((digito1 * 10) + (digito2 * 9) + (digito3 * 8) + 
				   (digito4 * 7) + (digito5 * 6) + (digito6 * 5) + 
				   (digito7 * 4) + (digito8 * 3) + (digito9 * 2)) % 11);
		
		int dgV2 = 11 - (((digito1 * 11) + (digito2 * 10) + (digito3 * 9) + 
				   (digito4 * 8) + (digito5 * 7) + (digito6 * 6) + 
				   (digito7 * 5) + (digito8 * 4) + (digito9 * 3) + (dgV1 * 2)) % 11);
		
		if (dgV2 > 9) {
			dgV2 = 0; 
		}
		
		if (dgV1 == digitoV1 && dgV2 == digitoV2) {
			return true;
		}
		return false; 
		
	}
}
