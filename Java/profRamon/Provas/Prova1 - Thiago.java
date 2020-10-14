import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Prova1 {
	
	//Author : Thiago Canali Schwartz - E21 Java/Ang NOT 
	//Data : 01/10/2020

	public static void main(String[] args) {

//		questao1prova();
//		questao2prova();
//		questao3prova();
//		questao4prova();

	}

	public static void questao1prova() {

		/*
		 * Faça um algoritmo que receba dois números, calcule e mostre a divisão do
		 * primeiro número pelo segundo. Sabe-se que o segundo número não pode ser zero,
		 * portanto não é necessário se preocupar com validações.
		 */

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero1 = leia.nextInt();

		System.out.println("Digite outro número: ");
		int numero2 = leia.nextInt();

		if (numero2 == 0) {
			System.out.println("não pode ser zero");
		}

		int resultado = numero1 / numero2;

		System.out.println("O resultado da divisao do 1º numero pelo 2º é: " + resultado);
	}

	public static void questao2prova() {

		/*
			Faça um algoritmo que receba um número aleatório maior que 25, e calcule a soma dos
			números anteriores até ele. (ex: 10 = 10 + 9 + 8 + 7 + 6 + 5 + 4 + 2 + 1)
		 */	
		
		int numero = ThreadLocalRandom.current().nextInt(25,50);
		
		System.out.println("O número sorteado foi: "+numero);
		
		int numerosAnteriores = numero;
		
		for (int i = 0; i < numero; i++) {
			
			numerosAnteriores = (numerosAnteriores + i);

		}
		
		System.out.println("a soma dos numeros anteriores a ele é: " +numerosAnteriores);
		
	}

	public static void questao3prova() {
		
		/*
		 		Escreva um algoritmo que gere 500 valores inteiros e positivos e:
				a. encontre o maior valor;
				b. encontre o menor valor;
				c. calcule a média dos números lidos.
		 */
		
		int valorMaior = 0, valorMenor = 100, mediaValores;
		
		Random geraNum = new Random();

		int numeroGerado = 0, totalNumGerados = 0;
		int contador = 0, quantidadeGerados = 500;

		System.out.println("Números gerados: ");
		while (contador < quantidadeGerados) {
			numeroGerado = geraNum.nextInt(1000);
			System.out.print(numeroGerado + ", ");
			if (numeroGerado > valorMaior) {
				valorMaior = numeroGerado;
			}else if (numeroGerado < valorMenor){
				valorMenor = numeroGerado;
			}
			
			totalNumGerados = numeroGerado + totalNumGerados;
			contador++;
		}
			System.out.println("");
			System.out.println("O maior numero gerado foi: "+valorMaior);
			System.out.println("O menor numero gerado foi: "+valorMenor);
			System.out.println("A média dos "+quantidadeGerados+" numeros gerados é: "+totalNumGerados/quantidadeGerados);
			
	}

	public static void questao4prova() {

		/*	Faça um algoritmo que:
			a. Gere um número aleatório entre 1 e 15;
			b. Peça para o usuário escolher um número entre 1 e 15;
			c. Caso o usuário acerte o número gerado, o programa mostra a seguinte
			mensagem: “Usuário acertou o número gerado, Parabéns!”;
			d. Caso o usuário erre, o programa mostrará a mensagem: “Usuário não acertou,
			gostaria de tentar de novo?”;
			e. Mostre a Opção: “1 – Tentar novamente”, “0 – Sair”;
		*/
		
		int continuar = 1;
		
		do {
			
			int numeroGerado = ThreadLocalRandom.current().nextInt(1,15);
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("Digite um numero (de 1 a 15): ");
			
			int respUsuario = leia.nextInt();
			
			if (respUsuario == numeroGerado) {
				System.out.println("Usuário acertou o número gerado, Parabéns!");
			}else {
				System.out.println("Usuário não acertou, gostaria de tentar de novo?");
			}
			System.out.println("“1 – Tentar novamente”, “0 – Sair”");
			continuar = leia.nextInt();

		} while (continuar == 1);
		System.out.println("Você escolheu sair.");
	}
	

}
