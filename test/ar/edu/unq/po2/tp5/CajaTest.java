package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {
	
	private Caja caja;
	
	private Cliente elias;
	
	private Producto arroz;
	private Producto huevos;
	private Producto cereales;
	private ProductoCooperativa leche;
	
	
	@BeforeEach
	public void setUp() {
		caja = new Caja();
		
		elias = new Cliente();
		
		arroz = new Producto("arroz", 20, 10);
		huevos = new Producto("huevos", 25, 5);
		cereales = new Producto("cereales", 30, 8);
		leche = new ProductoCooperativa("leche", 10, 1);
		
	}
	
	@Test
	void testGetPrecios() {
		
		assertEquals(30, cereales.getPrecio());
		
	}
	
	@Test
	void testGetPreciosCooperativa() {
		
		assertEquals(9, leche.getPrecio());
		
	}
	
	@Test
	void testCalcularMonto() {
		
		elias.addPagable(arroz);
		elias.addPagable(huevos);
		elias.addPagable(cereales);
		elias.addPagable(leche);
		
		assertEquals(84, caja.registarPagables(elias));
		
	}
	
	@Test
	void testCalcularStock() {
		elias.addPagable(leche);
		caja.registarPagables(elias);
		assertFalse(leche.hayStock());
		//assertEquals(0, leche.getStock());
	}


}
