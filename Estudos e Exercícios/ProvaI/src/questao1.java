import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String funcionario = "";
		String continua = "S";
		String cargo = "";               //declarando as variáveis
		double salBruto;
		double impostoR = 0;
		double salLiquido = 0;
		
		while (continua.equalsIgnoreCase("S")) {
			System.out.println("Informe o nome do funcionário:");
			funcionario = sc.next();
			System.out.println("Informe seu cargo:");                 //solicitando as informações ao usuário
			cargo = sc.next();
			System.out.println("Informe seu salário bruto:");
			salBruto = sc.nextDouble();
			
			
			if (salBruto <= 1903.98) {
				System.out.println("Você está isento de imposto");
				impostoR =0;
			} 
			else if (salBruto >= 1903.99 && salBruto <= 2826.65) {
				impostoR = salBruto -  1903.98;
				impostoR = impostoR * 0.075;
				
			}
			else if (salBruto >= 2826.66 && salBruto <= 3751.05) {
				impostoR = salBruto - (2826.65 - 1903.99);
				impostoR = impostoR * 0.075;
				impostoR = salBruto - 2826.65;
				impostoR = impostoR * 0.15;                                //calculando o imposto de renda
			}
			else if (salBruto >= 3751.06 && salBruto <= 4664.68) {
				impostoR = salBruto - (2826.65 - 1903.99);
				impostoR = impostoR * 0.075;
				impostoR = salBruto - 2826.65;
				impostoR = impostoR * 0.15;
				impostoR = salBruto - 3751.06;
				impostoR = impostoR * 0.225;
			}
			else if (salBruto > 4664.68) {
				impostoR = salBruto - (2826.65 - 1903.99);
				impostoR = impostoR * 0.075;
				impostoR = salBruto - 2826.65;
				impostoR = impostoR * 0.15;
				impostoR = salBruto - 3751.06;
				impostoR = impostoR * 0.225;
				impostoR = salBruto - 4664.68;
				impostoR = impostoR * 0.275;
			}
			
			salLiquido = salBruto - impostoR;            //calculando o salário líquido
			
			System.out.println("Funcionário: " + funcionario);
			System.out.println("Cargo: " + cargo);
			System.out.println("Salário Bruto: " + salBruto);
			System.out.println("IRPF: " + impostoR);                //mostrando o relatório na tela
			System.out.println("Salário líquido: " + salLiquido);
			
			
			System.out.println("Deseja continuar?");
			continua = sc.next();                           //pedindo se deseja calcular de mais um funcionário
			
		}
		
	}

}
