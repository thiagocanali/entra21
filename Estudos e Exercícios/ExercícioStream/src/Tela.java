import java.io.*;
import java.util.Scanner;

public class Tela {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		DadosClima dados = new DadosClima();
		Persistencia persistencia = new Persistencia();
		
		
		Scanner scanner = new Scanner(new File("texto.csv")); //vai ler o arquivo
		
		String opcao = " ";
		int qtd;
		double[] temps = new double[100];
		double[] data = null;
		String[] hora = null;
		double[] temp = null;
		
		System.out.println("'I'nserir temperatura");
		System.out.println("'C'onsultar temperatura");
		opcao = scanner.next();
		
		if (opcao.equals("I")) {
			System.out.println("Quantas temperaturas deseja inserir?");
			 qtd = scanner.nextInt();

			while(temps[qtd] < qtd) {
				System.out.println("Data:");
				dados.setData(data);
				System.out.println("Hora:");
				dados.setHora(hora);
				System.out.println("Temperatura:");
				dados.setTemp(temp);
			}
			
		}
		else if (opcao.equals("C")) {
			for (int j = 0; j < temps.length; j++) {
				System.out.println("Data da consulta:");
				dados.getData();
				System.out.println("Hora da consulta:");
				dados.getHora();
				double[] tempResul = dados.getTemp();
				System.out.println(tempResul);
				
			}
			
		}
	}

}
