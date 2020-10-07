package newpackage;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayListExemplo {

    public static void main(String[] args) {

        Scanner scEntrada = new Scanner(System.in);
        ArrayList<String> listaAtividades = new ArrayList<String>();
        boolean continuaInserindo = true;

        while (continuaInserindo) {
            System.out.println("Insira uma atividade.");
            System.out.println("Digite 'SAIR', para sair.");
            String atividade = scEntrada.nextLine();

            if ("SAIR".equalsIgnoreCase(atividade)) {
                continuaInserindo = false;
            } else {
                listaAtividades.add(atividade);
            }

        }

        if (listaAtividades.size() > 0) {
            for (int i = 0; i < listaAtividades.size(); i++) {
                System.out.println("Atividade " + i + " - " + listaAtividades.get(i));

            }
        }

        scEntrada.close();
    }

}
