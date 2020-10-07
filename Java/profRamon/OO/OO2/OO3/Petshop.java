package newpackage;

import java.util.Scanner;

public class Petshop {

    public static void main(String[] args) {

        Scanner scEntrada = new Scanner(System.in);
        Dono donoPet = new Dono();
        donoPet.setPet(new Pet());

        System.out.println("Informe seu nome: ");
        donoPet.setNome(scEntrada.next());

        System.out.println("Informe sua idade: ");
        donoPet.setIdade(Integer.parseInt(scEntrada.next()));

        System.out.println("Qual o nome do seu pet?");
        donoPet.getPet().setNome(scEntrada.next());

        System.out.println("Qual o tipo do seu pet?");
        donoPet.getPet().setTipo(scEntrada.next());

        System.out.println("Qual a cor do seu pet?");
        donoPet.getPet().setCor(scEntrada.next());

        System.out.println("Dono: " + donoPet.getNome());
        System.out.println("Pet: " + donoPet.getPet().getNome());
        System.out.println("Tipo: " + donoPet.getPet().getTipo());
        System.out.println("Cor: " + donoPet.getPet().getCor());

        scEntrada.close();
    }

}
