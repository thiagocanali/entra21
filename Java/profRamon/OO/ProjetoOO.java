package projetooo;

import java.util.Scanner;

public class ProjetoOO {

    public static void main(String[] args) {

        String nome;
        Scanner leia = new Scanner(System.in);
        Pessoa usuario = new Pessoa();
        System.out.println("Informe seu nome:");

        nome = leia.nextLine();

        if (!"".equals(nome)) {
            usuario.setNome(nome);
        }
        System.out.println("Beom vindo, " + usuario.getApelido());
        System.out.println("Informe seu ano de nascimento: ");
        int nascimento = leia.nextInt();
        usuario.setAnoNascimento(nascimento);
        
        System.out.println("Ano de nascimento: " + usuario.getAnoNascimento());
        System.out.println("Idade: " + usuario.getIdade());
        
        
        
    }

}
