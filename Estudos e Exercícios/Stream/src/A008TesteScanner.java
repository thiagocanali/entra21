import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class A008TesteScanner {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(new File("contas.csv")); //vai ler o arquivo

		//	scanner.hasNext();  //retorna true ou false
		
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			
			Scanner scannerLinha = new Scanner(linha); //vai ler a linha
			scannerLinha.useLocale(Locale.US);
			scannerLinha.useDelimiter(",");
			
			String tipoConta = scannerLinha.next();
			String numConta = scannerLinha.next();
			int agencia = scannerLinha.nextInt();
			String nome = scannerLinha.next();
			double saldo = scannerLinha.nextDouble();
			
			
			System.out.format(Locale.US , "%s : %s, : %d, : %20s, : %10.2f %n", tipoConta, numConta, agencia, nome, saldo);
			//é o mesmo que system.out.printf
			//o %n vai pular a linha
			
			
		}
		
		
		
		scanner.close();
	}

}
