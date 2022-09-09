package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Desarmador {
	
	public static ArrayList<Integer> desarmar(int n) {
		
		ArrayList<Integer> digitos = new ArrayList<Integer>();
		
		while (n > 0) {
			digitos.add(n % 10);
			n = n / 10;
		}
		
		return digitos;
		
	}
	
}
