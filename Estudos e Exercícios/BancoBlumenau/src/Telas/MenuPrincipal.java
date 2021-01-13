package Telas;

import java.util.Scanner;

public class MenuPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char menu;
		
		Banco bancoBlumenau = new Banco();
		
		System.out.println("Menu principal:");
		System.out.println("'A'brir conta");
		System.out.println("'D'epositar");
		System.out.println("'S'acar");
		menu = sc.next().charAt(0);
		
		switch (menu) {
		case 'A':
		case 'a':
			System.out.println("Nome cliente:");
			String nome = sc.next();
			System.out.println("CPF:");
			String cpf = sc.next();
			System.out.println("RG:");
			String rg = sc.next();
			System.out.println("Endereço:");
			String endereco = sc.next();
			
			Cliente cliente = new Cliente(nome, cpf, rg, endereco, null);
			
			System.out.println("Número da nova conta:");
			int numConta = sc.nextInt();
			System.out.println("Tipo da conta '1' CC ou '2' CP");
			int tipo = sc.nextInt();
			
			Conta conta = new Conta(numConta, tipo, 123456, bancoBlumenau);
			cliente.setConta(conta);
			bancoBlumenau.adicionarCliente(cliente);
			
			break;
		case 'D':
		case 'd':
			System.out.println("Código do cliente:");
			int codCliente = sc.nextInt();
			
			System.out.println("Valor do depósito:");
			double valorDeposito = sc.nextDouble();

			bancoBlumenau.getCliente(codCliente).getConta(valorDeposito);
			
			
			break;
		case 'S':
		case 's':
			
			
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}
		
		
	}

}
