package ar.edu.unq.po2.tp8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokerStatusOld {
	
	public String verificar(String c1, String c2, String c3, String c4, String c5) {
		
		//List<String> cartas = new ArrayList<>(Arrays.asList(c1, c2, c3, c4, c5));
		
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
	
	
	public boolean verificarPoquer(List<String> cartas) {
		List<String> cartasABuscar = cartas;
		
		while(!(cartasABuscar.isEmpty()) && !(this.cartasIgualNumero(cartasABuscar.get(0), cartas) >= 4)) {
			cartasABuscar.remove(0);
		}
		
		return !(cartasABuscar.isEmpty());
	}
	
	
	public boolean verificarTrio(List<String> cartas) {
		List<String> cartasABuscar = cartas;
		
		while(!cartasABuscar.isEmpty() && !(this.cartasIgualNumero(cartasABuscar.get(0), cartas) == 3)) {
			cartasABuscar.remove(0);
		}
		
		return !cartasABuscar.isEmpty();
	}
	
	
	public boolean verificarColor(List<String> cartas) {
		List<String> cartasABuscar = cartas;
		
		while(!cartasABuscar.isEmpty() && !(this.cartasIgualPalo(cartasABuscar.get(0), cartas) == 5)) {
			cartasABuscar.remove(0);
		}
		
		return !cartasABuscar.isEmpty();
	}
	
	private int cartasIgualPalo(String carta, List<String> cartasAComparar) {
		
		int contador = 0;
		
		for (int i = 0; i < cartasAComparar.size(); i++) {
			if (this.getPalo(carta).equals(this.getPalo(cartasAComparar.get(i)))) {
				contador++;
			}
		}
		
		return contador;
	}


	public int cartasIgualNumero(String carta, List<String> cartasAComparar) {
		
		int contador = 0;
		
		for (int i = 0; i < cartasAComparar.size(); i++) {
			if (this.getValor(carta).equals(this.getValor(cartasAComparar.get(i)))) {
				contador++;
			}
		}
		
		return contador;
		
	}
	

	public String getValor(String carta) {
		char [] cadena_div = carta.toCharArray();
		String valor = "";
		
		for (int i = 0; i < cadena_div.length; i++) {
			if(Character.isDigit(cadena_div[i]) || this.esLetraValor(cadena_div[i])) {
				valor += cadena_div[i];
			}
		}
		return valor;
	}
	
	public boolean esLetraValor(char l) {
		String letra = Character.toString(l);
		return (letra.equals("J") || letra.equals("K") || letra.equals("Q"));
	}
	
	
	public String getPalo(String carta) {
		char [] cadena_div = carta.toCharArray();
		String palo = "";
		
		for(int i = 0; i < cadena_div.length; i++) {
			if(this.esLetraPalo(cadena_div[i])) {
				palo += cadena_div[i];
			}
		}
		return palo;
	}
	
	
	public boolean esLetraPalo(char l) {
		String letra = Character.toString(l);
		
		return (letra.equals("P") || letra.equals("C") || letra.equals("D") || letra.equals("T"));
	}
	
}
