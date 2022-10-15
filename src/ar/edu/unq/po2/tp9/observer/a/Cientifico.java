package ar.edu.unq.po2.tp9.observer.a;


public class Cientifico implements ObservadorPagina{

	private SistemaArticulos sistema;
	private String interes;
	private boolean fueInformado = false;
	
	public Cientifico(SistemaArticulos sistema, String interes) {
		this.sistema = sistema;
		this.interes = interes;
		this.sistema.addObserver(this);
	}
	
	@Override
	public void update() {
		fueInformado = true;
	}

	@Override
	public String getInteres() {
		return interes;
	}
	
	public boolean fueInformado() {
		return fueInformado;
	}
}
