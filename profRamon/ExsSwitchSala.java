import java.util.Scanner;

public class ExsSwitchSala {

	public static void main(String[] args) {

//		exSwitch1();
//		exSwitch2();
//		exSwitch3();
//		exSwitch4();

	}

	public static void exSwitch1() {

		/*
		 * 1. Crie uma variável chamada “fruta”. Esta variável deve receber uma string
		 * com o nome de uma fruta. Após, crie uma estrutura condicional switch que
		 * receba esta variável e que possua três casos: caso maçã, retorne no console:
		 * “Não vendemos esta fruta aqui”. Caso kiwi, retorne: “Estamos com escassez de
		 * kiwis” e caso melancia, retorne: “Aqui está, são 3 reais o quilo”.
		 */

		Scanner leia = new Scanner(System.in);

		System.out.println("Frutas: Maca, Kiwi e Melancia.");

		System.out.print("Digite uma fruta: ");

		String fruta = leia.next();

		switch (fruta.toLowerCase()) {
		case "maca":
			System.out.println("Não vendemos esta fruta aqui.");
			break;
		case "kiwi":
			System.out.println("Estamos com escassez de kiwis.");
			break;
		case "melancia":
			System.out.println("Aqui está, são 3 reais o quilo.");
			break;
		default:
			System.out.println("Fruta não reconhecida...");
			break;
		}
		leia.close();
	}

	public static void exSwitch2() {

		/*
		 * 2. Um homem decidiu ir à uma revenda comprar um carro. Ele deseja comprar um
		 * carro hatch, e a revenda possui, além de carros hatch, sedans, motocicletas e
		 * caminhonetes. Utilizando uma estrutura switch/case, caso o comprador queira o
		 * hatch, retorne: “Compra efetuada com sucesso”. Nas outras opções, retorne:
		 * “Tem certeza que não prefere este modelo?”. Caso seja especificado um modelo
		 * que não está disponível, retorne no console: “Não trabalhamos com este tipo
		 * de automóvel aqui”.
		 */

		Scanner leia = new Scanner(System.in);
		System.out.println("Escolha um modelo de automóvel.");
		System.out.println("Informe o código de veículo desejado: ");
		System.out.println("CH - Carros Hatch");
		System.out.println("CS - Carros Sedan");
		System.out.println("M - Motocicletas");
		System.out.println("CNT - Caminhonetes");

		String codigoVeiculo = leia.next();

		switch (codigoVeiculo.toLowerCase()) {
		case "ch":
			System.out.println("Compra de um Hatch efetuada com sucesso.");
			break;
		case "cs":
			System.out.println("Tem certeza que prefere este modelo? S/N");
			String confirmacaoSedan = leia.next();

			String compraSedan = confirmacaoSedan.equalsIgnoreCase("S") ? "Compra de um Sedan efetuada com sucesso."
					: confirmacaoSedan.equalsIgnoreCase("N") ? "Compra cancelada."
							: "Opção inválida. '" + confirmacaoSedan + "'";

			System.out.println(compraSedan);
			break;
		case "m":
			System.out.println("Tem certeza que prefere este modelo? S/N");
			String confirmacaoMotocicleta = leia.next();

			String compraMotocicleta = confirmacaoMotocicleta.equalsIgnoreCase("S")
					? "Compra de um Sedan efetuada com sucesso."
					: confirmacaoMotocicleta.equalsIgnoreCase("N") ? "Compra cancelada."
							: "Opção inválida. '" + confirmacaoMotocicleta + "'";

			System.out.println(compraMotocicleta);
			break;
		case "cnt":
			System.out.println("Tem certeza que prefere este modelo? S/N");
			String confirmacaoCaminhonete = leia.next();

			String compraCaminhonete = confirmacaoCaminhonete.equalsIgnoreCase("S")
					? "Compra de um Sedan efetuada com sucesso."
					: confirmacaoCaminhonete.equalsIgnoreCase("N") ? "Compra cancelada."
							: "Opção inválida. '" + confirmacaoCaminhonete + "'";

			System.out.println(compraCaminhonete);
			break;
		default:
			System.out.println("Código inválido. '" + codigoVeiculo + "'");
			break;
		}
		leia.close();
	}

	public static void exSwitch3() {

		/*
		 * 3. Faça um programa que simule uma calculadora, onde informa as opções pro
		 * usuário escolher qual operação deseja realizar, e em seguida informe dois
		 * números para realizar a operação. Use o case para programar as operações
		 * específicas. (soma, subtração, multiplicação e divisão)
		 * 
		 */

		Scanner leia = new Scanner(System.in);
		System.out.println("Escolha uma operação: +, -, x, /");
		String operacao = leia.next();
		int numero1 = 0, numero2 = 0;
		Integer resultado = null;

		if (operacao.equals("+") || operacao.equals("-") || operacao.equals("x") || operacao.equals("/")) {
			System.out.print("Digite o primeiro número: ");
			numero1 = leia.nextInt();
			System.out.print("Digite o segundo número: ");
			numero2 = leia.nextInt();
		} else {
			System.out.println("Operação não reconhecida. '" + operacao + "'");
		}
		switch (operacao) {
		case "+":
			resultado = numero1 + numero2;
			break;
		case "-":
			resultado = numero1 - numero2;
			break;
		case "x":
			resultado = numero1 * numero2;
			break;
		case "/":
			resultado = numero1 / numero2;
			break;
		default:
			break;
		}
		leia.close();
		if (resultado != null) {
			System.out.println(
					"O resultado da operação " + numero1 + " " + operacao + " " + numero2 + " é: " + resultado);
		}

	}

	public static void exSwitch4() {

		/*
		 * 4. Faça um programa que mostre opção de Tipos de produtos para o usuário, e
		 * após o usuário escolhe o tipo de produto, apresente várias opções. Exemplo:
		 * Produtos Não-perecíveis: arroz, feijão, café; Frutas: manga, banana, maçã;
		 * Bebidas: leite, sucos, refrigerantes
		 */

		Scanner leia = new Scanner(System.in);

		System.out.println("Escolha uma categoria: ");
		System.out.println("1 - Produtos não-perecíveis");
		System.out.println("2 - Frutas");
		System.out.println("3 - Bebidas");

		int escolhaCategoria = leia.nextInt();

		switch (escolhaCategoria) {
		case 1:
			System.out.println("Arroz, feijão, café");
			break;
		case 2:
			System.out.println("Maçã, banana, manga, melancia");
			break;
		case 3:
			System.out.println("Energético, suco, leite, refrigerante");
			break;
		default:
			System.out.println("Produto não reconhecido!");
			break;
		}
		leia.close();
	}

}
