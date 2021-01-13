package calculos;

public class CalculadoraSimples {
	
	//modificadores de acesso são para tornar visíveis ou não
	//padrão sem nada (visível dentro do mesmo pacote)
	//public (visível para todos)
	//protected é o mesmo que o padrão(visível dentro do mesmo pacote)
	//private (visível apenas dentro da classe)
	
	
	public double somar(double num1, double num2) { //método geralmente é verbo ex: somar
		return (num1 + num2);
	}
	
	public double subtrair(double num1, double num2) {
		return (num1 - num2);
	}
	
	public double multiplicacao(double num1, double num2) {
		return (num1 * num2);
	}
	
	public double divisao(double num1, double num2) {
		return (num1 / num2);
	}
	
}
