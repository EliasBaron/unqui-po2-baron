package ar.edu.unq.po2.tp7.b;

public abstract class Credito {
	
	private ClienteBanco solicitante;
	private float montoSolicitado;
	private int plazoMeses;
	
	public Credito(ClienteBanco solicitante, float montoSolicitado, int plazoMeses) {
		this.solicitante = solicitante;
		this.montoSolicitado = montoSolicitado;
		this.setPlazoMeses(plazoMeses);
	}
	
	public Credito(float montoSolicitado, int plazoMeses) {
		this.montoSolicitado = montoSolicitado;
		this.setPlazoMeses(plazoMeses);
	}
	
	public Credito(ClienteBanco solicitante) {
		this.solicitante = solicitante;
	}
	
	public ClienteBanco getSolicitante() {
		return solicitante;
	}
	
	public float montoMensual() {
		return montoSolicitado / getPlazoMeses();
	}
	
	public void setSolicitante(ClienteBanco cliente) {
		solicitante = cliente;
	}
	
	public float getMontoSolicitado() {
		return montoSolicitado;
	}
	
	public abstract boolean esAceptable();
	
	public abstract boolean cumpleCuota(ClienteBanco solicitante);

	public int getPlazoMeses() {
		return plazoMeses;
	}

	public void setPlazoMeses(int plazoMeses) {
		this.plazoMeses = plazoMeses;
	}
}
