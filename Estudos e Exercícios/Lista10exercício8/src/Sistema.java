
public class Sistema {

		public String entrada;
		public String saida;
		public double valor;
		public double status;
		public double valorSaidaRD, valorSaidaDE, valorSaidaDL, valorSaidaDDC;
		public double valorSaidaRE, valorSaidaRL, valorSaidaRDC, valorSaidaDR;
		public double valorSaidaER, valorSaidaED, valorSaidaEL, valorSaidaEDC;
		public double valorSaidaLR, valorSaidaLD, valorSaidaLE, valorSaidaLDC;
		public double valorSaidaDCR, valorSaidaDCD, valorSaidaDCE, valorSaidaDCL;
		
		
		public double checarR(double valorSaida) {
			if (entrada.equals("R") && saida.equals("D")) {
				 valorSaidaRD = valor*0.18;
				status = valorSaidaRD;
			} else if (entrada.equals("R") && saida.equals("E")) {
				 valorSaidaRE = valor*0.16;
				status = valorSaidaRE;
			} else if (entrada.equals("R") && saida.equals("L")) {
				 valorSaidaRL = valor*0.14;
				status = valorSaidaRL;
			} else if (entrada.equals("R") && saida.equals("DC")) {
				 valorSaidaRDC = valor*0.25;
				status = valorSaidaRDC;
			} else {
				System.out.println("Unidades inválidas!");	
				}
			return status;
		}
		
		
		public double checarD(double valorSaida) {
			if (entrada.equals("D") && saida.equals("R")) {
			 valorSaidaDR = valor*5.41;
			status = valorSaidaDR;
		} else if (entrada.equals("D") && saida.equals("E")) {
			 valorSaidaDE = valor*0.85;
			status = valorSaidaDE;
		} else if (entrada.equals("D") && saida.equals("L")) {
			 valorSaidaDL = valor*0.78;
			status = valorSaidaDL;
		} else if (entrada.equals("D") && saida.equals("DC")) {
			 valorSaidaDDC = valor*1.33;
			status = valorSaidaDDC;
		} else {
			System.out.println("Unidades inválidas!");	
			}
			return status;
		}
		
		public double checarE(double valorSaida) {
			if (entrada.equals("E") && saida.equals("R")) {
			 valorSaidaER = valor*6.37;
			status = valorSaidaER;
		} else if (entrada.equals("E") && saida.equals("D")) {
			 valorSaidaED = valor*1.18;
			status = valorSaidaED;
		} else if (entrada.equals("E") && saida.equals("L")) {
			 valorSaidaEL = valor*0.92;
			status = valorSaidaEL;
		} else if (entrada.equals("E") && saida.equals("DC")) {
			 valorSaidaEDC = valor*1.57;
			status = valorSaidaEDC;
		} else {
			System.out.println("Unidades inválidas!");	
			}
			return status;
		}
		
		public double checarL(double valorSaida) {
		 if (entrada.equals("L") && saida.equals("R")) {
			 valorSaidaLR = valor*6.94;
			status = valorSaidaLR;
		} else if (entrada.equals("L") && saida.equals("D")) {
			 valorSaidaLD = valor*1.28;
			status = valorSaidaLD;
		} else if (entrada.equals("L") && saida.equals("E")) {
			 valorSaidaLE = valor*1.09;
			status = valorSaidaLE;
		} else if (entrada.equals("L") && saida.equals("DC")) {
			 valorSaidaLDC = valor*1.70;
			status = valorSaidaLDC;
		} else {
			System.out.println("Unidades inválidas!");	
			}
		 return status;
		}
		
		public double checarDC(double valorSaida) {
			 if (entrada.equals("DC") && saida.equals("R")) {
				 valorSaidaDCR = valor*4.70;
				status = valorSaidaDCR;
			} else if (entrada.equals("DC") && saida.equals("D")) {
				 valorSaidaDCD = valor*0.75;
				status = valorSaidaDCD;		
			} else if (entrada.equals("DC") && saida.equals("E")) {
				 valorSaidaDCE = valor*0.64;
				status = valorSaidaDCE;					
			} else if (entrada.equals("DC") && saida.equals("L")) {
				 valorSaidaDCL = valor*0.59;
				status = valorSaidaDCL;						
			} else {
			System.out.println("Unidades inválidas!");	
			}
			 return status;
		}
}
