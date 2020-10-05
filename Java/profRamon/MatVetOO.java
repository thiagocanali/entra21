/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetooo;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Thiago Canali Schwartz
 */
public class ProjetoOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        ExMatrizProfessor();
    }

    public static void ExVetor() {

        /*
        Crie um algoritmo que leia um vetor de 20 tamanho 20. Gere os valores aleatoriamente. 
        Criar um segundo vetor contendo apenas os numeros pares. Nos impares, preencher com zero.
         */
        int[] vetor1 = new int[20];
        int[] vetor2 = new int[20];

        Random geraNum = new Random();

        for (int i = 0; i < 20; i++) {
            vetor1[i] = geraNum.nextInt(100);

            if (vetor1[i] % 2 != 0) {
                vetor2[i] = 0;

            } else {
                vetor2[i] = vetor1[i];
            }
            System.out.print("vetor1[" + vetor1[i] + "] ");
            System.out.println("vetor2[" + vetor2[i] + "] ");
        }

    }

    public static void ExVetorProfessor() {

        /*
        Crie um algoritmo que leia um vetor de 20 tamanho 20. Gere os valores aleatoriamente. 
        Criar um segundo vetor contendo apenas os numeros pares. Nos impares, preencher com zero.
         */
        int[] vetorNumeros = new int[20];
        int[] vetorPares = new int[20];

        for (int i = 0; i < vetorNumeros.length; i++) {
            vetorNumeros[i] = ThreadLocalRandom.current().nextInt(1, 200);
            System.out.print(vetorNumeros[i] + ", ");
        }

        System.out.println("\n");

        for (int i = 0; i < vetorNumeros.length; i++) {
            if (vetorNumeros[i] % 2 == 0) {
                vetorPares[i] = vetorNumeros[i];
            } else {
                vetorPares[i] = 0;
            }
            System.out.print(vetorPares[i] + ", ");
        }

    }

    public static void ExMatriz() {

        /*
        Crie um algoritmo que gere uma Matriz 10x5. Depois apresente.
         */
        int[][] matriz = new int[10][5];

        Random geraNum = new Random();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = geraNum.nextInt(9);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

    public static void ExMatrizProfessor() {

        /*
        Crie um algoritmo que gere uma Matriz 10x5. Depois apresente.
         */
        int[][] matrizValores = new int[10][5];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0) {
                    System.out.print("| ");
                }
                matrizValores[i][j] = ThreadLocalRandom.current().nextInt(0, 10);
                System.out.print(matrizValores[i][j] + " ");
                if (j == 4) {
                    System.out.print(" |");
                }
            }
            System.out.println("");

        }
    }

}
