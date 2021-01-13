import java.util.Scanner;
import java.util.Random;


public class Revisão {
	public static void main(String[] args) {
	
		 
	int i; 
	int [] vetor1 = new int [16];
	int real;
	
	Scanner sc = new Scanner(System.in);
	
	for (i = 0; i < vetor1.length; i= i+1) {
		real = i + 1;
		System.out.println("Entra com o valor "+ real +" ai ");
		vetor1[i]= sc.nextInt();
		
	}sc.close();
	}
	
}

		
