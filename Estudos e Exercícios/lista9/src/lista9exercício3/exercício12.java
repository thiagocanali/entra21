package lista9exercício3;

import java.util.Scanner;

public class exercício12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nome="";
		int idade=0;
		String nomeVelho="";
		int idadeMaisVelho=0;
		
		for (int i =0; i<5; i++) {
			System.out.println("Digite seu nome:");
			nome = sc.next();
			System.out.println("Digite sua idade:");
			idade = sc.nextInt();
		
		    if (i==0) {
		    	idadeMaisVelho = idade;
		    	nomeVelho = nome;
		    } if (idade>idadeMaisVelho) {
		    	idadeMaisVelho = idade;
		    	nomeVelho = nome;
		    }
		    System.out.println("O nome da pessoa mais velha é:"+nomeVelho);
    }
  }
}

