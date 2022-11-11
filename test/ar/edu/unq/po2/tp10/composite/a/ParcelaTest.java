package ar.edu.unq.po2.tp10.composite.a;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParcelaTest {
	
	Parcela parcela1;   //SUT
	Cultivo cultivo1;	//DOC
	Cultivo cultivo2;	//DOC

	@BeforeEach
	void setUp() throws Exception {
		parcela1 = new Parcela();
		
		cultivo1 = mock(Cultivo.class);
		cultivo2 = mock(Cultivo.class);
		
		when(cultivo1.getGanancia()).thenReturn(150);
		when(cultivo2.getGanancia()).thenReturn(1000);
	}

	@Test
	void testAgregarCultivo() {
		parcela1.addCultivo(cultivo1);
		
		assertEquals(1, parcela1.getCultivosParcela().size());
	}
	
	@Test
	void testSeSumaCultivo() {
		parcela1.addCultivo(cultivo1);
		parcela1.addCultivo(cultivo1);
		
		assertEquals(2, parcela1.getCantidadCultivos());
	}
	
	@Test
	void noSeAgregaApartirDe4() {
		parcela1.addCultivo(cultivo1);
		parcela1.addCultivo(cultivo1);
		parcela1.addCultivo(cultivo1);
		parcela1.addCultivo(cultivo1);
		parcela1.addCultivo(cultivo1);
		
		assertEquals(4, parcela1.getCultivosParcela().size());
	}
	
	@Test
	void seSumanBienLasGanancias() {
		when(cultivo1.getGanancia()).thenReturn(150);
		parcela1.addCultivo(cultivo1);
		parcela1.addCultivo(cultivo1);
		
		assertEquals(300, parcela1.getGanancia());
	}
	
	@Test
	void seSumanBienLasGananciasParcelaLLena() {
		when(cultivo1.getGanancia()).thenReturn(150);
		when(cultivo2.getGanancia()).thenReturn(1000);
		parcela1.addCultivo(cultivo1);
		parcela1.addCultivo(cultivo2);
		parcela1.addCultivo(cultivo2);
		parcela1.addCultivo(cultivo1);
		
		assertEquals(2300, parcela1.getGanancia());
	}
	
	@Test
	void seLeQuiereSumarDeMasPeroNoSeTieneEnCuenta() {
		
		parcela1.addCultivo(cultivo1);
		parcela1.addCultivo(cultivo2);
		parcela1.addCultivo(cultivo2);
		parcela1.addCultivo(cultivo1);
		
		parcela1.addCultivo(cultivo2);
		
		assertEquals(2300, parcela1.getGanancia());
	}
	
	@Test
	void testExtra() {
		Parcela parcela2 = new Parcela();
		
		parcela2.addCultivo(cultivo1);
		parcela2.addCultivo(cultivo1);
		parcela2.addCultivo(cultivo2);
		parcela2.addCultivo(cultivo2);
		
		parcela1.addCultivo(cultivo1);
		parcela1.addCultivo(cultivo1);
		parcela1.addCultivo(cultivo1);
		parcela1.addCultivo(parcela2);
		
		assertEquals(2750, parcela1.getGanancia());
	}

}
