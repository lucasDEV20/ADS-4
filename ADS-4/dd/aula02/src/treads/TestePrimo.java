package treads;

import javax.swing.JOptionPane;

public class TestePrimo {
	public static void main(String[] args) {
		String resposta;
		do {
			resposta = JOptionPane.showInputDialog("Digite um número");

			try {
				long numero = new Long(resposta);
				VerificadorPrimo vf = new VerificadorPrimo(numero);
				vf.start();
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "número invalido");
			}
		} while (!resposta.equals("sair"));
	}
}
