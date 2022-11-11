package ar.edu.unq.po2.tp12.maquina;

public class SesionUnJugador extends EstadoMaquina {

	@Override
	public String insertarMoneda(MaquinaVideoJuegos maquina) {
		maquina.setEstado(new SesionDosJugadores());
		return "Segunda moneda insertada";
	}

	@Override
	public String jugar(MaquinaVideoJuegos maquina) {
		maquina.setEstado(new EsperandoInicio());
		return "Esperemos que haya disfrutado su sesion :)";
	}

}
