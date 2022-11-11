package ar.edu.unq.po2.tp10.composite.a;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ComponenteCultivoTest {

	Trigo trigo;
	Soja soja;
	
	@BeforeEach
	void setUp() throws Exception {
		trigo = new Trigo();
		soja = new Soja(); 
	}

	@Test
	void testGetGananciaSoja() {
		assertEquals(500, soja.getGanancia());
	}
	
	@Test
	void testGetGananciaSojaErronea() {
		assertNotEquals(300, soja.getGanancia());
	}
	
	@Test
	void testGetGananciaTrigo() {
		assertEquals(300, trigo.getGanancia());
	}
	
	@Test
	void testGetGananciaTrigoErronea() {
		assertNotEquals(500, trigo.getGanancia());
	}

}
