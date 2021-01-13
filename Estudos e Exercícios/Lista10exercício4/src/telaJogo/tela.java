package telaJogo;
import java.util.Scanner;

import sistema.Funções;

public class tela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		Funções funçoes = new Funções();
		String continua = "";
		
		//double resultado = calcSimples.somar(valor1, valor2);
			
			while (continua.equals("S")) {
				int oculto = funçoes.sortear();
				for (int i = 0; i < 3; i++) {
					System.out.println("Insira um número de 1 a 10:");
					int palpite = sc.nextInt();
					int status = funçoes.testarPalpite(palpite, oculto);
					
					if (status==0) {
						System.out.println("Acertou");
						break;
					}
					else if (status==-1) {
						System.out.println("O palpite é menor");
					}
					else if (status==1){
						System.out.println("O palpite é maior");
					}
				}
				
				System.out.println("Deseja continuar? 'S'im ou 'N'ão?");
			}
			
		}
}

