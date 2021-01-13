import java.util.Scanner;

public class exercício2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o fim da contagem");
		int fim = sc.nextInt();
		int resto;
		for ( int i=0; i <=fim; i = i +2) {
			resto = i%2;
			if (resto==0) {
				System.out.println(i);
			}
		}
	}

}
