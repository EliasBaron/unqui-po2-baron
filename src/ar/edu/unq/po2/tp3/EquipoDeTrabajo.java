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
	
	
	public float promedioEdades() {
		
		int cantidadTotalEdad = 0;
		int cantidadIntegrantes = equipoTrabajo.size();
		
		for (int i = 0; i < cantidadIntegrantes; i++) {
			cantidadTotalEdad = cantidadTotalEdad + equipoTrabajo.get(i).edad;
		}
		
		return cantidadTotalEdad / cantidadIntegrantes;
		
	}
	
	
	
}
