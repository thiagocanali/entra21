import java.util.Scanner;

public class exercício7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Em qual unidade de medida você deseja informar a temperatura? 'C'elsius, 'F'arenheit ou 'K'elvin?");
		String temperaturaInformada = sc.next();
		
		System.out.println("Para qual unidade de medida você deseja converter? 'C'elsius, 'F'arenheit ou 'K'elvin?");
		String temperaturaConverter = sc.next();
		
		System.out.println("Informe a temperatura: ");
		double temperatura = sc.nextDouble();
		
		if (temperaturaInformada.equals("C") && temperaturaConverter.equals("F")) {
			double fahrenheit =(9*temperatura+160)/5;
			System.out.println("Temperatura em fahrenheit:" + fahrenheit);
		} else if (temperaturaInformada.equals("C") && temperaturaConverter.equals("K")) {
			double kelvin = temperatura+273;
			System.out.println("Temperatura em Kelvin: " + kelvin);
		} else if (temperaturaInformada.equals("F") && temperaturaConverter.equals("C")) {
			
		}
	}

}
