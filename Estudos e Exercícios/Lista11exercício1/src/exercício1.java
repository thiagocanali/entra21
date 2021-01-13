import java.util.Scanner;

public class exercício1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. Crie um programa para armazenar informações meteorológicas.
		- Crie um vetor para armazenar 30 temperaturas.
		- Calcular a média das temperaturas.
		- O usuário pode informar um dia qualquer e o programa deve dizer se a temperatura
		desse dia estava acima ou abaixo da média.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		double soma =0;
		double media =0;
		double[] temperaturas = new double[31];
		int dia =0;
		
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("Informe a temperatura:" + (i+1));
			temperaturas[i] = sc.nextDouble();
			 soma = soma + temperaturas[i];
		}
		
		media = soma/temperaturas.length;
		System.out.println("A média é:" + media);
		
		while (dia != -1) {
		
			System.out.println("Informe o dia:");
			dia = sc.nextInt();
			
			if (temperaturas[dia - 1] < media) {
				System.out.println("A temperatura desse dia estava abaixo da média");
			}
			else if (temperaturas[dia - 1] > media) {
				System.out.println("A temperatura desse dia estava acima da média");
			}
			else {
				System.out.println("A temperatura desse dia estava na média");
			}
			
		}
		
		
	}

}
