import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Exercicios exercicios = new Exercicios();
		Scanner scVals = new Scanner(System.in);
		int[] arNumeros = new int[10]; 
		int menor = 10000;
		int maior = 0;
		int contador = 0;
		
		System.out.println("Favor informar 10 números!");
		
		while(contador < arNumeros.length) {
			System.out.println("Informe o numero " + (contador + 1));
			arNumeros[contador] = scVals.nextInt();
			contador++;
		}
		scVals.close();
		
		contador = 0;
		while(contador < arNumeros.length) {
			System.out.println("Indice " + contador + " - " + arNumeros[contador]);
			contador++;
		}
		
		contador = 0 ;
		while(contador < arNumeros.length){
			int valorArray = arNumeros[contador];
			if(valorArray < menor ) {
				menor = valorArray;
			}
			contador++;
		}
		
		contador = 0;
		while(contador < arNumeros.length) {
			if(arNumeros[contador] == menor) {
				System.out.println("Posição do menor número é: " + contador);
				contador = 10;
			}
			contador++;
		}
		
		System.out.println("Menor número é: " + menor);
		
		System.exit(0);
	}	
}
