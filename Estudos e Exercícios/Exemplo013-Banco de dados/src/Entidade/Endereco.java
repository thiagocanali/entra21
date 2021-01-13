package Entidade;

public class Endereco {

	private int cod;
	private String rua;
	private String cidade;
	private String bairro;
	private String estado;
	private int cod_cli;
	
	public Endereco() {
		
	}
	
	
	/**
	 * @param cod
	 * @param rua
	 * @param cidade
	 * @param bairro
	 * @param estado
	 * @param cod_cli
	 */
	public Endereco(int cod, String rua, String cidade, String bairro, String estado, int cod_cli) {
		setCod(cod_cli);
		setRua(rua);
		setCidade(cidade);
		setBairro(bairro);
		setEstado(estado);
		setCod_cli(cod_cli);
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
	 * @return the rua
	 */
	public String getRua() {
		return rua;
	}
	/**
	 * @param rua the rua to set
	 */
	public void setRua(String rua) {
		this.rua = rua;
	}
	/**
	 * @return the cidade
	 */
	public String getCidade() {
		return cidade;
	}
	/**
	 * @param cidade the cidade to set
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	/**
	 * @return the bairro
	 */
	public String getBairro() {
		return bairro;
	}
	/**
	 * @param bairro the bairro to set
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	/**
	 * @return the cod_cli
	 */
	public int getCod_cli() {
		return cod_cli;
	}
	/**
	 * @param cod_cli the cod_cli to set
	 */
	public void setCod_cli(int cod_cli) {
		this.cod_cli = cod_cli;
	}


	@Override
	public String toString() {
		return "Endereco [cod=" + cod + ", rua=" + rua + ", cidade=" + cidade + ", bairro=" + bairro + ", estado="
				+ estado + ", cod_cli=" + cod_cli + "]";
	}
	
}
