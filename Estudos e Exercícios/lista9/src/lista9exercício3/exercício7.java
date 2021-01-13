package lista9exercício3;

import java.util.Scanner;

public class exercício7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double diferenca;
		double diferencaPercentual;
		double valorTotalVenda;
		
		for (int i =0; i<21; i++) {
		System.out.println("Informe a descrição do produto:");
		String descricao = sc.next();
		
		System.out.println("Informe os valores de compra:");
		double valorCompra = sc.nextDouble();
		
		System.out.println("Informe a quantidade dos produtos:");
		int quantidade = sc.nextInt();
		
		System.out.println("Informe os valores de venda:");
		double valorVenda = sc.nextDouble();
		
		
		if (valorVenda>valorCompra) {
			System.out.println("Saiu no lucro!");
		}else if (valorVenda<valorCompra) {
			System.out.println("Saiu no prejuízo!");
		}else {
			System.out.println("Saiu no empate!");
		}
		diferenca = valorVenda - valorCompra;
		
		diferencaPercentual = (diferenca*100)/valorVenda;
		
		valorTotalVenda = valorVenda*quantidade;
		
		System.out.println("A diferença em percentual de " + descricao + " é de: " + diferencaPercentual + "% e o valor total da venda é de: " + valorTotalVenda);
	  }
	}

}
