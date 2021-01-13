
public class Cliente {
	private String nome;
	private String cpf;
	private String rg;
	private String telefone;
	
	public Cliente(String nome, String cpf, String rg, String telefone) {
		setNome(nome);
		setCpf(cpf);
		setRg(rg);
		setTelefone(telefone);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}
