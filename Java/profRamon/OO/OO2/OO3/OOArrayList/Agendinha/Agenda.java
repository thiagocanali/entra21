package newpackage;

import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {

        Scanner scEntrada = new Scanner(System.in);
        Pessoa novaPessoa = new Pessoa();

        System.out.println("Informe um nome: ");
        novaPessoa.setNome(scEntrada.nextLine());

        System.out.println("Informe o sexo: ");
        novaPessoa.setSexo(scEntrada.next().toCharArray()[0]);

        System.out.println("Quantos compromissos você deseja cadastrar?");
        int qtdComp = Integer.parseInt(scEntrada.next());




        
        
        
        scEntrada.close();
    }

}
