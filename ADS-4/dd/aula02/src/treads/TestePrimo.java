package treads;

import javax.swing.JOptionPane;

public class TestePrimo {
	public static void main(String[] args) {
		String resposta;
		do {
			resposta = JOptionPane.showInputDialog("Digite um n�mero");

			try {
				long numero = new Long(resposta);
				VerificadorPrimo vf = new VerificadorPrimo(numero);
				vf.start();
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "n�mero invalido");
			}
		} while (!resposta.equals("sair"));
	}
}
