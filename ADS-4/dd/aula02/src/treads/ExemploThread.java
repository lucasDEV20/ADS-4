package treads;

public class ExemploThread {
	public static void main(String[] args) {
		PrimeiraThread thread1 = new PrimeiraThread("****");
		PrimeiraThread thread2 = new PrimeiraThread("####");
		thread1.start();
		thread2.start();
	}
}