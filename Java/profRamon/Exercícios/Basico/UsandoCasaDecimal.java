public class CalculaValores {
    
	public static void main (String[] args) {

        double nummeroUm;
        double nummeroDois;    
        double soma, substracao, divisao, multiplicacao;

        // irá fazer um calculo de soma
        nummeroUm = 10 ;
        nummeroDois = 60;

        soma = nummeroUm + nummeroDois;
        substracao = nummeroUm - nummeroDois;
        divisao = nummeroUm / nummeroDois;
        multiplicacao = nummeroUm * nummeroDois;

        System.out.println("O resultado da soma: " + soma);
        System.out.println("O resultado da subtração: " + substracao);
        System.out.println("O resultado da divisão: " + divisao);
        System.out.println("O resultado da multiplicação: " + multiplicacao);
	}
}
