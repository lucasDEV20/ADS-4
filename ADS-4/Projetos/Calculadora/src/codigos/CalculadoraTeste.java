package codigos;

public class CalculadoraTeste {

	public static void main (String[] args) {
		Cauculadora c = new Cauculadora();
		int x = 5;
		int y = 5;
		
		double resultado = c.somar(x, y);
		
		if(resultado == 10) {
			System.out.println("Cauculo da soma esta correto");
		}else {
			System.out.println("Cauculo da soma esta errado");

		}
		
		
		
	

	}
}
