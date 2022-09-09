package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EquipoTrabajoTestCase {
	private EquipoDeTrabajo equipo;
	private Persona martin = new Persona("martin", "Garcia", 30);
	private Persona marta = new Persona("marta", "Garcia", 25);
	private Persona marcos = new Persona("marcos", "Garcia", 20);
	private Persona mirtha = new Persona("mirtha", "Garcia", 25);
	
	@BeforeEach
	public void setUp() throws Exception {
		//Se crea el contador
		equipo = new EquipoDeTrabajo();
		
		//Se agregan los numeros. Un solo par y nueve impares
		EquipoDeTrabajo.addIntegrante(martin);
		EquipoDeTrabajo.addIntegrante(marta);
		EquipoDeTrabajo.addIntegrante(marcos);
		EquipoDeTrabajo.addIntegrante(mirtha);
	}
	
	/**
	* Verificar los tests
	*/
	
	@Test
	public void elPromedioEdadEs25() {
			
			assertEquals(equipo.promedioEdades(), 20);
		
		}
	
	
	
}
