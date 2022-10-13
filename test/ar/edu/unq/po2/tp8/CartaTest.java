package ar.edu.unq.po2.tp8;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp8.Carta;

class CartaTest {

	Carta t5;
	Carta c5;
	Carta t8;
	Carta p3;
	
	Palo Trebol;
	Palo Corazon;
	Palo Pica;
	
	@BeforeEach
	void setUp() throws Exception {
		
		t5 = new Carta(5, Trebol);
		c5 = new Carta(5, Corazon);
		t8 = new Carta(8, Trebol);
		p3 = new Carta(3, Pica);
		
	}
	
	@Test
	void testGetPalo() {
		assertEquals(Pica, p3.getPalo());
	}
	
	@Test
	void testEsMayorQue() {
		assertTrue(t8.esMayorQue(c5));
	}
	
	@Test
	void testEsMismoPalo() {
		assertFalse(c5.esMismoPalo(p3));
	}
	
	@Test
	void testEsMismoPaloFalse() {
		assertTrue(t5.esMismoPalo(t8));
	}
	
	@Test
	void testEsMismoValor() {
		assertTrue(t5.esMismoValor(c5));
	}

}
