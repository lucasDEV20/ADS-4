package codigos;

public class Cauculadora {

	private double resultado = 0;

	public double subtrair(double n1, double n2) {
		resultado = n1 - n2;
		return resultado;
	}
	public double somar(double n1, double n2) {
		resultado = n1 + n2;
		return resultado;
	}
	public double multiplica�ao(double n1, double n2) {
		resultado = n1 * n2;
		return resultado;
	}
	public double divisao(double n1, double n2) {
		double v1;
		double v2;
		v1 = Double.valueOf(n1);
		v2 = Double.valueOf(n2);
		resultado = n1 / n2;
		return resultado;
	}
}