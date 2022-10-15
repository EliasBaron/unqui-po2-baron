package ar.edu.unq.po2.tp9.observer.c;

import java.util.List;

public class Participante {

	private boolean listoParaJugar;
	private ServidorJuego servidor;
	private List<Pregunta> preguntasAResponder;
	private int cantidadRespuestasCorrectas;

	public Participante(ServidorJuego servidor) {
		this.servidor = servidor;
		this.listoParaJugar = false;
		this.cantidadRespuestasCorrectas = 0;
		
		//servidor.addUsuario(this);
	}
	
	public boolean isListoParaJugar() {
		return listoParaJugar;
	}

	public int getCantidadRespuestasCorrectas() {
		return cantidadRespuestasCorrectas;
	}
	
	public void pedirParticipar() {
		servidor.agregarJugadorAPartida(this);
	}

	public void serHabilitado() {
		listoParaJugar = true;
		System.out.println("Jugador conectado a partida correctamente");
	}
	
	public void recibirPreguntas(List<Pregunta> preguntas) {
		preguntasAResponder = preguntas;
	}
	
	public String leerPregunta() {
		return preguntasAResponder.get(0).getEnunciado();
	}
	
	public void enviarRespuestaAPregunta(String respuesta) {
		if(listoParaJugar) {
			servidor.verificarRespuesta(this, respuesta, preguntasAResponder.get(0));
			preguntasAResponder.remove(0);
		}
	}
	
	public void sumarCorrecta() {
		cantidadRespuestasCorrectas++;
	}

	public void deshabilitarSesion() {
		listoParaJugar = false;
	}


}
