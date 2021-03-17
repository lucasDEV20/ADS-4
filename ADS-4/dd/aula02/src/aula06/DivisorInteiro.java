package aula06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisorInteiro {
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Digite o numerador:");
			int numerador = input.nextInt();
			System.out.print("Digite o Denominador:");
			int denominador = input.nextInt();
			int quociente = numerador / denominador;
			int resto = numerador % denominador;
			System.out.printf("Quociente:%d Resto:%d", quociente, resto);
		} catch (ArithmeticException ae) {
			System.out.printf("nao pode ser informado o valor 0 no0 denominador");
		} catch (InputMismatchException ime) {
			System.out.printf("Informe numeros para a operaçao");
		}catch (Exception e) {
			System.out.println("Não foi possivel realizar a operaçao. ");
		}finally {
			System.out.println("Ele executa esta linha, indepedente do que ocorra no bloco try");
		}
	}
}