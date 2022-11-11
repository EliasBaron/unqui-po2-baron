package ar.edu.unq.po2.tp12.maquina;

public class MaquinaVideoJuegos {

	private EstadoMaquina estadoMaquina;
	
	public MaquinaVideoJuegos() {
		this.estadoMaquina = new EsperandoInicio();
	}
	
	public void setEstado(EstadoMaquina estado) {
		this.estadoMaquina = estado;
	}
	
	public EstadoMaquina getEstadoMaquina() {
		return this.estadoMaquina;
	}
	
	public String presionarInicio() {
		return estadoMaquina.presionarInicio(this);
	}
	
	public String insertarMoneda() {
		return estadoMaquina.insertarMoneda(this);
	}
	
	public String jugar() {
		return estadoMaquina.jugar(this);
	}
	
}
