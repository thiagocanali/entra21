import java.util.Scanner;

public class exercício6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em graus celsius:");
		double celsius = sc.nextDouble();
		double fahrenheit =(9*celsius+160)/5;
		System.out.println("A temperatura em fahrenheit é: " + fahrenheit);
	}

}
