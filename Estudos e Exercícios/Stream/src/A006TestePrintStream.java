import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class A006TestePrintStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		PrintStream ps = new PrintStream("Textos4.txt");
	
		ps.println("Olá mundo!!");
		ps.println("....");
		
		ps.close();
	}

}
