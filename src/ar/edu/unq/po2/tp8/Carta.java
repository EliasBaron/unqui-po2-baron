package ar.edu.unq.po2.tp8;

public class Carta {
	
	private int valor;
	private Palo palo;
	
	public Carta(int valor, Palo palo) {
		this.valor = valor;
		this.palo = palo;
	}
	
	public int getValor() {
		return valor;
	}
	
	public Palo getPalo() {
		return palo;
	}	
	
	public boolean esMismoPalo(Carta carta) {
		return palo.equals(carta.getPalo());
	}
	
	public boolean esMayorQue(Carta carta) {
		return this.getValor() > carta.getValor();
	}
	
	public boolean esMismoValor(Carta carta) {
		return this.getValor() == carta.getValor(); 
	}
	
}
