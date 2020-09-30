//importa o scanner de dados, para que este possa ser usado
import java.util.Scanner;

/*
Exercício 1 - Aluno: Thiago Canali Schwartz

Mostre tudo o que sabe, levante suas dúvidas.

Demonstre seus conhecimentos em:
Scanner de dados;
Operações;
Seleção;
Ternário;
Loop "While" ou "Do While";

Comente todas as linhas;
Levante todas as dúvidas que for preciso.

Enviar para: nicealuno@gmail.com
 */

//declaração da classe
public class Exercicio1Thiago {

    //declaração do método principal, o que será invocado ao executar a classe
	public static void main (String[] args) {

        //declaração das variáveis que serão utilizadas
        String resposta;
        int n1, n2, n3;
        int media;
        String nome = "";
        boolean repetir=false;
        String situacao = "";
     
        //classe que irá monitorar o teclado
        Scanner sc = new Scanner(System.in);

        //escreve e pula uma linha
        System.out.println("Deseja verificar a média de um aluno? Sim ou Não");

        //variavel que le a resposta do usuario
        resposta = sc.next();

        //condicao que verifica se o usuario deseja rodar o codigo, se sim, executa o resto do codigo
        if(resposta.equalsIgnoreCase("SIM")) {
            repetir = true;
        }

        //iniciando o bloco while, enquanto o valor entre parentesis for verdadeiro, ele irá executar o conteúdo do bloco
        while(repetir) {

        //pede e armazena o nome do aluno    
        System.out.println("Digite o nome dx alunx:");
        nome = sc.next();

        //pede e armazena a primeira nota
        System.out.println("Digite a primeira nota:");
        n1 = sc.nextInt();

        //pede e armazena a segunda nota
        System.out.println("Digite a segundo nota:");
        n2 = sc.nextInt();

        //pede e armazena a terceira nota
        System.out.println("Digite a terceiro nota:");
        n3 = sc.nextInt();   

        //atribuição do cálculo que a variável deverá armazenar (a media das notas)     
        media = (n1 + n2 + n3) /3;

        //informa o nome do aluno e mostra o resultado do calculo da media para o usuário
        System.out.println(nome +", o resultado da sua média é: " + media);

            //condicao para dar um valor para a variavel situacao (aprovado ou reprovado)
            if(media>=7){
                situacao = "Aprovado";

            }if(media<7){
                situacao = "Reprovado";
            }      

            //texto que recebe um valor conforme a operacao ternaria
            String textoExibicao = situacao.equalsIgnoreCase("Aprovado") ? "Parabens, voce ficou acima da média!" :
            situacao.equalsIgnoreCase("Reprovado") ? "Que pena, voce ficou abaixo da media e precisa melhorar." : "Voce digitou caractere invalido";

            //escreve o resultado da operacao ternaria
            System.out.println(textoExibicao);

            //variavel repetir recebe valor falso para ser perguntado para o usuario se deseja repetir o programa novamente
            repetir = false;
            System.out.println("Deseja calcular a media de um aluno novamente? Sim ou Não");

            //armazena a resposta 
            resposta = sc.next();

            //verifica se deve repetir o programa
            repetir = resposta.equalsIgnoreCase("SIM");

            }

            //fecha o scanner
            sc.close();

        } //enquanto precisa repetir a ordem, este bloco executa
    }