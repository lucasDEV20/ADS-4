package treads;

public class ExemploThread2 {
	public static void main(String[] args) {
		SegundaThread st1 = new SegundaThread("****");
		SegundaThread st2 = new SegundaThread("####");
		Thread thread1 = new Thread(st1);
		Thread thread2 = new Thread(st2);
		thread1.start();
		thread2.start();

	}
}