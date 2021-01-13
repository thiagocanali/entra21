import java.util.Calendar;
import java.util.GregorianCalendar;

public class ExemploFormatter {

	public static void main(String[] args) {
		
		//Formatação de Strings.... 
		
		/*
		 * Caracteres especiais:
		 * ---------------------
		 *  \ - Caractere de escape, indica um caractere especial 
		 *  \n - Nova Linha 
		 *  \t - Tabulação Horizontal - Tab 
		 *  \r - Retorno de Carro - posiciona o cursor no inicio da linha atual 
		 *  \\ - Imprime o caractere barra invertida 
		 *  \" - Imprime o caractere aspas duplas 
		 *  
		 */
		System.out.println("\"Lista de tarefas: \n \t - Revisar a matéria diáriamente antes de dormir \n \t - Revisitar os exemplos disponibilizados pelo professor \n \t - Recriar os exercícios \n \t - Anotar as dúvidas e levar para a aula...  \n \t - Pesquisar e ler sobre o assunto\""); 
		
		//Método System.out.printf(format, args) - 'f' vem de formatado... 
		System.out.printf("%f \n %s\n", 12.5, "à Aula de Java"); 
		
		/* 
		 * %s - String
		 * %d - inteiro decimal 
		 * %b - booleano
		 * %c - caractere
		 * %o - número Octal
		 * %x - número Hexadecimal 
		 * %e - decimal em notação científica
		 * %f - Número decimal 
		 * %.2f - Precisão de 2 casas decimais
		 */
		
		System.out.printf("A quantidade de pessoas (%d) que estavam presentes... \n", 234);
		
		System.out.printf("Eh aposentado? %b \n", true);
		
		System.out.printf("Isto é um caractere: %c \n", 'A');
		
		System.out.printf("Número Octal %o \n", 9);
		
		System.out.printf("Número Hexadecimal %x \n", 25);
		
		System.out.printf("O Preço é %.2f \n", 25.09567);
		
		
		//A classe java.util.Formatter
		
		/*A sintaxe dos especificadores de formato para os tipos Geral, Caractere _ e _Numeric é:
		 * ---------------------------------------------------------------------------------------
		 * 
		 * %[argument_index$][flags][width][.precision]conversion
		 * 
		 * Os especificadores argument_index, flag, width e precision são opcionais. 
		 * 
		 * - argument_index part é um número inteiro i - indicando que o argumento ith da lista de argumentos deve ser usado aqui
		 * 
		 * - flags é um conjunto de caracteres usados ​para modificar o formato de saída
		 * 
		 * - width é um número inteiro positivo que indica o número mínimo de caracteres a serem gravados na saída
		 * 
		 * - precision é um número inteiro geralmente usado para restringir o número de caracteres, cujo comportamento específico depende 
		 *   da conversão *é a parte obrigatória. É um caractere que indica como o argumento deve ser formatado. O conjunto de conversões válidas para um determinado argumento depende do tipo de dados do argumento
		 * 

		 * 

		 */
		
		String greetings = String.format(
				  "Hello %2$s, welcome to %1$s !",
				  "Baeldung",
				  "Folks");
		
		System.out.println(greetings);
		
		
		String se = String.format("O número HEX é %#x", 25);
		System.out.println(se);
		
		String ss = String.format("O número é %\u0064", 25);
		System.out.println(ss);
		
		/*
		 * Para Data/Hora
		 * --------------
		 * 
		 *   %[argument_index$][flags][width]conversion
		 *   
		 *  - O flag aqui é composto de dois caracteres. Onde o primeiro caractere é sempre um ‘t' ou ‘T'. O segundo caractere depende de qual parte do Calendar deve ser exibida. 
		 * 
		 * No nosso exemplo, o primeiro especificador de formato tm indica o mês formatado como dois dígitos, te indica o dia do mês e tY indica o ano formatado como quatro dígitos.
		 * 
		 */

		  Calendar c = new GregorianCalendar(2017, 9, 11);
		  
		  
		  
		  String s = String.format("A data é:  %1$te/%1tm/%1$tY", c);		
		 
		  System.out.println(c);
		  
		  
		  /*
		   * Especificadores de formato sem argumento
		   * ----------------------------------------
		   * 
		   *  %[flags][width]conversion
		   */
		  
		    String st = String.format("John scored 90%% in Fall semester");
		    
		    System.out.println(st);
	}

}
