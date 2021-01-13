package Telas;

import java.util.Scanner;

import banco.Banco;
import banco.Cliente;
import banco.Conta;

public class MenuPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char menu = ' '; 
		Scanner teclado = new Scanner(System.in); 
		
		Banco bancoBlumenau = new Banco(); 
		
		while(menu != 'F') {
			System.out.println("Menu Principal:");
			System.out.println("'A'brir Conta");
			System.out.println("'D'epositar");
			System.out.println("'S'acar");
			System.out.println("'V'erificar saldo");
			System.out.println("'F'im");
			menu = teclado.next().toLowerCase().charAt(0);
			
			switch (menu) {
			//case 'C':
			case 'a': 
				System.out.println("Nome Cliente: ");
				String nome = teclado.next();
				System.out.println("CPF: ");
				String cpf = teclado.next();
				System.out.println("RG: ");
				String rg = teclado.next();
				System.out.println("Endereço: ");
				String endereco = teclado.next(); 
				
				Cliente cliente = new Cliente(nome, cpf, rg, endereco, null);
				
				System.out.println("Numero da nova Conta: ");
				int numConta = teclado.nextInt();
				System.out.println("Tipo de Conta '1' - CC ou '2' - CP");
				int tipo = teclado.nextInt(); 
				
				Conta conta = new Conta(numConta, tipo, 123456, bancoBlumenau);
				cliente.setConta(conta);
				bancoBlumenau.adicionaCliente(cliente); 
				
				break;
				
			case 'd': 
				System.out.println("Num da conta do Cliente: ");
				 numConta = teclado.nextInt();
				
				
				System.out.println("Valor Deposito: ");
				double valorDeposito = teclado.nextDouble();
				
				String msnRetorno = bancoBlumenau.getClienteConta(numConta).getConta().depositar(valorDeposito); 
				System.out.println(msnRetorno);
				
				break;			

			case 's': 
				
				System.out.println("Número da conta do Cliente: ");
				numConta = teclado.nextInt(); 
				
				System.out.println("Valor do Saque:");
				double valorSaque = teclado.nextDouble(); 
				
				msnRetorno = bancoBlumenau.getClienteConta(numConta).getConta().sacar(valorSaque); 
				System.out.println(msnRetorno);
				
				
				break;
			
			case 'v':
					System.out.println("Número da conta do cliente");
					numConta = teclado.nextInt();
				
					double saldo = bancoBlumenau.getClienteConta(numConta).getConta().getSaldo();
					System.out.println("Saldo: " + saldo);
				
				break;
				
			default:
				System.out.println("Opção Inválida!");
				break;
			}
			
		}
		
	}

}
