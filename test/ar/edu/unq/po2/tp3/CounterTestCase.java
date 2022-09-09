package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CounterTestCase {
	private Counter counter;

	@BeforeEach
	public void setUp() throws Exception {
		//Se crea el contador
		counter = new Counter();
		//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(6);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(2);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}
	
	/**
	* Verificar los tests
	*/
	
	@Test
	public void testEvenNumbers() {
		// Getting the even occurrences
			int amount = counter.contarImpares();
		// I check the amount is the expected one
			assertEquals(amount, 7);
		}
	
	@Test
	public void testOddNumbers() {
		int amount = counter.contarPares();
		
		assertEquals(amount, 3);
	}
	
	@Test
	public void testMultiplos() {
		int amount = counter.contarMuliplosDe(2);
		
		assertEquals(amount, 3);
	}
	
}
