package treads;

public class PrimeiraThread extends Thread {
	public PrimeiraThread(String nome) {
		super(nome);
	}

	public void run() {
		int i = 0;
		while (true) {
			System.out.printf("\n Thread: %s (executando) - %5d", getName(), i++);
		}
	}
}
