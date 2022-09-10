package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad queso;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 10);
		queso = new ProductoPrimeraNecesidad("Queso", 200, false, 20);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(7.2, leche.getPrecio());
	}
	
	@Test
	public void testCalcularPorcentajeDeDescuento() {
		assertEquals(160, queso.getPrecio());
	}
	
}
