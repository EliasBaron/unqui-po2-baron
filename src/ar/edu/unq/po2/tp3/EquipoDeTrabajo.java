package ar.edu.unq.po2.tp3;
import java.util.*;

public class EquipoDeTrabajo {
	
	String nombreEquipo;
	static ArrayList<Persona> equipoTrabajo = new ArrayList<Persona>();
	
	
	static public void addIntegrante(Persona integrante) {
		equipoTrabajo.add(integrante);
	}
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	
	public List<Integer> edadesEquipo() {
		

		List<Integer> edades = new ArrayList<>();
		
		for (int i = 0; i < equipoTrabajo.size(); i++) {
			edades.add(equipoTrabajo.get(i).getEdad());
		}
		
		return edades;
		
	}
	
	public double promedioEdades() {
		
		List<Integer> edades = this.edadesEquipo();
		int suma = 0;
		
		for (int i = 0; i < edades.size();) {
			suma = suma + edades.get(i);
		}
		
		float promedio = suma / edades.size();
		
		return promedio;
		
	}
	
	
	
}
