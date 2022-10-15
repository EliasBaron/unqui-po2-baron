package ar.edu.unq.po2.tp9.observer.c;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParticipanteTest {

	Participante participante;
	ServidorJuego servidor;
	
	@BeforeEach
	void setUp() throws Exception {
		servidor = new ServidorJuego();
		participante = new Participante(servidor);
	}

	@Test
	void testRespuestasCorrectasIniciales() {
		assertEquals(0, participante.getCantidadRespuestasCorrectas());
	}
	
	@Test
	void testEstaListoParaJugarInicialmente() {
		assertFalse(participante.isListoParaJugar());
	}

}
