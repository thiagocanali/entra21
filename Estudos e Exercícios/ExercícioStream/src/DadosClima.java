
public class DadosClima {
	
	private double data[];
	private String hora[];
	private double temp[];
	private double media;
	
	/**
	 * @param dia
	 */
	
	
	public DadosClima() {
		setData(data);
		setHora(hora);
		setTemp(temp);
		setMedia(media);
	}
	
	/**
	 * @return the dia
	 */
	public double[] getData() {
		return data;
	}
	/**
	 * @param dia the dia to set
	 */
	public void setData(double[] data) {
		this.data = data;
	}
	/**
	 * @return the hora
	 */
	public String[] getHora() {
		return hora;
	}
	/**
	 * @param hora the hora to set
	 */
	public void setHora(String[] hora) {
		this.hora = hora;
	}
	/**
	 * @return the temp
	 */
	public double[] getTemp() {
		return temp;
	}
	/**
	 * @param temp the temp to set
	 */
	public void setTemp(double[] temp) {
		this.temp = temp;
	}
	
	public double getMedia() {
		return media;
	}
	
	public void setMedia(double media) {
		this.media = media;
	}
	
	
}
