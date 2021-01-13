import java.util.Scanner;

public class Tela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comunicacao comunicacao = new Comunicacao();

		comunicacao.adicionaMsn(" Prezado Sr. %1$s \n sua prova de javaScript ocorrerá no cidade %2s. \n No dia %3s ");
		comunicacao.adicionaMsn(" Prezado Sr. %1$s \n sua prova de POO ocorrerá no cidade %2s. \n No dia %3s ");
		comunicacao.adicionaMsn(" Prezado Sr. %1$s \n sua prova de html ocorrerá no cidade %2s. \n No dia %3s ");

		comunicacao.adicionaCandidato("João", "Blumenau", "11/11/2020", 2);
		comunicacao.adicionaCandidato("Maria", "Indaial", "1/11/2020", 0);
		comunicacao.adicionaCandidato("Julia", "Gaspar", "15/11/2020", 1);
		comunicacao.adicionaCandidato("Lucas", "Brusque", "3/11/2020", 0);
		comunicacao.adicionaCandidato("Luiz", "Joao Pessoa", "22/11/2020", 1);
		
		String candidat = "";
		String cidade = "";
		String dataProva = "";
		int indTexto = 0;
		String mensagem = "";
		
		for (int i = 0; candidat != null; i++) {
			
			candidat = comunicacao.getCandidato(i);
			cidade = comunicacao.getCidade(i);
			dataProva = comunicacao.getDataProva(i);
			indTexto = comunicacao.getTexto(i);
			mensagem = comunicacao.getMensagem(indTexto);
			String texto = String.format(mensagem, candidat, cidade, dataProva);
			System.out.println(texto);
		}
		

		
		
		
		

		
	}

}
