package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LesionTest {

	Lesion lesionRojo;
	Lesion lesionGris;
	
	@BeforeEach
	void setUp() throws Exception {
		
		lesionRojo = Lesion.ROJO;
		lesionGris = Lesion.GRIS;
		
	}

	@Test
	void testGetDescription() {
		
		assertEquals("color rojo", lesionRojo.getDescription());
		
	}
	
	@Test
	void testGetPeligro() {
		
		assertEquals(2, lesionGris.getNivelPeligro());
		
	}
	
	@Test
	void testGetSiguiente() {
		
		assertEquals(Lesion.GRIS, lesionRojo.siguienteLesion(Lesion.ROJO));
		
	}

}
