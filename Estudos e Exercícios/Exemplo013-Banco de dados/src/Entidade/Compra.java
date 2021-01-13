package Entidade;

import java.util.Date;

public class Compra {

	private int cod;
	private Date dataCompra;
	private double valorCompra;
	private int cod_cli;
	
	public Compra() {
	}
	
	/**
	 * @param cod
	 * @param dataCompra
	 * @param valorCompra
	 * @param cod_cli
	 */
	public Compra(int cod, Date dataCompra, double valorCompra, int cod_cli) {
		super();
		this.cod = cod;
		this.dataCompra = dataCompra;
		this.valorCompra = valorCompra;
		this.cod_cli = cod_cli;
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
	 * @return the dataCompra
	 */
	public Date getDataCompra() {
		return dataCompra;
	}
	/**
	 * @param dataCompra the dataCompra to set
	 */
	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}
	/**
	 * @return the valorCompra
	 */
	public double getValorCompra() {
		return valorCompra;
	}
	/**
	 * @param valorCompra the valorCompra to set
	 */
	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
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
	
	
	
}
