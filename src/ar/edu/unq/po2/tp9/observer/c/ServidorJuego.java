package ar.edu.unq.po2.tp9.observer.c;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp9.observer.b.Suscriptor;

public class ServidorJuego {

//	private List<Participante> usuarios = new ArrayList<>();
	private List<Participante> jugadoresPartida = new ArrayList<>();
	private List<Pregunta> preguntas = new ArrayList<>();
	boolean preparadoParaIniciar = false;
	
//	public void addUsuario(Participante participante) {
//		usuarios.add(participante);
//	}
	
	public void agregarJugadorAPartida(Participante p) {
		if (jugadoresPartida.size() < 5) {
			jugadoresPartida.add(p);
			this.comprobarJuegoListo();
		}
		else System.out.println("La partida está llena");
	}

	private void comprobarJuegoListo() {
		if (jugadoresPartida.size() == 5) {
			this.comenzarJuego();
		}
	}

	private void comenzarJuego() {
		for (Participante participante : jugadoresPartida) {
			preparadoParaIniciar = true;
			participante.serHabilitado();
			participante.recibirPreguntas(preguntas);
		}
	}

	public void verificarRespuesta(Participante participante, String respuestaParticipante, Pregunta pregunta) {
		
		if (respuestaParticipante.equals(pregunta.getRespuestaCorrecta())) {
			participante.sumarCorrecta();
			this.verificarTerminacionJuego(participante);
			this.notificarParticipantes(pregunta, participante);
		}
		// else participante.notificar("Respuesta incorrecta :(");
		
	}

	private void notificarParticipantes(Pregunta pregunta, Participante participante) {
		/*
		for (Participante participante : this.jugadoresPartida) {
			participante.notificar(pregunta.getEnunciado())
			paricipante.notificar(participante.getNombre())
		}
		*/
	}

	private void verificarTerminacionJuego(Participante participante) {
		if (participante.getCantidadRespuestasCorrectas() == 5) {
			this.terminarSesionJuego(participante);
		}
		
	}

	private void terminarSesionJuego(Participante participanteGanador) {
		for (Participante participante : this.jugadoresPartida) {
			participante.deshabilitarSesion();
			// participante.recibirNotificacion(participanteGanador.getNombre())
		}
	}
	
	
	
}
