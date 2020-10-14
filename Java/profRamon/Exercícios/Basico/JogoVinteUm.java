import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;
/**
 * 
 * Colocar os componentes graficos de Entrada e Saida
 *
 */
public class Jogo {

	public static void main(String[] args) {
		int numeroUsuario, resultadoUsuario, resultadoComputador;
		int numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 21);
		int pontuacaoUsuario, pontuacaoComputador;
		String entradaValor;
		
		// Numeros do Computador
		int numeroAleComputador = ThreadLocalRandom.current().nextInt(1, 21);
		int numeroComputador = ThreadLocalRandom.current().nextInt(1, 21);
		
		
		// Numeros do Usuario
		entradaValor = JOptionPane.showInputDialog(null, "Vamos jogar um jogo? Escolha um número entre 1 e 20: ");
		numeroUsuario = Integer.parseInt(entradaValor);

		JOptionPane.showMessageDialog(null, "Gerando um número para o Usuário...");
		JOptionPane.showMessageDialog(null, "Número escolhido pelo sistema para o Usuário: " + numeroAleatorio);

		//Pontuacao do Usuario
		resultadoUsuario = numeroUsuario + numeroAleatorio;

		switch (resultadoUsuario) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			JOptionPane.showMessageDialog(null, "Total: " + resultadoUsuario + ". Você fez apenas 1 pt!");
			pontuacaoUsuario = 1;
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "Total: " + resultadoUsuario + ". Você fez 10 pontos!");
			pontuacaoUsuario = 10;
			break;
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
			JOptionPane.showMessageDialog(null, "Total: " + resultadoUsuario + ". Você fez apenas 5 pts!");
			pontuacaoUsuario = 5;
			break;
		case 14:
			JOptionPane.showMessageDialog(null, "Total: " + resultadoUsuario + ". Você fez 20 pontos!");
			pontuacaoUsuario = 20;
			break;
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
		case 20:
			JOptionPane.showMessageDialog(null, "Total: " + resultadoUsuario + ". Você fez apenas 6 pts!");
			pontuacaoUsuario = 6;
			break;
		case 21:
			JOptionPane.showMessageDialog(null, "Total: " + resultadoUsuario + ". Você fez 30 pontos!");
			pontuacaoUsuario = 30;
			break;
		default:
			JOptionPane.showMessageDialog(null, "Total: " + resultadoUsuario
					+ ". A soma dos números foi acima de 21. Você fez 0 pontos!");
			pontuacaoUsuario = 0;
			break;
		}
		
		//Pontuacao do Computador
		JOptionPane.showMessageDialog(null, "O Computador escolheu o número: " + numeroComputador);
		JOptionPane.showMessageDialog(null, "Gerando um número para o Computador...");
		JOptionPane.showMessageDialog(null, "Número escolhido pelo sistema para o Computador: " + numeroAleComputador);
		resultadoComputador = numeroAleComputador + numeroComputador;

		switch (resultadoComputador) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			JOptionPane.showMessageDialog(null, "Total: " + resultadoComputador + ". O Computador fez apenas 1 pt!");
			pontuacaoComputador = 1;
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "Total: " + resultadoComputador + ". O Computador fez 10 pontos!");
			pontuacaoComputador = 10;
			break;
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
			JOptionPane.showMessageDialog(null, "Total: " + resultadoComputador + ". O Computador fez apenas 5 pts!");
			pontuacaoComputador = 5;
			break;
		case 14:
			JOptionPane.showMessageDialog(null, "Total: " + resultadoComputador + ". O Computador fez 20 pontos!");
			pontuacaoComputador = 20;
			break;
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
		case 20:
			JOptionPane.showMessageDialog(null, "Total: " + resultadoComputador + ". O Computador fez apenas 6 pts!");
			pontuacaoComputador = 6;
			break;
		case 21:
			JOptionPane.showMessageDialog(null, "Total: " + resultadoComputador + ". O Computador fez 30 pontos!");
			pontuacaoComputador = 30;
			break;
		default:
			JOptionPane.showMessageDialog(null, "Total: " + resultadoComputador
					+ ". A soma dos números foi acima de 21. O Computador fez 0 pontos!");
			pontuacaoComputador = 0;
			break;
		}
		
		if(pontuacaoComputador > pontuacaoUsuario) {
			JOptionPane.showMessageDialog(null, "Sinto muito, você perdeu! =(");
		} else if (pontuacaoComputador < pontuacaoUsuario) {
			JOptionPane.showMessageDialog(null, "Parabéns, você ganhou!!! *_*");
		} else {
			JOptionPane.showMessageDialog(null, "Empatou, tente de novo!");
		}

	}

}
