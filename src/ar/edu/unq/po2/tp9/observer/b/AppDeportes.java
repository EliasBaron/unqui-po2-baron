package ar.edu.unq.po2.tp9.observer.b;

import java.util.ArrayList;
import java.util.List;


public class AppDeportes {
	
	private List<Suscriptor> suscriptores = new ArrayList<>();
	private List<Partido> partidosDisputados = new ArrayList<>();
	
	public void addPartido(Partido partido) {
		partidosDisputados.add(partido);
		this.notifyInteresados(partido);
	}
	
	public void notifyInteresados(Partido partido) {
		for (Suscriptor suscriptor : this.suscriptores) {
			if(suscriptor.estaInteresadoEn(partido)) {
				suscriptor.update();
			}
		}
	}
	
	public void addSuscriptor(Suscriptor suscriptor) {
		suscriptores.add(suscriptor);
	}
	
}
