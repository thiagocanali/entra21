import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class A001TesteEscritaArquivo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//conjunto básico para fazer o stream de dados no java
		//stream de saida
		OutputStream fos = new FileOutputStream("texto.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Olá mundo");
		bw.newLine();
		bw.write("Isto é um arquivo gerado pelo java");
		
		bw.close();
		
		
		
	}

}
