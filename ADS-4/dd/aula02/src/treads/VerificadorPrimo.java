package treads;

public class VerificadorPrimo extends Thread {
	private long numero;

	public VerificadorPrimo(long numero) {
		this.numero = numero;
	}

	public void run() {
		boolean primo = true;
		for (int i = 2; i < numero; i++) {
			if ((numero % i) == 0) {
				primo = false;
			}
		}
		if (primo) {
			System.out.printf("\nO número: %d é primo", numero);
		} else {
			System.out.printf("\nO número: %d não é primo", numero);
		}
	}
}
/*
 * Obs.: Existem algoritimos melhores para verificação de primos. Utilizamos
 * este por ser mais demorado dando assim um melhor entendimento ao aluno.
 */