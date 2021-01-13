
public class Sistema {

		public String resultado;
		public double temperatura;
		public String checarf(String temperaturaInformada, String temperaturaConverter) {
			if (temperaturaInformada.equalsIgnoreCase("C") && temperaturaConverter.equalsIgnoreCase("F")) {
					double fahrenheit =(9*temperatura+160)/5;
					resultado.equals("F");
			} 
		}
		public String checark(String temperaturaInformada, String temperaturaConverter) {
			 if (temperaturaInformada.equals("C") && temperaturaConverter.equals("K")) {
				double kelvin = temperatura+273;
				resultado = kelvin;
			 }
		
		}
		
		public String chegarc(String temperaturaInformada, String temperaturaConverter) {
			if (temperaturaInformada.equals("F") && temperaturaConverter.equals("C")) {
				double celsius = (temperatura/9-160)*5;
				resultado = celsius;
		}
		}
}
