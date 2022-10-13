package ar.edu.unq.po2.tp8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokerStatusNew {
	
	public String verificar(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
		
		if (this.verificarPoquer(new ArrayList<>(Arrays.asList(c1, c2, c3, c4, c5)))){
			return "Poquer";
		} 
		else if (this.verificarTrio(new ArrayList<>(Arrays.asList(c1, c2, c3, c4, c5)))) {
			return "Trio";
		} 
		else if (this.verificarColor(new ArrayList<>(Arrays.asList(c1, c2, c3, c4, c5)))) {
			return "Color";
		}
		else return "";	
		
	}
	
	public boolean verificarPoquer(List<Carta> cartas) {
		List<Carta> cartasABuscar = cartas;
		
		while(!(cartasABuscar.isEmpty()) && (this.cantidadCartasIgualNumero(cartasABuscar.get(0), cartas) < 4)) {
			cartasABuscar.remove(0);
		}
		
		return !cartasABuscar.isEmpty();
	}
	
	public boolean verificarTrio(List<Carta> cartas) {
		List<Carta> cartasABuscar = cartas;
		
		while(!(cartasABuscar.isEmpty()) && (this.cantidadCartasIgualNumero(cartasABuscar.get(0), cartas) == 3)) {
			cartasABuscar.remove(0);
		}
		
		return !cartasABuscar.isEmpty();
	}
	
	public boolean verificarColor(List<Carta> cartas) {
		List<Carta> cartasABuscar = cartas;
		
		while(!(cartasABuscar.isEmpty()) && (this.cantidadCartasMismoPalo(cartasABuscar.get(0), cartas) == 5)) {
			cartasABuscar.remove(0);
		}
		
		return !cartasABuscar.isEmpty();
	}
	
	public int cantidadCartasIgualNumero(Carta cartaAComparar, List<Carta> cartas) {
		
		int contador = 0;
		
		for (int i = 0; i < cartas.size(); i++) {
			if (cartaAComparar.esMismoValor(cartas.get(i))) {
				contador++;
			}
		}
		
		return contador;
	}
	
	public int cantidadCartasMismoPalo(Carta cartaAComparar, List<Carta> cartas) {
		
		int contador = 0;
		
		for (int i = 0; i < cartas.size(); i++) {
			if (cartaAComparar.esMismoPalo(cartas.get(i))) {
				contador++;
			}
		}
		
		return contador;
	}
	
}
