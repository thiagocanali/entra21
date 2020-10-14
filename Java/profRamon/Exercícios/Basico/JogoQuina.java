import java.util.Random;
import java.util.Scanner;


public class JogoQuina {

	public static void main(String[] args) {
		// Jogo Quina
        Scanner entradaDados = new Scanner(System.in);
        Random numRandom = new Random();
        int[] jogoDoUsuario = new int[5];
        int[] resultadoDoJogo = new int[5];
        int[] pontuacaoUsuario = {0, 1, 3, 10, 50, 100};
        int qtdAcertos = 0;
        String[] posicaoTexto = {"Primeiro", "Segundo", "Terceiro", "Quarto", "Quinto"};
        String resultadoTexto="";
        
        //1.a Boas vindas e informar o Nome do Jogo
        System.out.println("Seja Bem-vindo ao jogo da Quina.");
        System.out.println("--------------------------------");
        
        //1.b
        System.out.println("Você precisa acertar 5 números de 1 a 25.");
        System.out.println("A pontuação vai de acordo com a quantidade de acertos.");
        System.out.println("--------------------------------");
        System.out.println("0 acertos - 0 pts.");
        System.out.println("1 acertos - 1 pts.");
        System.out.println("2 acertos - 3 pts.");
        System.out.println("3 acertos - 10 pts.");
        System.out.println("4 acertos - 50 pts.");
        System.out.println("5 acertos - 100 pts.");
        System.out.println("--------------------------------");
        
        //2 pedir pro usuario informar os valores
        for(int i = 0; i < 5; i++) {
        	System.out.println("Informe o " + posicaoTexto[i] + " valor:");
        	jogoDoUsuario[i] = entradaDados.nextInt();
        }
        
        //3 gerar e informar o resultado da quina
        for(int i=0; i< 5; i++) {
        	boolean controlaNumeros = true;
        	int numeroGerado= (numRandom.nextInt(24) + 1);
        	
        	if(i >0) {
	        	while(controlaNumeros) {
	        		controlaNumeros = false;
	        		for(int iControla=0; iControla< i; iControla++) {
	        			if(numeroGerado == resultadoDoJogo[iControla]) {
	        				controlaNumeros = true;
	                		numeroGerado = (numRandom.nextInt(24) + 1);
	        			}
	        		}
	        	}
        	}
        	resultadoDoJogo[i] = numeroGerado;
        	
        }
        
        for(int i=0; i< 5; i++) {
        	resultadoTexto += i == 0 ? "| " : ""; // inserir a barra no início
        	resultadoTexto += resultadoDoJogo[i] + " | ";
        }
        System.out.println("Resultado da Quina: " + resultadoTexto);
        
        for(int i=0; i<5; i++) {
        	for(int iJogo=0; iJogo<5; iJogo++) {
        		if(jogoDoUsuario[i] == resultadoDoJogo[iJogo]) {
        			qtdAcertos++;
        			break;
        		}
        	}
        }
        
        System.out.println("Você fez " + pontuacaoUsuario[qtdAcertos] + " pontos!");
        
        entradaDados.close();
        System.exit(0);
	}
}
