//importa o scanner de dados, para que este possa ser usado
import java.util.Scanner;

/*
 * Pedir o gênero da pessoa M ou F
 * Se for 'M' masculino, entao lhe mostre a mensagem 'bem vindo'
 * se for 'F' feminino, entao mostre a mensagem 'bem vinda'
 */

 //declaracao da classe
public class InformaBemVindxUsandoSwitch{
    //declaracao do  metodo principal, o que sera invocado ao executar a classe
    public static void main (String[] args) {
        //inicia a variavel de leitura de entrada de escrita
        Scanner sc = new Scanner(System.in);
        //escreve com quebra de linha "ln"
        System.out.println("Qual e o seu genero?");
        //faz a leitura de uma entrada do teclado, do tipo texto
        String genero = sc.next();
        //bloco de condicao (compara e informa o texto de acordo com a resposta que o usuario digitou)
        switch(genero.toUpperCase()){
            //caso o valor da variavel genero seja igual a "M", faça 
            case "M":
                System.out.println("Bem vindo");
                break;
            //caso o valor da variavel genero seja igual a "F", faça    
            case "F":
                System.out.println("Bem vinda");
                break;  
            //se nao for nenhum dos outros cases, faça    
            default:
                System.out.println("Bem vindx");
                break;     
        }
                //fecha o scanner pra não alocar recurso   
                sc.close();
        }
}
