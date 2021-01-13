import java.util.Scanner;

public class exercício1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o fim");
		int fim = sc.nextInt();
		int i =0;
		while ( i <= fim) {
			i = i +2;
				System.out.println(i);
		}
  }
}
