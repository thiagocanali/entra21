import java.util.Scanner;

public class exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);   
		
		//usado para aplicações onde sabemos exatamente a qtd de vezes que o código é executado 
		for (int i = 0; i < 10; i++) {
			System.out.println("i: " + i);
		}
		
        //Esta estrutura tem o mesmo efeito da estrutura FOR acima
		int l = 0; 
		while (l < 10) {
			System.out.println("l: " + l);
            l++; 
		}
		
		
		//usado quando não sabemos quantas vezes o código deverá ser executado
		int j = 0; 
		while (j != -1) {
			System.out.println("j: " + j);
			System.out.println("Informe -1 para parar");
			j = ler.nextInt(); 
		}
		
		
		/*Estrutura de seleção semelhante ao WHILE, com a única diferença que no DO-WHILE o teste da condição de parada 
		 *é executado após executar o bloco de código contido na estrutura de repetição. No WHILE, por outro lado, o teste 
		 *é executado antes de executar o blóco lógico contido na estrutura. 
		 */
		do {
			System.out.println("j: " + j);
			System.out.println("Informe -1 para parar");
			j = ler.nextInt(); 
		} while (j != -1);
		

	}

}
