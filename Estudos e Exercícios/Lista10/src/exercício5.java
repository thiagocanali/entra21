import java.util.Scanner;

public class exercício5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String continua = "S";
		
		while (continua.equals("S")) {
			System.out.println("Informe a primeira nota");
			float nota1 = sc.nextFloat();
			System.out.println("Informe a segunda nota");
			float nota2 = sc.nextFloat();
			System.out.println("Informe a terceira nota");
			float nota3 = sc.nextFloat();
			System.out.println("Informe a quarta nota");
			float nota4 = sc.nextFloat();
				if (nota1<nota2 && nota1<nota3 && nota1<nota4) {
					float media = (nota2+nota3+nota4)/3;
							System.out.println("A média é:" + media);
				}  else if (nota2<nota1 && nota2<nota3 && nota2<nota4) {
					float media = (nota1+nota3+nota4)/3;
					System.out.println("Média:" + media);
				}  else if (nota3<nota1 && nota3<nota2 && nota3<nota4) {
					float media = (nota1+nota2+nota4)/3;
				} else if (nota4<nota1 && nota4<nota2 && nota4<nota3) {
					float media = (nota1+nota2+nota3)/3;
					System.out.println("Média:"+media);
				}
				System.out.println("Deseja continuar?");
				continua = sc.next();
		}
		
	}

}
