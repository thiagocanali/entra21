import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;

public class Random {

	public static void main(String[] args) throws InterruptedException {
		int numeroSorteado;
		
		
		JOptionPane.showMessageDialog(null, "Sorteio começou...");
		numeroSorteado = ThreadLocalRandom.current().nextInt(1, 25);
		switch (numeroSorteado) {
		case 1:
			JOptionPane.showMessageDialog(null, "O Sorteado foi Alejandro");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "O Sorteado foi Alexandre");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "O Sorteado foi Bruno");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "O Sorteado foi Daniel");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "O Sorteado foi Douglas");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "O Sorteado foi Everton");
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "O Sorteado foi Felipe");
			break;
		case 8:
			JOptionPane.showMessageDialog(null, "O Sorteado foi Gabriel");
			break;
		case 9:
			JOptionPane.showMessageDialog(null, "O Sorteado foi Gabriele");
			break;
		case 10:
			JOptionPane.showMessageDialog(null, "O Sorteado foi Jefferson");
			break;
		case 11:
			JOptionPane.showMessageDialog(null, "O Sorteado foi Jessica");
			break;
		case 12:
			JOptionPane.showMessageDialog(null, "O Sorteado foi João G");
			break;
		case 13:
			JOptionPane.showMessageDialog(null, "O Sorteado foi João H");
			break;
		case 14:
			JOptionPane.showMessageDialog(null, "O Sorteado foi Kauan");
			break;
		case 15:
			JOptionPane.showMessageDialog(null, "O Sorteado foi Liandra");
			break;
		case 16:
			JOptionPane.showMessageDialog(null, "O Sorteado foi Lucas");
			break;
		case 17:
			JOptionPane.showMessageDialog(null, "O Sorteado foi Matheus");
			break;
		case 18:
			JOptionPane.showMessageDialog(null, "O Sorteado foi Nathan");
			break;
		case 19:
			JOptionPane.showMessageDialog(null, "O Sorteado foi Rafael");
			break;
		case 20:
			JOptionPane.showMessageDialog(null, "O Sorteado foi Ronie");
			break;
		case 21:
			JOptionPane.showMessageDialog(null, "O Sorteado foi Suyanne");
			break;
		case 22:
			JOptionPane.showMessageDialog(null, "O Sorteado foi Thiago");
			break;
		case 23:
			JOptionPane.showMessageDialog(null, "O Sorteado foi Victoria");
			break;
		case 24:
			JOptionPane.showMessageDialog(null, "O Sorteado foi Yuri");
			break;

		default:
			JOptionPane.showMessageDialog(null, "O Sorteado foi Coringa!!!!");
			break;
		}
		

	}

}
