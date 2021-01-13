import java.util.Scanner;

public class Tela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Criptografia criptografia = new Criptografia();
		String resultado;
		
		System.out.println("Insira a cifra:");
		int cifra = sc.nextInt();
		System.out.println("Insira o texto:");
		String texto = sc.next();
		
			System.out.println("'C'ifrar ou 'D'ecifrar?");
			String resposta = sc.next();
			
			if (resposta.equalsIgnoreCase("C")) {
				System.out.println("Texto cifrado:");
				resultado = criptografia.cifrarC(texto, cifra);
				System.out.println(resultado);
				
			}
			else if (resposta.equalsIgnoreCase("D")) {
				System.out.println("Texto decifrado:");
				resultado = criptografia.decifrar(texto, cifra);
				System.out.println(resultado);
			
			}
				
			
	}

}
