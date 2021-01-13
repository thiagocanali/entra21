import java.util.Scanner;

public class exercício3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o fim da contagem");
		int fim = sc.nextInt();
		System.out.println("Informe se você quer números 'I'mpares ou 'P'ares");
		String resposta = sc.next();
		
			if (resposta.equals("P")) {
				for (int i = 0; i < fim; i++) {
					double resto=0;
					if (resto==0) {
						System.out.println("Pares "+i);
					} else {
						for (int j = 1; j < fim; j= j+2) {
									System.out.println(j);
						}		
					  }	
				}	
			}		
		}	
}

