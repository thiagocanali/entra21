
public class Comunicacao {
	
	private String candidatos[] = new String[10];
	private String cidades[] = new String[10];
	private String dataProva[] = new String[10];
	private int texto[] = new int[10];
	private String mensagens[] = new String[3];
	
	/**
	 * @author Luana Gnewuch
	 */
	
	/**
	 * adiciona o candidato e todos os seus atributos
	 * @param candidatos
	 * @param cidades
	 * @param dataProva
	 * @param texto
	 * @param mensagem
	 */
	
	//método construtor
	
	public Comunicacao() {
	}

	
	public void adicionaCandidato(String candidato, String cidade, String dataProva, int texto) {
		for (int i= 0; i < this.candidatos.length; i++) {
			if (this.candidatos[i] == null) {
				this.candidatos[i] = candidato;
				this.cidades[i] = cidade;
				this.dataProva[i] = dataProva;
				this.texto[i] = texto;
				break;
			}
		}
	}
	
	/**
	 * adicionando mensagem 
	 * @param mensagem
	 */
	public void adicionaMsn(String mensagem) {
		for (int i= 0; i < this.candidatos.length; i++) {
			if (this.mensagens[i] == null) {
				this.mensagens[i] = mensagem;
			}
		}
	}
	
	/**
	 * 
	 * @param ind
	 * @return candidato indexado de ind
	 */
	
	public String getCandidato(int ind) {
		if (ind >= 0 && ind <= 10) {
			return this.candidatos[ind];
		}
		return null;
	}
	
	/**
	 * 
	 * @param ind
	 * @return cidade indexada de ind (cidades[ind])
	 */
	
	public String getCidade(int ind) {
		if (ind >= 0 && ind <= 10) {
			return this.cidades[ind];
		}
		return null;
	}
	
	/**
	 * 
	 * @param ind
	 * @return dataProva[ind]
	 */
	public String getDataProva(int ind) {
		if (ind >= 0 && ind <= 10) {
			return this.dataProva[ind];
		}
		return null;
	}
	
	/**
	 * 
	 * @param ind
	 * @return indice da menagem
	 */
	public int getTexto(int ind) {
		if (ind >= 0 && ind <= 10) {
			return this.texto[ind];
		}
		return 0;
	}
	
	/**
	 * 
	 * @param ind
	 * @return mensagem[ind]
	 */
	public String getMensagem(int ind) {
		if (ind >= 0 && ind <= 2) {
			return this.mensagens[ind];
		}
		return null;
	}
}
