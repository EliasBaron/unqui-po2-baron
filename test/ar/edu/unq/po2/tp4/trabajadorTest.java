package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class trabajadorTest {
	
	private Trabajador marcos;
	private Ingreso ingresoE;
	private Ingreso ingresoF;
	private Ingreso ingresoM;
	private Ingreso ingresoMEx;
	
	@BeforeEach
	public void setUp() {
		
		marcos = new Trabajador();
		
		ingresoE = new Ingreso("Enero", "Limpieza", 2500);
		ingresoF = new Ingreso("Febrero", "Limpieza", 3000);
		ingresoM = new Ingreso("Enero", "Limpieza", 3500);
		ingresoMEx = new IngresoHorasExtras("Enero", "Limpieza", 1000, 3);
		
		marcos.guardarIngreso(ingresoE);
		marcos.guardarIngreso(ingresoF);
		marcos.guardarIngreso(ingresoM);
		marcos.guardarIngreso(ingresoMEx);
		
	}
	
	@Test
	public void testGetTotalPercibido() {
		assertEquals(10000, marcos.getTotalPercibido());
	}
	
	@Test
	public void testGetTotalImponible() {
		assertEquals(9000, marcos.getTotalImponible());
	}
	
	@Test
	public void testGetImpuestoAPagar() {
		assertEquals(1800, marcos.getImpuestoAPagar());
	}
	
	
}
