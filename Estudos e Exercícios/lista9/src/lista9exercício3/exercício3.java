package lista9exercício3;

import java.util.Scanner;

public class exercício3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		String continua = "S";
		
		while (continua.equals("S")) {
		System.out.println("Informe seu genero:");
		String genero = sc.next();
		System.out.println("Informe sua idade:");
		float idade = sc.nextInt();
		
		if (genero.equals("feminino") && idade>=55) {
			System.out.println("Você pode se aposentar!");
		}else if (genero.equals("masculino") && idade>=65) {
			System.out.println("Você pode se aposentar!");
		}else {
			System.out.println("Você não pode se aposentar!");
		}
				System.out.println("Deseja continuar? 'S'im ou 'N'ão");
				continua = sc.next();
		}

	}

}
