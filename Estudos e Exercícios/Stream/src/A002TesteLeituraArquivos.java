import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class A002TesteLeituraArquivos {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Fluxo de entrada
		InputStream fis = new FileInputStream("texto.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr); //usamos o buffer pois ele trabalha com strings
		
		
		String linha = br.readLine(); //checando se a linha está null
		
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
	}

}
