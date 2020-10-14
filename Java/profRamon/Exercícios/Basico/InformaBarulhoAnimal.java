//importa o scanner de dados, para que este possa ser usado
import java.util.Scanner;

/*
 Escreva um menu de selecao de animal, apos selecionar, imprima o barulho que o animal faz, auau, miau, piupiu...
 em seguida comente cada linha escrita
 */

 //declaracao da classe
public class InformaBarulhoAnimal{
    //declaracao do  metodo principal, o que sera invocado ao executar a classe
    public static void main (String[] args) {
        //inicia a variavel de leitura de entrada de escrita
        Scanner sc = new Scanner(System.in);
        //escreve com quebra de linha "ln"
        System.out.println("Selecione um animal:");
        System.out.println("1 - Cachorro");
        System.out.println("2 - Gato");
        System.out.println("3 - Passarinho");
        //faz a leitura de uma entrada do teclado, do tipo texto
        int option = sc.nextInt();
        //bloco de condicao (compara e informa o texto de acordo com a resposta que o usuario digitou)
        switch(option){
            //caso o valor da variavel option seja igual a 1, faça 
            case 1:
                System.out.println("AUAU");
                break;
            //caso o valor da variavel option seja igual a 2, faça 
            case 2:
                System.out.println("MIAU");
                break;  
            //caso o valor da variavel option seja igual a 3, faça 
            case 3:
            System.out.println("PIUPIU");
            break;  
            //caso não tenha entrado em nenhum dos casos, faça
            default:
                System.out.println("quero comidaaa arrg");
                break;     
        }
                //fecha o scanner pra não alocar recurso   
                sc.close();
        }
}
