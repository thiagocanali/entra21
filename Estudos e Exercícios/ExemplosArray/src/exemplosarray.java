import java.util.Scanner;

public class exemplosarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  ler = new Scanner(System.in); 
		
		/*
		 * Primeira forma de declaração de Arrays
		 */
		int[] peso = new int[8]; //Declaração de um Array do tipo Inteiro de 8 posições   
		
		peso[0] = 34;  //Inicialização do Array  
		peso[1] = 25; 
		peso[2] = 55; 
		peso[3] = 115; 
		peso[4] = 87; 
		peso[5] = 90; 
		peso[6] = 86;
		peso[7] = 24; 
		
		
		/*
		 * Segunda forma de declarar um Array 
		 */
		int[] idades = {18, 25, 32, 17, 15};  //Declarando um Array do tipo Inteiro e inicializando o mesmo  
		                                      //Nesse tipo de declaração o Array pega o tamanho da quantidade de valores que foi passado  
		 
		/*
		 * Exemplo de relacionamento de dois Arrays pelo indexador
		 */
		
		String [] nomes = {
				"Joao", 
				"Pedrinho", 
				"Ma-ria", 
				"José", 
				"Fulano", 
		}; 
		
		int[] pesos = {
				34, 
				25, 
				55, 
				115, 
				87
		};
		
		 
		 
		pesos[2] = pesos[2] + 15; 
		
		
		
		System.out.println("Tamanho do Array: " + pesos.length);
				
		for (int i = 0; i < pesos.length; i++) {
			System.out.println("Nome: " + nomes[i]+ "   Peso: " + pesos[i]);
		
		}
		
		/*
		 * Exemplo completo: recebendo 4 notas do teclado, e calculo da média 
		 */
		double  somaNotas = 0; 
		float[] notas = new float[4]; 
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota " + i + " :");
			notas[i] = ler.nextFloat(); 
		}
		
		
		for (int i = 0; i < notas.length; i++) {
			somaNotas = somaNotas + notas[i]; 
		}
		
		double media = somaNotas/notas.length; 
		
		System.out.println("A média é: " + media);
		
	}

	}
