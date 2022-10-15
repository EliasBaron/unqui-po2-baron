package ar.edu.unq.po2.tp9.observer.a;

import java.util.ArrayList;
import java.util.List;

public class SistemaArticulos {

	private List<Articulo> articulos = new ArrayList<>();
	private List<ObservadorPagina> suscriptores = new ArrayList<>();


	public void notificarInteresados(Articulo articulo) {
		for (ObservadorPagina suscriptor : this.suscriptores) {
			if(suscriptor.getInteres() == articulo.getTipoArticulo()) {
				suscriptor.update();
			}
		}
	}
	
	public void addArticulo(Articulo articulo) {
		articulos.add(articulo);
		this.notificarInteresados(articulo);
	}

	public void addObserver(ObservadorPagina observador) {
		suscriptores.add(observador);
	}
	
	
	
}
