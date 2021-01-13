package lista9exercício3;

import java.util.Scanner;

public class exercício2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String continua = "S";
		float chegada;
		float saida;
		
		while (continua.equals("S")) {
		System.out.println("Informe a distância:");
		float distancia = sc.nextFloat();
		
		System.out.println("Informe a hora de saída:");
		float horaSaida = sc.nextFloat();
		
		System.out.println("Informe os minutos de saída:");
		float minutosSaida = sc.nextFloat();
		
		System.out.println("Informe a hora de chegada:");
		float horaChegada = sc.nextFloat();
		
		System.out.println("Informe os minutos de chegada:");
		float minutosChegada = sc.nextFloat();
		
		 saida = horaSaida + minutosSaida;
		 chegada = horaChegada + minutosChegada;
		 float tempo = horaChegada - horaSaida;
		 
		
		float velocidadeMedia = distancia;
		System.out.println("Sua velocidade média é de:"+velocidadeMedia);
		
		System.out.println("Deseja continuar? 'S'im ou 'N'ão");
		continua = sc.next();
		
		}
	}

	}
