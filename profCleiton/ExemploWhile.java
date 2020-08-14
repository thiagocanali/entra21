//importa o scanner de dados, para que este possa ser usado
import java.util.Scanner;
 
/*
 * Funcionamento do bloco 'while'
 */
public class ExemploWhile {//declaração da classe
    
    public static void main(String[] args) {//declaração do método principal, o que será invocado ao executar a classe
        //inicia a variavel de leitura de entrada de escrita
        Scanner sc = new Scanner(System.in);        
        //escrevendo um texto
        System.out.println("Quer tentar adivinhar um numero de 1 a 10? S/N");
        //pegando o valor da resposta
        String resposta = sc.next();
 
        //cria e inicializa a variável
        /*boolean repetir = false;//porque a inicializo aqui?
        if(resposta.equalsIgnoreCase("S")) {//testo se a responsta é igual a 'S', caso verdadeito... executa o bloco
            repetir = true;//repetir recebe verdadeiro
        }*/
 
        //o bloco acima também pode ser feito dessa maneira:
        //.equalsIgnoreCase retorna 'true' ou 'false', então se a resposta for igual a 'S' a variável repetir recebe 'true', caso contrário recebe 'false' 
        boolean repetir = resposta.equalsIgnoreCase("S");
 
        //iniciando o bloco while, se o valor entre parentesis for 'verdadeiro', ele sempre irá executar novamente o conteúdo do bloco
        while(repetir) {
            //escrevendo texto
            System.out.println("Digite seu numero:");
            //recolhendo uma resposta
            int numero = sc.nextInt();
 
            //testando se o número é diferente de 6
            if(numero == 6) {
                //escrevendo texto
                System.out.println("Acertou :)");
                //se a pessoa acertou a resposta, o valor dessa variável vai receber 'false',
                //pois não faz mais sentido continuar perguntando
                repetir = false;
            } else {
                //escrevendo texto
                System.out.println("Errou :(");
                //escrevendo texto
                System.out.println("Deseja tentar novamente? S/N");
                //pegando a resposta em texto
                resposta = sc.next();
                //verificando se deve repetir
                repetir = resposta.equalsIgnoreCase("S");
            }
            
        } //enquanto precisa repetir a ordem, este bloco executa
 
        //fecha o scanner
        sc.close();
    }
}