import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Persistencia {

	private String arquivo;
	private char separador;
	
	
	/**
	 * @param arquivo
	 * @param separador
	 */
	public Persistencia(String arquivo, char separador) {
		this.arquivo = arquivo;
		this.separador = separador;
	}
	
	/**
	 * salva dados metereologicos na base de dados
	 * @param DadosClima
	 * @throws IOException
	 */
	public void salvar(DadosClima dc) throws IOException {
		String dado = dc.getData() + separador + dc.getHora() + separador + dc.getTemperatura();
		gravarArquivo(dado);
	}
	
	

	/**
	 * grava dados no arquivo
	 * @param dado
	 * @throws IOException
	 */
	private void gravarArquivo(String dado) throws IOException {	
		FileWriter fw = new FileWriter(this.arquivo, true);
		
		fw.write(dado);
		fw.write(System.lineSeparator()); //quebra a linha 
		fw.close();
	}
	
	/**
	 * busca dados de uma data em específico
	 * @param dataRef
	 * @return DadosClima - dados do clima na data indicada por dataRef
	 * @throws FileNotFoundException
	 */
	public DadosClima lerArquivo(String dataRef) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(this.arquivo)); //vai ler o arquivo

		//	scanner.hasNext();  //retorna true ou false
		
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			
			Scanner scannerLinha = new Scanner(linha); //vai ler a linha
			scannerLinha.useLocale(Locale.US);
			scannerLinha.useDelimiter(String.valueOf(this.separador));
			
			String data = scannerLinha.next();
			String hora = scannerLinha.next();
			float temp = scannerLinha.nextFloat();
			scanner.close();
			scannerLinha.close();
			
			if (data.equals(dataRef)) {
				DadosClima dc = new DadosClima(data, hora, temp);
				return dc;
			}
			
			
			DadosClima dc = new DadosClima(data, hora, temp);
			return dc;
		}
		
		return null;
	}
	
	
	
	
	
	/**
	 * @return the arquivo
	 */
	public String getArquivo() {
		return arquivo;
	}
	/**
	 * @param arquivo the arquivo to set
	 */
	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}
	/**
	 * @return the separador
	 */
	public char getSeparador() {
		return separador;
	}
	/**
	 * @param separador the separador to set
	 */
	public void setSeparador(char separador) {
		this.separador = separador;
	}
	
	
	
}
