package newpackage;

import java.util.Scanner;

public class Petshop {

    public static void main(String[] args) {

        Scanner scEntrada = new Scanner(System.in);
        Dono donoPet = new Dono();
        
        System.out.println("Informe seu nome: ");
        donoPet.setNome(scEntrada.next());
        
        System.out.println("Informe sua idade: ");
        donoPet.setIdade(Integer.parseInt(scEntrada.next()));
        
        System.out.println("Quantos Pets você possui?");
        int qtdPet = Integer.parseInt(scEntrada.next());
        
        for (int i = 0; i < qtdPet; i++) {
            Pet pet = new Pet();
            System.out.println("Qual o nome do seu pet?");
            pet.setNome(scEntrada.next());

            System.out.println("Qual o tipo do seu pet?");
            pet.setTipo(scEntrada.next());

            System.out.println("Qual a cor do seu pet?");
            pet.setCor(scEntrada.next());
            
            donoPet.setPet(pet);
        }
        
        System.out.println("Dono: " + donoPet.getNome());
        for (int i = 0; i < donoPet.getPets().size(); i++) {
            System.out.println("Pet: " + donoPet.getPet(i).getNome());
            System.out.println("Tipo: " + donoPet.getPet(i).getTipo());
            System.out.println("Cor: " + donoPet.getPet(i).getCor());
            System.out.println("=====================");
        }
        
        scEntrada.close();
    }

}
