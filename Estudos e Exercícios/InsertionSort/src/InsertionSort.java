import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*começa na posição 1 e compara com a 0
		se for menor troca, compara a posição 1 com a 2
		se for menor troca...
		*/
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[20];
		int ordem;
		int temp;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Informe os números:");
			numeros[i] = sc.nextInt();
			System.out.println("Digite 1 para ordenar em crescente ou 2 para decrescente:");
			ordem = sc.nextInt();
			
			   if (ordem == 1){
			      System.out.println("Array em ordem crescente: ");
			    	  for (int j = 1; j < numeros.length; j++) {
			              i = j;
			              	while (i > 0 && numeros[i - 1] < numeros[i]) {
			                    temp = numeros[i];
			                    numeros[i] = numeros[i - 1];
			                    numeros[i - 1] = temp;
			                    i--;
			                    System.out.println(numeros[i]);
			              }
			   }
			
		} else if (ordem == 2) {
			      System.out.println("Array em ordem decrescente: ");
			    	  for (int j = 1; j < numeros.length; j++) {
			              i = j;
			              while (i > 0 && numeros[i - 1] > numeros[i]) {
			                    temp = numeros[i];
			                    numeros[i] = numeros[i - 1];
			                    numeros[i - 1] = temp;
			                    i--;
			                    System.out.println(numeros[i]);
	              }
			   }
			}
		}

	}

}
