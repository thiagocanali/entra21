import java.util.Scanner;

public class CalculadoraEntradaDados {
	public static void main (String[] args) {

        //declaração das variáveis que serão utilizadas
        double n1, n2;
        double soma;
        double substracao;
        double multiplicacao;
        double divisao;

        //classe que irá monitorar o teclado
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao programinha que faz cálculos.");

        System.out.println("Digite o primeiro número:");
        n1 = sc.nextDouble();

        System.out.println("Digite o segundo número:");
        n2 = sc.nextDouble();

        soma = n1 + n2;
        substracao = n1 - n2;
        multiplicacao = n1 * n2;
        divisao = n1 / n2;

        System.out.println("O resultado da soma: " + soma);
        System.out.println("O resultado da subtração: " + substracao);
        System.out.println("O resultado da multiplicação: " + multiplicacao);
        System.out.println("O resultado da divisão: " + divisao);

        sc.close();
        
	}
}
