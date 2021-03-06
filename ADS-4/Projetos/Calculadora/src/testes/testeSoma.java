package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import codigos.Cauculadora;

class testeSoma {
    @BeforeAll
   static void  testExecutarAntes(){
    	System.out.println("executado antes dos testes");
    }
	@AfterAll
	static void  testExecutarDepois(){
    	System.out.println("executado depois dos testes");
    }
	
	
	@Test
	 void testSoma() {
		System.out.println("testando soma !!!");
		Cauculadora c = new Cauculadora();
		double resultado = c.somar(5, 5);
		assertEquals(10, resultado);
		
	}
	
	
	@Test
	void testeSsubtrair() {
		System.out.println("testando subtrair !!!");
		Cauculadora c = new Cauculadora();
		double resultado = c.subtrair(5, 5);
		assertEquals(0, resultado);
		
	}

	@Test
	void testeMult() {
		System.out.println("testando multiplicašao !!!");
		Cauculadora c = new Cauculadora();
		double resultado = c.multiplicašao(5, 5);
		assertEquals(25, resultado);
		
	}
	
	@Test
	@DisplayName("teste divisao")
	void testeDivisao() {
		System.out.println("testando divisao !!!");
		Cauculadora c = new Cauculadora();
		double resultado = c.divisao(5, 2);
		assertEquals(1, resultado);
		
	}
	
	
					



}
