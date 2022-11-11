package ar.edu.unq.po2.tp12.maquina;

public class EsperandoInicio extends EstadoMaquina{

	@Override
	public String presionarInicio(MaquinaVideoJuegos maquina) {
		maquina.setEstado(new EsperandoFicha());
		return "Insertar ficha";
	}

	@Override
	public String insertarMoneda(MaquinaVideoJuegos maquina) {
		return "Juego no iniciado";
	}

	@Override
	public String jugar(MaquinaVideoJuegos maquina) {
		return "Juego no iniciado";
	}

}
