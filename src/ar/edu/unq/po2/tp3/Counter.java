package ar.edu.unq.po2.tp3;
import java.util.ArrayList;

public class Counter {
	
	ArrayList<Integer> numeros = new ArrayList<Integer>();
	
	public void addNumber(int number) {
		numeros.add(number);
	}
	
	public int contarImpares() {
		int impares = 0;
		
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) % 2 == 1) {
				impares++;
			}
		}
		return impares;
	}
	
	public int contarPares() {
		int pares = 0;
		
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) % 2 == 0) {
				pares++;
			}
		}
		return pares;
	}
	
	public int contarMuliplosDe(int n) {
		int multiplos = 0;
		
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) % n == 0) {
				multiplos++;
			}
		}
		return multiplos;
	}
	
}
