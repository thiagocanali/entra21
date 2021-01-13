import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class A003TesteCopiaArquivos {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Fluxo de entrada
		InputStream fis = new FileInputStream("texto.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr); //usamos o buffer pois ele trabalha com strings
				
		//Fluxo de saida
		OutputStream fos = new FileOutputStream("texto.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine(); //checando se a linha está null
		
		while (linha != null) {
			bw.write(linha);
			bw.newLine();
			
			linha = br.readLine();
		}
		
		br.close();
		bw.close();
				

	}

}
