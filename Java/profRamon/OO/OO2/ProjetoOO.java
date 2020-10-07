package projetooo;

import java.util.Scanner;

public class ProjetoOO {

    public static void main(String[] args) {

        Scanner scEntrada = new Scanner(System.in);
        Usuario user;
        Carro carroUsuario;
        String possuiCarro;
        String nomeUsuario, nomeCarro, sexoUsuario;
        String idade;
        int anoCarro;

        System.out.println("Informe nome do usuário: ");
        nomeUsuario = scEntrada.nextLine();
        System.out.println("Informe a idade do usuário: ");
        idade = scEntrada.nextLine();
        int idadeInt = Integer.parseInt(idade);

        if (!"".equals(nomeUsuario) && !"".equals(idade)) {
            user = new Usuario(nomeUsuario, idadeInt);
        } else if (!"".equals(nomeUsuario)) {
            user = new Usuario(nomeUsuario);
        } else if (!"".equals(idade)) {
            user = new Usuario(idadeInt);
        } else {
            user = new Usuario();
        }

        System.out.println("Informe o sexo do usuário: ");
        sexoUsuario = scEntrada.nextLine();

        user.setSexo(sexoUsuario);

        System.out.println("Você possui carro?");
        possuiCarro = scEntrada.next();
        if ("S".equalsIgnoreCase(possuiCarro)) {
            System.out.println("Informe o modelo");
            nomeCarro = scEntrada.next();
            System.out.println("Informe o Ano");
            String anoString = scEntrada.next();
            anoCarro = Integer.parseInt(anoString);
            if (!"".equals(nomeCarro) && anoCarro > 0) {
                carroUsuario = new Carro(nomeCarro, anoCarro);
            } else if (!"".equals(nomeCarro)) {
                carroUsuario = new Carro(nomeCarro);
            } else if (anoCarro > 0) {
                carroUsuario = new Carro(anoCarro);
            } else {
                carroUsuario = new Carro();
            }
            user.setCarro(carroUsuario);
        }

        System.out.println("Nome do usuário: " + user.getNome());
        System.out.println("Idade do usuário: " + user.getIdade());
        System.out.println("Sexo do usuário: " + user.getSexo());
        System.out.println("Modelo do Carro: " + user.getCarro().getNome());
        System.out.println("Ano do Carro: " + user.getCarro().getAno());

        scEntrada.close();

    }

}
