package ar.edu.unq.po2.tp9.observer.a;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import org.mockito.InjectMocks;
import org.mockito.Mock;

import ar.edu.unq.po2.tp9.observer.a.Articulo;
import ar.edu.unq.po2.tp9.observer.a.Cientifico;
import ar.edu.unq.po2.tp9.observer.a.SistemaArticulos;

import java.io.BufferedReader;
import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ObservadorPaginaTest {

	private Cientifico cientifico;
	private Cientifico cientifico2;
	private SistemaArticulos sistema;
	private Articulo articuloCelulas;
	
	
	@BeforeEach
	void setUp() throws Exception {
		sistema = new SistemaArticulos();
		
		cientifico = new Cientifico(sistema, "Celulas");
		cientifico2 = new Cientifico(sistema, "Animales");
		
		articuloCelulas = new Articulo("Las celulas en el reino animal", null, null, "Celulas", null, null);
	}

	@Test
	void testCientificoRecibioElMensajeUpdate() {
		sistema.addArticulo(articuloCelulas);
		
		assertTrue(cientifico.fueInformado());
	}
	
	@Test
	void testCientificoNoRecibioElMensajeUpdate() {
		sistema.addArticulo(articuloCelulas);
		
		assertFalse(cientifico2.fueInformado());
//		verify(cientifico2, never()).update();
	}

}
