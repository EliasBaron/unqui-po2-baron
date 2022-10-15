package ar.edu.unq.po2.tp9.observer.b;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class aplicacionDeportes {

	AppDeportes app;
	
	Suscriptor sub1;
	Suscriptor sub2;
	Suscriptor sub3;
	
	Partido partido;
	
	@BeforeEach
	void setUp() throws Exception {
		
		app = new AppDeportes();
		
		String resultado = "Gano independiente 2 a 1";
		List<String> contricantes = Arrays.asList("Racing");
		partido = new Partido(resultado, contricantes, "Futbol");
		
		sub1 = new Suscriptor(app, "Futbol", "Boca");
		sub2 = new Suscriptor(app, "Polo", "Racing");
		sub3 = new Suscriptor(app, "Golf", "Aldosivi");
		
	}

	@Test
	void testSuscriptorEsNotificadoPorFutbol() {
		
		app.addPartido(partido);
		
		assertTrue(sub1.fueNotificado());
	}
	
	@Test
	void testSuscriptorEsNotificadoPorRival() {
		
		app.addPartido(partido);
		
		assertTrue(sub2.fueNotificado());
	}
	
	@Test
	void testSuscriptorNoEsNotificado() {
		
		app.addPartido(partido);
		
		assertFalse(sub3.fueNotificado());
	}

}
