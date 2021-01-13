import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int i,n;
		System.out.printf("Informe o número para a tabuada:\n");
		n = sc.nextInt();
		
		//criando o arquivo
		FileWriter arq = new FileWriter("tabuada.txt");
		//gravando o arquivo
		PrintWriter gravarArq = new PrintWriter(arq);
		
		gravarArq.printf("---Resultado---%n");
		for ( i = 1; i <=10; i++) {
			gravarArq.printf(" | %2d X %d = %2d |%n ", i, n, (i*n));
			
		}
		gravarArq.printf("+-------------+%n");
		
		arq.close();
		
		System.out.printf("\nTabuada do %d foi gravada com sucesso!", n);
	}

}

