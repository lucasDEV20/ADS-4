package treads;

import java.util.concurrent.*;

public class ExemploSinc {
	public static void main(String[] args) {
		Troca obj = new Troca();
		Operador es1 = new Operador(obj, true);
		Operador es2 = new Operador(obj, false);
		ExecutorService t1 = Executors.newFixedThreadPool(2);
		t1.execute(es1);
		t1.execute(es2);
		t1.shutdown();
	}
}
