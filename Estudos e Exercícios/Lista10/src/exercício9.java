import java.util.Scanner;

public class exercício9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String forma;
		double raio;
		double area;
		double base = 0;
		double altura;
		
		System.out.println("----CÁLCULO DE ÁREA----");
		System.out.println("Informe C para círculo ");
		System.out.println("Informe R para retângulo");
		System.out.println("Informe TR para triângulo retângulo");
		System.out.println("Informe TE para triângulo equilátero");
		System.out.println("Qual você deseja?");
		forma = sc.next();
		
		if(forma.equalsIgnoreCase("C")) {
			System.out.println("Informe o raio do círculo");
			raio = sc.nextDouble();
			area = Math.PI*(raio*raio);
			System.out.println("A área do círculo é de: " + area);
			//A = π . r2
		} 
		
		else if (forma.equals("R")) {
			System.out.println("Informe a base do retângulo");
			base = sc.nextDouble();
			System.out.println("Informe a altura do retângulo");
			altura = sc.nextDouble();
			area = base*altura;
			System.out.println("A área do retângulo é de: " + area);
		} 
		
		else if (forma.equals("TR")) {
			System.out.println("Informe a base do triângulo retângulo");
			base = sc.nextDouble();
			System.out.println("Informe a altura do triângulo retângulo");
			altura = sc.nextDouble();
			area = (base*altura)/2;
			System.out.println("A área do triângulo retângulo é de: "+ area);
		}
		
		else if (forma.equals("TE")) {
			System.out.println("Informe a base do triângulo equilátero");
			base = sc.nextDouble();
			System.out.println("Informe a altura do triângulo equilátero");
			altura = sc.nextDouble();
			area = ((base*altura) * Math.sqrt(3))/4;
			System.out.println("A área do triângulo equilátero é de: " + area);
		}
		
		
    }
}

