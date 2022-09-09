package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTestCase {
	
	private Point punto1;
	private Point punto2;
	
	@BeforeEach
	public void setUp() throws Exception {
		punto1 = new Point(3, 2);
		punto2 = new Point(5, 3);
	}
	
	@Test
	public void testGetX() {
		int x = punto1.getX();
		
		assertEquals(3, x);
	}
	
	@Test
	public void testSetValues() {
		punto1.setValues(5, 3);
		
		assertEquals(5, punto1.getX());
	}
	
	@Test
	public void testSumarPuntos() {
		Point punto3 = punto1.sumarPunto(punto2);
		
		assertEquals(8, punto3.getX());
	}

}
