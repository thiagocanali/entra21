
public class Criptografia {

	
	public Criptografia() {

	}
		
	
	public String cifrarC(String texto, int cifra) {
		String resul = " ";
		int salvar = 0;
		
		//para o deslocamento nunca estourar/ser acima de 26...
		//if (cifra < 26) {
			cifra = cifra % 26;
		//}
		
		//cifrando o texto
		for (int i = 0; i < texto.length(); i++) {
			
			//tratamento de minúsculos
			//somente caracteres alfabéticos(tabela ascii)
			if (salvar > 64 && salvar < 91) {
				salvar = (int)texto.charAt(i) + cifra;
				
				//garante voltar o começo do alfabeto, caso a cifra seja maior 
				if (salvar > 90) {
					salvar = 64 + (salvar - 90);
				}
				
				//garante voltar ao final caso a cifra seja maior ou negativa
				if (salvar < 65) {
					salvar = salvar + 26;
				}

				//tratamendo de maiúsculos
				//somente caracteres alfabéticos(tabela ascii)
				if (salvar > 96 && salvar < 123) {
					salvar = (int)texto.charAt(i) + cifra;
					
					//garante voltar o começo do alfabeto, caso a cifra seja maior 
					if (salvar > 122) {
						salvar = 96 + (salvar - 122);
					}
					
					//garante voltar ao final caso a cifra seja maior ou negativa
					if (salvar < 97) {
						salvar = salvar + 26;
					}
			}
			
			char caractereC = (char)salvar;
			resul = resul + caractereC;
		}
		
	}
		return resul;
}
	
	
	public String decifrar(String texto, int cifra) { 
		String resul = "";
		int salvar = 0;
		//para o deslocamento nunca estourar/ser acima de 26...
				//if (cifra < 26) {
					cifra = cifra % 26;
				//}
				
				//cifrando o texto
				for (int i = 0; i < texto.length(); i++) {
					
					//tratamento de minúsculos
					//somente caracteres alfabéticos(tabela ascii)
					if (salvar > 64 && salvar < 91) {
						salvar = (int)texto.charAt(i) - cifra;
						
						//garante voltar o começo do alfabeto, caso a cifra seja maior 
						if (salvar > 90) {
							salvar = 64 + (salvar - 90);
						}
						
						//garante voltar ao final caso a cifra seja maior ou negativa
						if (salvar < 65) {
							salvar = salvar + 26;
						}

						//tratamendo de maiúsculos
						//somente caracteres alfabéticos(tabela ascii)
						if (salvar > 96 && salvar < 123) {
							salvar = (int)texto.charAt(i) - cifra;
							
							//garante voltar o começo do alfabeto, caso a cifra seja maior 
							if (salvar > 122) {
								salvar = 96 + (salvar - 122);
							}
							
							//garante voltar ao final caso a cifra seja maior ou negativa
							if (salvar < 97) {
								salvar = salvar + 26;
							}
					}
					
					char caractereC = (char)salvar;
					resul = resul + caractereC;
				}
				
			}
		return resul;
	}
	
}
	
	/*
	public String decifrarC(String texto, int cifra) {
		String msgDecifrada = "";
		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) >= 65 && texto.charAt(i) <= 122) {
				msgDecifrada = msgCifrada - cifra;
			}
		}
		return letraDecifrada;
	}
	*/
