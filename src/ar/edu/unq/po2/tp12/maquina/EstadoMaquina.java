package ar.edu.unq.po2.tp12.maquina;

public abstract class EstadoMaquina {
	
	public String presionarInicio(MaquinaVideoJuegos maquina) {
		return "El juego ya fué iniciado";
	}
	
	public abstract String insertarMoneda(MaquinaVideoJuegos maquina);
	public abstract String jugar(MaquinaVideoJuegos maquina);
	
}
