import java.util.Scanner;

public class EntradaDados {
	public static void main (String[] args) {

        //Faca um programa que calcule com quatro operadores e utilize o scanner

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao programinha que faz cálculos.");

        System.out.println("Digite o primeiro número:");
        double n1 = sc.nextDouble();

        System.out.println("Digite o segundo número:");
        double n2 = sc.nextDouble();

        double soma = n1 + n2;
        double substracao = n1 - n2;
        double multiplicacao = n1 * n2;
        double divisao = n1 / n2;

        System.out.println("O resultado da soma: " + soma);
        System.out.println("O resultado da subtração: " + substracao);
        System.out.println("O resultado da multiplicação: " + multiplicacao);
        System.out.println("O resultado da divisão: " + divisao);

        sc.close();
        
	}
}
