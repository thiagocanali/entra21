import java.util.Scanner;

public class exercício2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Crie um programa para:
		- Ler 10 números.
		- Permitir ao usuário que escolha entre:
		o Ordenar em ordem crescente
		o Ordenar em ordem decrescente
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[10];
		String menu;
		int aux = 0;
				
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Informe " + i + " o número");
			numeros[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("Escolha a ordem:");
		System.out.println("C para crescente");
		System.out.println("D para decrescente");
		System.out.println("S para sair");
		menu = sc.next();
		
			
		if (menu.equalsIgnoreCase("C")) {
			boolean trocou = true;
			while (trocou) {
				trocou = false;
				for (int i = 0; i < numeros.length - 1; i++) {
					if (numeros[i] > numeros[i+1]) {
						trocou = true;
						int numTemp = numeros[i];
						numeros[i] = numeros[i+1];
						numeros[i+1] = numTemp;
					}
				}
			}
		}
		else if (menu.equalsIgnoreCase("D")) {
			boolean trocou = true;
			while (trocou) {
				trocou = false;
				for (int i = 0; i < numeros.length - 1; i++) {
					if (numeros[i] < numeros[i+1]) {
						trocou = true;
						int numTemp = numeros[i];
						numeros[i] = numeros[i+1];
						numeros[i+1] = numTemp;
					}
				}
			}
		}
		else {
			System.out.println("Opção inválida!");
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("num " + i + ":" + numeros[i]);
		}
		
	
		
		/*
		if (menu.equals("C")) {
			for (int i = 0; i < numeros.length; i++) {
				for (int j = 0; j < numeros.length; j++) {
					if (numeros[i] < numeros[j]) {
						aux = numeros[j];
						numeros[j] = numeros[i];
						numeros[i] = aux;
					}
				}
			}
			for (int i = 0; i < numeros.length; i++) {
				System.out.println(numeros[i]);
			}
		} else if (menu.equals("D")) {
			for (int i = 0; i < numeros.length; i++) {
				for (int j = 0; j < numeros.length; j++) {
					if (numeros[i] > numeros[j]) {
						aux = numeros[j];
						numeros[j] = numeros[i];
						numeros[i] = aux;
					}
				}
			}
			for (int i = 0; i < numeros.length; i++) {
				System.out.println(numeros[i]);
			}
		}
		*/

	}

}
