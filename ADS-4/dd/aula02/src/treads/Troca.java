package treads;

public class Troca {
	int a, b;

	public void faça(boolean bol) {
		if (bol) {
			a = 5;
			b = 7;
		} else {
			a = 11;
			b = 13;
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException ex) {
		}
		if (bol) {
			System.out.printf("\n%d = 5 e %d = 7", a, b);
		} else {
			System.out.printf("\n%d = 11 e %d = 13", a, b);
		}
	}
}
