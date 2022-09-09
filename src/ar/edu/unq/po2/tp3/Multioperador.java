package ar.edu.unq.po2.tp3;

import java.util.ArrayList;


public class Multioperador {

	private ArrayList<Integer> numeros = new ArrayList<Integer>();
	
	public void addNumber(int n) {
		numeros.add(n);
	}
	
	public int sumarNumeros() {
		
		int resultado = 0;
		
		for (int i = 0; i < numeros.size(); i++) {
			resultado += numeros.get(i);
		}
		
		return resultado;
		
	}
	
	public int restarNumeros() {
		
		int resultado = numeros.get(0);
		
		for (int i = 1; i < numeros.size(); i++) {
			resultado -= numeros.get(i);
		}
		
		return resultado;
		
	}
	
	public int multiplicarNumeros() {
		
		int resultado = numeros.get(0);
		
		for (int i = 1; i < numeros.size(); i++) {
			resultado = resultado * numeros.get(i);
		}
		
		return resultado;
		
	}
	
}
