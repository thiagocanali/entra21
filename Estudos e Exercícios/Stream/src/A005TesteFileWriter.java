import java.io.FileWriter;
import java.io.IOException;

public class A005TesteFileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter fw = new FileWriter("Textos3.txt");
	
		fw.write("Isso é um texto...");
		fw.write(System.lineSeparator()); //System.lineSeparator() quebra a linha 
		fw.write("teste");
		
		fw.close();
		
	}

}
