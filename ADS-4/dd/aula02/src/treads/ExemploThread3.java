package treads;

import java.util.concurrent.*;

public class ExemploThread3 {
	public static void main(String[] args) {
		SegundaThread t1 = new SegundaThread("=====Thread 1");
		SegundaThread t2 = new SegundaThread("*****Thread 2");
		ExecutorService threads = Executors.newFixedThreadPool(2);
		threads.execute(t1);
		threads.execute(t2);
		threads.shutdown();
	}
}