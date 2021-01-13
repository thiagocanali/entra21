import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Persistencia {
	
	//construtor
	public Persistencia() {
	}
	
	private FileWriter arquivo;	
	
	public FileWriter criaArq() throws IOException {
		//criando o arquivo
		 arquivo = new FileWriter("texto.csv", true);
		//true vai atualizar o arquivo
		return arquivo;
	}
	
	
	public PrintWriter salvar(DadosClima dados) {
		//gravando o arquivo
		PrintWriter gravarArq = new PrintWriter(arquivo);
		gravarArq.print(dados);
		return gravarArq;
	}
	
	
	public String consultaData(double[] data) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == data[i]) {
				
			}
		}
		return null;
	}
	
	
	//com data início e data fim
	private double media;
	public double CalculaMedia(double[] data, double[] temp) {
		for (int i = 0; i < temp.length && i < data.length; i++) {
			double total = temp[i] + data[i];
			media = total/data.length;
		}
		return media;
	}
	
	
	//com data início, data fim e data base
	public String CalculaMediaBase(double[] data, double[] temp, int dataBase) {
		for (int i = 0; i <= dataBase; i++) {
			if (media<dataBase) {
				return "Este dia a temp estava acima da média " + media;
			}
			else if (media>dataBase) {
				return "Este dia a temp estava abaixo da média " + media;
			}
		}
		return "Este dia a temp estava na média " + media;
	}
	
	
	public PrintWriter fecharArq() throws IOException {
		//fechando o arquivo
		arquivo.close();
		return null;
	}
	
}
