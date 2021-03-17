package treads;

public class Operador implements Runnable {
	private boolean bol;
	private Troca obj;

	public Operador(Troca obj, boolean bol) {
		this.bol = bol;
		this.obj = obj;
	}

	public void run() {
		while (true) {
			obj.faça(bol);

		}
	}
}
