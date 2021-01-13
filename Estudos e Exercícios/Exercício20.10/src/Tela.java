import java.util.Scanner;

public class Tela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ItemPedido itemPedido;
		char menu = ' ';
		double valorFinal = 0;
		double valor = 0;
		String resposta = " ";
		
		while(menu!='S' || menu!='s') {
			
		System.out.println("-----Menu Principal-----");
		System.out.println("'C'adastrar item");
		System.out.println("'F'azer pedido");
		System.out.println("'S'air");
		menu = sc.next().charAt(0);
		
		
		switch (menu) {
		case 'C':
		case 'c':
				System.out.println("Cod do item");
				int cod = sc.nextInt();
				System.out.println("Descrição do item");
				String descricao = sc.next();
				System.out.println("Valor unitário do item");
				valor = sc.nextDouble();
				System.out.println("Quantidade do item");
				int qtd = sc.nextInt();
				itemPedido = new ItemPedido (cod, descricao, valor, qtd);
			break;
			
		case 'F':
		case 'f':
				System.out.println("Nome:");
				String nome = sc.next();
				System.out.println("CPF:");
				String cpf = sc.next();
				System.out.println("RG:");
				String rg = sc.next();
				System.out.println("Telefone:");
				String telefone = sc.next();
				
				Cliente cliente = new Cliente(nome, cpf, rg, telefone);
				
				System.out.println("Num do pedido:");
				int numPedido = sc.nextInt();
				
				Pedido pedido = new Pedido(numPedido, clientes);
				
				do {
					System.out.println("Descrição do item: ");
					 descricao = sc.next();
					System.out.println("Quantidade: ");
					qtd = sc.nextInt();
					
					valorFinal = valor*qtd;
					
					System.out.println("Mais algum item? 'S'im ou 'N'ão?");
					 resposta = sc.next();
					
				} while (resposta.equalsIgnoreCase("s"));
				
				

			break;
			
		case 'S':
		case 's':
			System.out.println("Finalizando programa...");
			break;

		default:
			System.out.println("Opção inválida!");
			break;
		}
		
		if (menu=='S' || menu=='s') {
			break;
		}
		}
	}

}
