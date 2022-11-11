package ar.edu.unq.po2.tp12.maquina;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaquinaVideoJuegosTest {
	
	MaquinaVideoJuegos maquina;
	EsperandoInicio esperandoInicio;
	EsperandoFicha esperandoFicha;
	SesionUnJugador sesionUnJugador;
	SesionDosJugadores sesionDosJugadores;
	
	
	@BeforeEach
	void setUp() throws Exception {
		maquina = new MaquinaVideoJuegos();
		
		esperandoInicio = new EsperandoInicio();
		esperandoFicha = new EsperandoFicha();
		sesionUnJugador = new SesionUnJugador();
		sesionDosJugadores = new SesionDosJugadores();
	}

	@Test
	void testGetEstadoInicial() {
		assertEquals(esperandoInicio.getClass(), maquina.getEstadoMaquina().getClass());
	}
	
	@Test
	void testPresionarInicioEnInicio() {
//		assertEquals("Insertar ficha", maquina.presionarInicio());
		maquina.presionarInicio();
		assertEquals(esperandoFicha.getClass(), maquina.getEstadoMaquina().getClass());
	}
	
	@Test
	void testInsertarUnaMonedaPeroNoPuedoDebidoAQueNoInicieJuego() {
		maquina.insertarMoneda();
		assertEquals(esperandoInicio.getClass(), maquina.getEstadoMaquina().getClass());
	}
	
	@Test
	void testInsertarMonedaCorrecto() {
		maquina.presionarInicio();
		maquina.insertarMoneda();
		assertEquals(sesionUnJugador.getClass(), maquina.getEstadoMaquina().getClass());
	}
	
	@Test
	void testJugarCorrecto() {
		maquina.presionarInicio();
		maquina.insertarMoneda();
		maquina.jugar();
		assertEquals(esperandoInicio.getClass(), maquina.getEstadoMaquina().getClass());
	}
	
	@Test
	void testInsertarDosMonedaCorrecto() {
		maquina.presionarInicio();
		maquina.insertarMoneda();
		maquina.insertarMoneda();
		assertEquals(sesionDosJugadores.getClass(), maquina.getEstadoMaquina().getClass());
	}
	
	@Test
	void testInsertarDosMonedaYJugarCorrecto() {
		maquina.presionarInicio();
		maquina.insertarMoneda();
		maquina.insertarMoneda();
		maquina.jugar();
		assertEquals(esperandoInicio.getClass(), maquina.getEstadoMaquina().getClass());
	}
	
	@Test
	void noPuedeJugarDebidoANoInsertarMonedas() {
		maquina.presionarInicio();
		maquina.jugar();
		
		assertEquals(esperandoFicha.getClass(), maquina.getEstadoMaquina().getClass());
	}

	

}
