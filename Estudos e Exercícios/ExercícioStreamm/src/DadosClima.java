
public class DadosClima {
	private static double media;
	
	private String data;
	private String hora;
	private double temperatura;
	
	
	/**
	 * @param data
	 * @param hora
	 * @param temperatura
	 */
	public DadosClima(String data, String hora, double temperatura) {
		this.data = data;
		this.hora = hora;
		this.temperatura = temperatura;
	}
	
	
	/**
	 * @return the media
	 */
	public static double getMedia() {
		return media;
	}
	/**
	 * @param media the media to set
	 */
	public static void setMedia(double media) {
		DadosClima.media = media;
	}
	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}
	/**
	 * @return the hora
	 */
	public String getHora() {
		return hora;
	}
	/**
	 * @param hora the hora to set
	 */
	public void setHora(String hora) {
		this.hora = hora;
	}
	/**
	 * @return the temperatura
	 */
	public double getTemperatura() {
		return temperatura;
	}
	/**
	 * @param temperatura the temperatura to set
	 */
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	
	
	
}
