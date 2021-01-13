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
import java.net.Socket;

public class A004TesteOutrasEntrdaseSaidas {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Socket s = new Socket();
		
		
		//Fluxo de entrada
		
		InputStream fis = System.in; //lendo o teclado
		//InputStream fis = s.getInputStream(); //pegando da rede
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr); //usamos o buffer pois ele trabalha com strings
				
		//Fluxo de saida
		OutputStream fos = System.out; //escrevendo no console 
		//OutputStream fos = s.getOutputStream(); //colocando na rede
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine(); //checando se a linha está null
		while (linha != null && !linha.isEmpty()) {
			bw.write(linha); //enchendo o buffer
			bw.newLine();
			bw.flush(); //descarregando o buffer
			linha = br.readLine();
		}
		
		br.close();
		bw.close();
				

	}

}
