package ar.edu.unq.po2.tp8;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTestNew {

	PokerStatusNew poker;
	Carta p1;
	Carta t1;
	Carta c1;
	Carta d1;
	Carta p3;
	Carta t3;
	Carta d3;
	Carta d4;
	Carta d5;
	Carta d6;
	
	Palo PICA;
	Palo TREBOL;
	Palo CORAZON;
	Palo DIAMANTE;
	
	@BeforeEach
	void setUp() throws Exception {
		
		poker = new PokerStatusNew();
		
		p1 = new Carta(1, PICA);
		t1 = new Carta(1, TREBOL);
		c1 = new Carta(1, CORAZON);
		d1 = new Carta(1, DIAMANTE);
		p3 = new Carta(3, PICA);
		t3 = new Carta(3, TREBOL);
		d3 = new Carta(3, DIAMANTE);
		d4 = new Carta(4, DIAMANTE);
		d5 = new Carta(5, DIAMANTE);
		d6 = new Carta(6, DIAMANTE);
	}
	
	
	@Test
	void testCantidadIgualNumero() {
		List<Carta> cartas = new ArrayList<>(Arrays.asList(p3, p3, t3, c1, d6));
		
		assertEquals(3, poker.cantidadCartasIgualNumero(p3, cartas));
	}
	
	@Test
	void testCantidadIgualPalo() {
		List<Carta> cartas = new ArrayList<>(Arrays.asList(d3, d4, d5, c1, d6));
		
		assertEquals(4, poker.cantidadCartasMismoPalo(d3, cartas));
	}
	
	@Test
	void testPoquerCon5() {
		List<Carta> cartas = new ArrayList<>(Arrays.asList(p1, t1, c1, d1, p3));
		
		assertTrue(poker.verificarPoquer(cartas));
	}
	
	@Test
	void testPoquerFalse() {
		List<Carta> cartas = new ArrayList<>(Arrays.asList(p1, p3, t3, c1, d6));
		
		assertFalse(poker.verificarPoquer(cartas));
	}
	
	
	
//	@Test
//	void testTrio() {
//		List<String> cartas = new ArrayList<>(Arrays.asList("2D", "2P", "2T", "1D", "5D"));
//		
//		assertTrue(poker.verificarTrio(cartas));
//	}
//	
//	@Test
//	void testTrioFalse() {
//		List<String> cartas = new ArrayList<>(Arrays.asList("1D", "2D", "3D", "4D", "5D"));
//		
//		assertFalse(poker.verificarTrio(cartas));
//	}
//	
//	@Test
//	void testColor() {
//		List<String> cartas = new ArrayList<>(Arrays.asList("2D", "3D", "7D", "1D", "5D"));
//		
//		assertTrue(poker.verificarColor(cartas));
//	}
//	
//	@Test
//	void testColorFalse() {
//		List<String> cartas = new ArrayList<>(Arrays.asList("1D", "2D", "3D", "4D", "5P"));
//		
//		assertFalse(poker.verificarColor(cartas));
//	}
//	
//	@Test
//	void testVerificarPoquerCase() {
//		assertEquals("Poquer", poker.verificar("2D", "2P", "2T", "2C", "2D"));
//	}
//	
//	@Test
//	void testVerificarTrioCase() {
//		assertEquals("Trio", poker.verificar("2D", "2P", "2T", "1D", "5D"));
//	}
//	
//	@Test
//	void testVerificarColorCase() {
//		assertEquals("Color", poker.verificar("2D", "3D", "7D", "1D", "5D"));
//	}
//	
//	@Test
//	void testVerificarMalaManoCase() {
//		assertEquals("", poker.verificar("1D", "3D", "7P", "1C", "5D"));
//	}

}