package ar.edu.unq.po2.tp3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class multioperadorTestCase {
	private Multioperador multioperador;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		multioperador = new Multioperador();
		
		multioperador.addNumber(2);
		multioperador.addNumber(2);
		multioperador.addNumber(5);
		
	}
	
	@Test
	public void testSumaNumeros() {
		int resultado = multioperador.sumarNumeros();
		
		assertEquals(9, resultado);
	}
	
	@Test
	public void testRestaNumeros() {
		int resultado = multioperador.restarNumeros();
		
		assertEquals(-5, resultado);
	}
	
	@Test
	public void testMulNumeros() {
		int resultado = multioperador.multiplicarNumeros();
		
		assertEquals(20, resultado);
	}

}
