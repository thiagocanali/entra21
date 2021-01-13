package lista9exercício3;

import java.util.Scanner;

public class exercício8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num=0;
		
		while (num != -1) {
		System.out.println("Digite um número de 1 a 10:");
		num = sc.nextInt();
		if(num==1) {
			System.out.println("Um");
		}else if (num==2) {
			System.out.println("Dois");
		}else if (num==3) {
			System.out.println("Três");
		}else if (num==4) {
			System.out.println("Quatro");
		}else if (num==5) {
			System.out.println("Cinco");
		}else if (num==6) {
			System.out.println("Seis");
		}else if (num==7) {
			System.out.println("Sete");
		}else if (num==8) {
			System.out.println("Oito");
		}else if (num==9) {
			System.out.println("Nove");
		}else if (num==10) {
			System.out.println("Dez");
		}else {
			System.out.println("Número inválido!");
		}
	}
	}

}
