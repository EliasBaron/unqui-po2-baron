package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PagableTest {
	
	Caja caja;
	
	Impuesto impuesto;
	Factura factura;
	
	@BeforeEach
	void setUp() throws Exception {
		
		caja = new Caja();
		impuesto = new Impuesto(50);
		factura = new Factura(25, 4);
		
	}

	@Test
	void testCantidadAPagarDeFactura() {
		assertEquals(100, factura.montoAPagar());
	}

	
	@Test
	void testCantidadAPagarDeImpuesto() {
		assertEquals(50, impuesto.montoAPagar());
	}
	
}
