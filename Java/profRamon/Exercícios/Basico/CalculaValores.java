public class EntraDados{
    
	public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
                
        System.out.println("Digite o seu nome:");
        nome = sc.next();

        System.out.println("O nome digitado foi: "+nome);

        sc.close();

	}
}
