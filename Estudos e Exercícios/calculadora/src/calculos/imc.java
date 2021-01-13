package calculos;

public class imc {

	private double imc;
	
	//métodos com retorno
	public double calculaImc (double altura, double peso) {
		imc = peso/ ( altura*altura);
		return imc;
	}
	
	//métodos sem retorno
	public void calculaImc2 (float altura, float peso) {
		imc = peso/ ( altura*altura);
	}
}
