package ar.edu.unq.po2.tp9.observer.b;

public class Suscriptor implements Observer{

	private AppDeportes aplicacion;
	private String deporteInteresado;
	private String contricanteInteresado;
	private boolean fueNotificado = false;

	public Suscriptor(AppDeportes aplicacion, String deporteInteresado, String contricanteInteresado) {
		this.aplicacion = aplicacion;
		this.deporteInteresado = deporteInteresado;
		this.contricanteInteresado = contricanteInteresado;
		aplicacion.addSuscriptor(this);
	}

	public String getDeporteInteresado() {
		return deporteInteresado;
	}


	public String getContricanteInteresado() {
		return contricanteInteresado;
	}


	@Override
	public void update() {
		fueNotificado = true;
	}
	
	public boolean fueNotificado() {
		return fueNotificado;
	}

	public boolean estaInteresadoEn(Partido partido) {
		return (deporteInteresado.equals(partido.getDeporte()) || partido.getContricantes().contains(contricanteInteresado));
	}
	
}
