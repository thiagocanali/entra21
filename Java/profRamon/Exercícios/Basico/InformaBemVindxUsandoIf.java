//importa o scanner de dados, para que este possa ser usado
import java.util.Scanner;

/*
 * Pedir o gênero da pessoa M ou F
 * Se for 'M' masculino, entao lhe mostre a mensagem 'bem vindo'
 * se for 'F' feminino, entao mostre a mensagem 'bem vinda'
 */

 //declaracao da classe
public class InformaBemVindxUsandoIf{
    //declaracao do  metodo principal, o que sera invocado ao executar a classe
    public static void main (String[] args) {
        //inicia a variavel de leitura de entrada de escrita
        Scanner sc = new Scanner(System.in);
        //escreve com quebra de linha "ln"
        System.out.println("Qual e o seu genero?");
        //faz a leitura de uma entrada do teclado, do tipo texto
        String genero = sc.next();
        //para numeros voce usa o 1 == 1
        //para string voce usa o .equals ou .equalsIgnoreCase
        //bloco de condicao (compara e informa o texto de acordo com a resposta que o usuario digitou)
        
        //teste se o valor de gênero é igual 'equalsIgnoreCase' a 'M'
        if(genero.equalsIgnoreCase("M")){
            System.out.println("Bem vindo");   
        //teste se o valor de gênero é igual 'equalsIgnoreCase' a 'F'     
        }else if(genero.equalsIgnoreCase("F")){
            System.out.println("Bem vinda");
        //caso não seja nenhuma das alternativas anteriores execute 
        }else{
            System.out.println("Bem vindx");    
        }
                //fecha o scanner pra não alocar recurso   
                sc.close();
        }
}
