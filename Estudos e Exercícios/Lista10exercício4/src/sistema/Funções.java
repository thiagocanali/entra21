package sistema;

public class Funções {
	
		
		public int sortear(){
				return((int)Math.random()*10);
		}
		
		public int testarPalpite(int palpite, int numSorteado) {
			int status;
			
			if (palpite==numSorteado) {
				status = 0;
			}
			else if (palpite<numSorteado) {
				status = -1;
			}
			else {
				status = 1;
			}
			return status;
		}
		
}

