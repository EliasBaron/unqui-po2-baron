package ar.edu.unq.po2.tp8;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTestOld {

	PokerStatusOld poker;
	
	@BeforeEach
	void setUp() throws Exception {
		poker = new PokerStatusOld();
	}
	
	@Test
	void testGetValorNumericoSingle() {
		assertEquals("9", poker.getValor("9D"));
	}
	
	@Test
	void testGetValorNumericoDoble() {
		assertEquals("10", poker.getValor("10D"));
	}
	
	
	@Test
	void testEsLetraValor() {
		assertTrue(poker.esLetraValor('J'));
	}
	
	@Test
	void testGetValorLetra() {
		assertEquals("J", poker.getValor("JD"));
	}
	
	@Test
	void testPoquerCon5() {
		List<String> cartas = new ArrayList<>(Arrays.asList("2D", "2P", "2C", "2T", "2D"));
		
		assertTrue(poker.verificarPoquer(cartas));
	}
	
	@Test
	void testPoquerCon4SeguidasDesdeInicio() {
		List<String> cartas = new ArrayList<>(Arrays.asList("2D", "2P", "2C", "2T", "3D"));
		
		assertTrue(poker.verificarPoquer(cartas));
	}
	
	@Test
	void testPoquerCon4SeguidasDesdeSegunda() {
		List<String> cartas = new ArrayList<>(Arrays.asList("3D", "2P", "2C", "2T", "2D"));
		
		assertTrue(poker.verificarPoquer(cartas));
	}
	
	@Test
	void testPoquerCon4Salteadas() {
		List<String> cartas = new ArrayList<>(Arrays.asList("2D", "3P", "2C", "2T", "2D"));
		
		assertTrue(poker.verificarPoquer(cartas));
	}
	
	@Test
	void testPoquerFalse() {
		List<String> cartas = new ArrayList<>(Arrays.asList("2D", "3P", "1C", "2T", "2D"));
		
		assertFalse(poker.verificarPoquer(cartas));
	}
	
	@Test
	void testTrio() {
		List<String> cartas = new ArrayList<>(Arrays.asList("2D", "2P", "2T", "1D", "5D"));
		
		assertTrue(poker.verificarTrio(cartas));
	}
	
	@Test
	void testTrioFalse() {
		List<String> cartas = new ArrayList<>(Arrays.asList("1D", "2D", "3D", "4D", "5D"));
		
		assertFalse(poker.verificarTrio(cartas));
	}
	
	@Test
	void testColor() {
		List<String> cartas = new ArrayList<>(Arrays.asList("2D", "3D", "7D", "1D", "5D"));
		
		assertTrue(poker.verificarColor(cartas));
	}
	
	@Test
	void testColorFalse() {
		List<String> cartas = new ArrayList<>(Arrays.asList("1D", "2D", "3D", "4D", "5P"));
		
		assertFalse(poker.verificarColor(cartas));
	}
	
	@Test
	void testVerificarPoquerCase() {
		assertEquals("Poquer", poker.verificar("2D", "2P", "2T", "2C", "2D"));
	}
	
	@Test
	void testVerificarTrioCase() {
		assertEquals("Trio", poker.verificar("2D", "2P", "2T", "1D", "5D"));
	}
	
	@Test
	void testVerificarColorCase() {
		assertEquals("Color", poker.verificar("2D", "3D", "7D", "1D", "5D"));
	}
	
	@Test
	void testVerificarMalaManoCase() {
		assertEquals("", poker.verificar("1D", "3D", "7P", "1C", "5D"));
	}

}
