package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Nombrador {

	static Persona julian = new Persona("Julian");
	static Persona jose = new Persona("Jose");
	
	static Mascota rex = new Mascota("Rex", "caniche");
	static Mascota homero = new Mascota("Homero", "caniche");
	
	static List<Nombrable> nombrables = new ArrayList<Nombrable>(List.of(julian, jose, rex, homero));
	
	public static void main(String[] args) {
		
		for(Nombrable nombrable: nombrables) {
			System.out.print(nombrable.getNombre());
		}
		
	}

}
