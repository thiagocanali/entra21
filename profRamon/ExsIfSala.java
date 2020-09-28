import java.util.Scanner;

public class ExsIfSala {

	public static void main(String[] args) {

//		exercicio7e8IFdia2409();
//

	}

	public static void exercicioif1sala() {

		// faça um programa que receba 2 valores e retorne o maior entre eles

		Scanner leia = new Scanner(System.in);

		System.out.println("informe o n1 :");
		int respota1 = leia.nextInt();

		System.out.println("informe o n2 :");
		int respota2 = leia.nextInt();

		if (respota1 > respota2) {
			System.out.println("numero 1 é maior, valor: " + respota1);
		} else {
			System.out.println("numero 2 é maior, valor: " + respota2);
		}
		leia.close();
	}

	public static void exercicioif2sala() {

		// faça um programa que receba 4 valores e retorne o menor entre eles

		Scanner leia = new Scanner(System.in);

		System.out.println("informe o n1 :");
		int respota1 = leia.nextInt();

		System.out.println("informe o n2 :");
		int respota2 = leia.nextInt();

		System.out.println("informe o n3 :");
		int respota3 = leia.nextInt();

		System.out.println("informe o n4 :");
		int respota4 = leia.nextInt();

		if (respota1 < respota2 && respota1 < respota3 && respota1 < respota4) {
			System.out.println("numero 1 é menor, valor: " + respota1);
		} else if (respota2 < respota1 && respota2 < respota3 && respota2 < respota4) {
			System.out.println("numero 2 é menor, valor: " + respota2);
		} else if (respota3 < respota1 && respota3 < respota2 && respota3 < respota4) {
			System.out.println("numero 3 é menor, valor: " + respota3);
		} else if (respota4 < respota1 && respota4 < respota2 && respota4 < respota3) {
			System.out.println("numero 4 é menor, valor: " + respota4);
		} else {
			System.out
					.println("mais de um valor igual: " + respota1 + "," + respota2 + "," + respota3 + "," + respota4);
		}
		leia.close();
	}

	public static void exercicioif3sala() {

		// faça um programa que verifique se o numero é impar (n - n/2*2=0)

		Scanner leia = new Scanner(System.in);

		System.out.println("informe um numero :");
		int respota = leia.nextInt();

		if (respota % 2 != 0) {
			System.out.println(respota + " é impar.");
		} else {
			System.out.println(respota + " é par.");
		}
		leia.close();
	}

	public static void exercicioif4sala() {
		/*
		 * fazer um programa que retorne o nome de um produto a partir do código do
		 * mesmo. Considere os seguintes códigos: 001 - Arroz; 002 - Feijão; 003 -
		 * Farinha; Para qualquer outro código indicar: Diversos.
		 */

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o código do produto: ");
		int numero = leia.nextInt();

		if (numero == 1) {
			System.out.println("o código do produto digitado foi: " + numero + " que é equivalente a: Arroz");
		} else if (numero == 2) {
			System.out.println("o código do produto digitado foi: " + numero + " que é equivalente a: Feijão");
		} else if (numero == 3) {
			System.out.println("o código do produto digitado foi: " + numero + " que é equivalente a: Farinha");
		} else {
			System.out.println("numero inválido");
		}
		leia.close();
	}

	public static void exercicioif5sala() {
		/*
		 * fazer um programa que retorne o nome de um produto a partir do código do
		 * mesmo. Considere os seguintes códigos: 001 - Arroz; 002 - Feijão; 003 -
		 * Farinha; Para qualquer outro código indicar: Diversos.
		 */

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o código do produto: ");
		int numero = leia.nextInt();

		if (numero == 1) {
			System.out.println("o código do produto digitado foi: " + numero + " que é equivalente a: Arroz");
		} else if (numero == 2) {
			System.out.println("o código do produto digitado foi: " + numero + " que é equivalente a: Feijão");
		} else if (numero == 3) {
			System.out.println("o código do produto digitado foi: " + numero + " que é equivalente a: Farinha");
		} else {
			System.out.println("numero inválido");
		}
		leia.close();
	}

	public static void exercicioif6sala() {
		/*
		 * Escreva um programa que verifique a validade de uma senha fornecida pelo
		 * usuário. A senha válida é o número 1234. Devem ser impressas as seguintes
		 * mensagens: ACESSO PERMITIDO caso a senha seja válida. ACESSO NEGADO caso a
		 * senha seja inválida.
		 */

		Scanner leia = new Scanner(System.in);

		String senhaValida = "1234";

		System.out.println("Digite a senha para entrar no programa: ");

		String senhaUsuario = leia.nextLine();

		if (senhaUsuario == senhaValida) {
			System.out.println("ACESSO PERMITIDO");
		} else {
			System.out.println("ACESSO NEGADO");
		}
		leia.close();

	}

	public static void exercicioif7sala() {

		/*
		 * As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$
		 * 0,25 se forem compradas pelo menos doze. Escreva um programa que leia o
		 * número de maçãs compradas, calcule e escreva o valor total da compra.
		 */

		Scanner leia = new Scanner(System.in);
		double totalCompra = 0;

		System.out.println("digite numero maçãs: ");
		double respostaUsuario = leia.nextInt();

		if (respostaUsuario < 12) {
			System.out.println("menos q uma duzia");
			totalCompra = respostaUsuario * 0.30;
		} else if (respostaUsuario >= 12) {
			System.out.println("pelo menos uma duzia");
			totalCompra = respostaUsuario * 0.25;
		} else {
			System.out.println("valor informado invalido");
		}
		leia.close();
	}

	public static void exercicioif8sala() {

		/*
		 * Escreva um programa para ler 3 valores inteiros (considere que não serão
		 * lidos valores iguais) e escrevê-los em ordem crescente.
		 */

		Scanner leia = new Scanner(System.in);
		int maior = 0;
		int menor = 0;
		int medio = 0;

		System.out.println("digite o primeiro valor: ");
		int valor1 = leia.nextInt();

		System.out.println("digite o segundo valor: ");
		int valor2 = leia.nextInt();

		System.out.println("digite o terceiro valor: ");
		int valor3 = leia.nextInt();

		if (valor1 != valor2 && valor1 != valor3 && valor2 != valor3) {
			System.out.println("valores aceitos");

			if (valor1 < valor2 && valor1 < valor3) {
				if (valor2 < valor3) {
					System.out.println(valor1 + ", " + valor2 + ", " + valor3);
				} else {
					System.out.println(valor1 + ", " + valor3 + ", " + valor2);
				}
			} else if (valor2 < valor1 && valor2 < valor3) {
				if (valor1 < valor3) {
					System.out.println(valor2 + ", " + valor1 + ", " + valor3);
				} else {
					System.out.println(valor2 + ", " + valor3 + ", " + valor1);
				}
			} else {
				if (valor2 < valor1) {
					System.out.println(valor3 + ", " + valor2 + ", " + valor1);
				} else {
					System.out.println(valor3 + ", " + valor1 + ", " + valor2);
				}
			}
			leia.close();
		}
	}

	public static void exercicio6IFdia2409() {

		/*
		 * TENDO COMO ENTRADA A ALTURA E O SEXO (1:FEMININO 2:MASCULINO) DE UMA PESSOA,
		 * CONSTRUA UM PROGRAMA QUE CALCULE E IMPRIMA SEU PESO IDEAL, UTILIZANDO AS
		 * SEGUINTES FÓRMULAS: - PARA HOMENS: (72.7*ALTURA) - 58 - PARA MULHERES:
		 * (62.1*ALTURA) - 44.7
		 */

		Scanner leia = new Scanner(System.in);

		double formula = 0;

		System.out.println("digite o sexo: (1 - Masculino | 2 - Feminino)");
		int sexo = leia.nextInt();

		System.out.println("digite a altura: ");
		double altura = leia.nextDouble();

		if (sexo == 1) {
			formula = (72.7 * altura) - 58;
		} else if (sexo == 2) {
			formula = (62.1 * altura) - 44.7;
		} else {
			System.out.println("Sexo iválido! " + sexo);
		}
		leia.close();
	}

	public static void exercicio7e8IFdia2409() {

		/*
		 * questao numero 7 e 8
		 * 
		 */

		Scanner leia = new Scanner(System.in);
		double resultado = 0;
		String operacao = "";
		double base = 0;
		double altura = 0;

		System.out.println("digite o numero de lados do poligono: ");
		int nLados = leia.nextInt();

		if (nLados == 3) {
			System.out.println("Polígono identificado como TRIANGULO.");
			System.out.println("digite o valor da base do triangulo (em cm): ");
			base = leia.nextDouble();
			System.out.println("digite o valor da altura do triangulo (em cm): ");
			altura = leia.nextDouble();
			resultado = (base * altura) / 2;
			operacao = "BASE x ALTURA / 2";
		} else if (nLados == 4) {
			System.out.println("Polígono identificado como QUADRADO.");
			System.out.println("digite o valor da base do quadrado (em cm): ");
			base = leia.nextDouble();
			System.out.println("digite o valor da altura do quadrado (em cm): ");
			altura = leia.nextDouble();
			resultado = (base * altura);
			operacao = "BASE x ALTURA";
		} else if (nLados == 5) {
			operacao = "não foi obtido, pois o Polígono foi identificado como PENTÁGONO.";
		} else if (nLados < 3) {
			operacao = "não foi obtido, NÃO É UM POLÍGONO.";
		} else if (nLados > 5) {
			operacao = "não foi obtido, POLÍGONO NÃO IDENTIFICADO.";
		} else {
			System.out.println("valor informado invalido");
		}
		System.out.println("O resultado da operação " + operacao + " : " + resultado);
		leia.close();
	}

}
