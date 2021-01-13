import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class A007TestePrintWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		PrintWriter pw = new PrintWriter("Textos5.txt");
	
		
		
		pw.println("Olá mundo!!");
		pw.println("....");
		
		pw.close();
	}

}
