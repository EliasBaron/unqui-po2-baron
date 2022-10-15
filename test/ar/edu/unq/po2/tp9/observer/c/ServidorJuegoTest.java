package ar.edu.unq.po2.tp9.observer.c;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServidorJuegoTest {

	ServidorJuego servidor;
	Participante p1;
	Participante p2;
	Participante p3;
	Participante p4;
	Participante p5;
	Participante p6;
	
	
	@BeforeEach
	void setUp() throws Exception {
		servidor = new ServidorJuego();
		
		p1 = new Participante(servidor);
		p2 = new Participante(servidor);
		p3 = new Participante(servidor);
		p4 = new Participante(servidor);
		p5 = new Participante(servidor);
		p6 = new Participante(servidor);
	}

	
	@Test
	void participanteEsHabilitadoParaJugarPorUnServidorVacio() {
		p1.pedirParticipar();
		
		assertTrue(p1.isListoParaJugar());
	}
	
	@Test
	void participanteEsHabilitadoParaJugarPorUnServidorCasiLleno() {
		p1.pedirParticipar();
		p2.pedirParticipar();
		p3.pedirParticipar();
		p4.pedirParticipar();
		p5.pedirParticipar();
		
		assertTrue(p5.isListoParaJugar());
	}
	
	@Test
	void participanteNoPuedeIngresarPorSalaLLena() {
		p1.pedirParticipar();
		p2.pedirParticipar();
		p3.pedirParticipar();
		p4.pedirParticipar();
		p5.pedirParticipar();
		p6.pedirParticipar();
		
		assertFalse(p6.isListoParaJugar());
	}

}
