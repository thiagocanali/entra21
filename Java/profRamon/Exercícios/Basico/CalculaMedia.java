import java.util.Scanner;

public class CalculaMedia {
	public static void main (String[] args) {

        /*
        entrar com 4 valores e calcular a media desses valores
        */

        //declaração das variáveis que serão utilizadas
        int n1, n2, n3, n4;
        int soma;

        //classe que irá monitorar o teclado
        Scanner sc = new Scanner(System.in);

        //pede e armazena o primeiro numero 
        System.out.println("Digite o primeiro número:");
        n1 = sc.nextInt();

        //pede e armazena o segundo numero 
        System.out.println("Digite o segundo número:");
        n2 = sc.nextInt();

        //pede e armazena o terceiro numero 
        System.out.println("Digite o terceiro número:");
        n3 = sc.nextInt();
        
        //pede e armazena o quarto numero 
        System.out.println("Digite o quarto número:");
        n4 = sc.nextInt();        

        //atribuição do cálculo que a variável deverá armazenar      
        soma = n1 + n2 + n3 +n4;

        //mostra o resultado para o usuário
        System.out.println("O resultado da média é: " + soma/4);

        sc.close();
        
	}
}