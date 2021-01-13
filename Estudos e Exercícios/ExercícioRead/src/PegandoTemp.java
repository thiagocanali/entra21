
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PegandoTemp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		float[] temp = new float[5]; 
		//double  somaTemp = 0;
		//double  mediaTemp = 0; 
		//int     dia = 0; 
		
		Scanner ler = new Scanner(System.in); 
		
		//temp[0] = 15.5f; 
		
		for (int i = 0; i < temp.length; i++) {
			System.out.println("Informe a teperatura do dia " + (i + 1));
			temp[i] = ler.nextFloat();
			
			//somaTemp = somaTemp + temp[i];
		}
		
			//criando/escrevendo o arquivo
			FileWriter arq = new FileWriter("temperaturas.txt");
			//gravando o arquivo
			PrintWriter gravarArq = new PrintWriter(arq);
			
			gravarArq.print(temp);
			
			arq.close();
			
		
		System.out.printf("Informe o nome do arquivo:\n");
		String nome = ler.next();
				
		gravarArq.printf("---Resultado---%n");
		
		//lendo o arquivo
		FileReader arqq = new FileReader(nome);
		BufferedReader lerArq = new BufferedReader(arqq);
		
		String linha = lerArq.readLine();
		
		while (linha != null) {
			System.out.println(linha);
			linha = lerArq.readLine();
		}
		
		/*
		mediaTemp = somaTemp/temp.length; 
		
		
		while (dia != -1) {
			System.out.println("Para consultar a temperatura informe um dia entre 1 e 30 ou -1 p/ Sair");
			dia = ler.nextInt();
			
			if (dia >= 1 && dia <= 5) {
				if (temp[dia - 1] == mediaTemp) {
					System.out.println("A temperatura ( " + temp[dia - 1] + " ) está na média ("+ mediaTemp +")");
				}else if (temp[dia - 1] > mediaTemp) {
					System.out.println("A temperatura ( " + temp[dia - 1] + " ) está acima da média ("+ mediaTemp +")");
				}else {
					System.out.println("A temperatura ( " + temp[dia - 1] + " )está abaixo da média ("+ mediaTemp +")");
				}
			}
			
		}
*/
	}

}

