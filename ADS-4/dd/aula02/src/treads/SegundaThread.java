package treads;

public class SegundaThread implements Runnable {
	private String nome;

	public SegundaThread(String nome) {
		this.nome = nome;
	}

	public void run() {
		int i = 0;
		while (true) {
			System.out.printf("\n Thread: %s (executando) - %5d", nome, i++);
		}
	}
}