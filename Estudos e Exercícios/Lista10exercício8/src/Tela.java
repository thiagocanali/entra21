import java.util.Scanner;

public class Tela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 
		 Sistema sis = new Sistema();
		 String continua = "";
		 
		 
		 	while(continua.equalsIgnoreCase("S")) {
		 	System.out.println("----------------------------------------------------------------------------------------");
			System.out.println("                              CASA DE CÂMBIO                                            ");
			System.out.println("----------------------------------------------------------------------------------------");
			System.out.println("Informe R para real");
			System.out.println("Informe D para dólar americano");
			System.out.println("Informe E para euro");
			System.out.println("Informe L para libra");
			System.out.println("Informe DC para dólar canadense");
			System.out.println("Informe o tipo de moeda de entrada: 'R'eal, 'D'ólar americano, 'E'uro, 'L'ibra Esterlina ou 'D'ólar 'C'anadense:");
			String entrada = sc.next();
			System.out.println("Informe o tipo de moeda de saída: 'R'eal, 'D'ólar americano, 'E'uro, 'L'ibra Esterlina ou 'D'ólar 'C'anadense:");
			String saida = sc.next();
			System.out.println("Informe o valor a ser convertido:");
			double valor = sc.nextDouble();
			
			if (sis.status==sis.valorSaidaRD) {
				System.out.println("O valor de real convertido para dólar americano é igual a: " + sis.valorSaidaRD);
			} else if (sis.status==sis.valorSaidaRE) {
				System.out.println("O valor de real convertido para euro é igual a: " + sis.valorSaidaRE);
			} else if (sis.status==sis.valorSaidaRL) {
				System.out.println("O valor de real convertido para libra é igual a: " + sis.valorSaidaRL);
			} else if (sis.status==sis.valorSaidaRDC) {
				double valorSaida = valor*0.25;
				System.out.println("O valor de real convertido para dólar canadense é igual a: " + sis.valorSaidaRDC);
			}
			
			
			
			else if (sis.status==sis.valorSaidaDR) {
				System.out.println("O valor de dólar americano convertido para real é igual a: " + sis.valorSaidaDR);
			} else if (sis.status==sis.valorSaidaDE) {
				System.out.println("O valor de dólar americano convertido para euro é igual a: " + sis.valorSaidaDE);
			} else if (sis.status==sis.valorSaidaDL) {
				System.out.println("O valor de dólar americano convertido para libra é igual a: " + sis.valorSaidaDL);
			} else if (sis.status==sis.valorSaidaDDC) {
				System.out.println("O valor de dólar americano convertido para dólar canadense é igual a: " + sis.valorSaidaDDC);
			}
			
			
			
			else if (sis.status==sis.valorSaidaER) {
				System.out.println("O valor de euro convertido para real é igual a: " + sis.valorSaidaER);
			} else if (sis.status==sis.valorSaidaED) {
				System.out.println("O valor de euro convertido para dólar americano é igual a: " + sis.valorSaidaED);
			} else if (sis.status==sis.valorSaidaEL) {
				System.out.println("O valor de euro convertido para libra é igual a: " + sis.valorSaidaEL);
			} else if (sis.status==sis.valorSaidaED) {
				System.out.println("O valor de euro convertido para dólar americano é igual a: " + sis.valorSaidaED);
			}
			

			
			else if (sis.status==sis.valorSaidaLR) {
				System.out.println("O valor de libra convertido para real é igual a: " + sis.valorSaidaLR);
			} else if (sis.status==sis.valorSaidaLD) {
				System.out.println("O valor de libra convertido para dólar americano é igual a: " + sis.valorSaidaLD);
			} else if (sis.status==sis.valorSaidaLE) {
				System.out.println("O valor de libra convertido para euro é igual a: " + sis.valorSaidaLE);
			} else if (sis.status==sis.valorSaidaLDC) {
				System.out.println("O valor de libra convertido para dólar canadense é igual a: " + sis.valorSaidaLDC);
			}
			
			
			
			else if (sis.status==sis.valorSaidaDCR) {
				System.out.println("O valor de dólar canadense convertido para real é igual a: " + sis.valorSaidaDCR);
			} else if (sis.status==sis.valorSaidaDCD) {
				System.out.println("O valor de dólar canadense convertido para dólar americano é igual a: " + sis.valorSaidaDCD);			
			} else if (sis.status==sis.valorSaidaDCD) {
				System.out.println("O valor de dólar canadense convertido para euro é igual a: " + sis.valorSaidaDCE);						
			} else if (sis.status==sis.valorSaidaDCL) {
				System.out.println("O valor de dólar canadense convertido para libra é igual a: " + sis.valorSaidaDCL);							
			} else {
			System.out.println("Unidades inválidas!");	
			}
			
			System.out.println("Deseja fazer outra conversão? 'S'im ou 'N'ão?");
			continua = sc.next();
		 	}
	}

}
