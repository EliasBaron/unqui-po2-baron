package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SecreatriaDepTest {

	SecretariaDeportes secretaria;
	
	ActividadSemanal futbol1;
	ActividadSemanal futbol2;
	ActividadSemanal futbol3;
	ActividadSemanal tennis;
	
	@BeforeEach
	void setUp() throws Exception {
		
		futbol1 = new ActividadSemanal(DiaDeLaSemana.LUNES, 1800, 100, Deporte.FUTBOL);
		futbol2 = new ActividadSemanal(DiaDeLaSemana.VIERNES, 2000, 100, Deporte.FUTBOL);
		tennis = new ActividadSemanal(DiaDeLaSemana.JUEVES, 1700, 250, Deporte.TENNIS);
		
		secretaria = new SecretariaDeportes();
		
		secretaria.addActividad(futbol1);
		secretaria.addActividad(futbol2);
		secretaria.addActividad(tennis);
		
	}

	@Test
	void testGetActividades() {
		List<ActividadSemanal> listaAComparar = new ArrayList<>();
		
		listaAComparar.add(futbol1);
		listaAComparar.add(futbol2);
		listaAComparar.add(tennis);
		
		assertEquals(listaAComparar, secretaria.getActividades());
		
	}
	
	@Test
	void testGetActividadesFutbol() {
		
		List<ActividadSemanal> listaAComparar = new ArrayList<>();
		
		listaAComparar.add(futbol1);
		listaAComparar.add(futbol2);
		
		assertEquals(listaAComparar, secretaria.getActividadesFutbol());
	}
	
	@Test
	void testGetActividadesComplejidad() {
		
		List<ActividadSemanal> listaAComparar = new ArrayList<>();
		
		listaAComparar.add(tennis);
		
		assertEquals(listaAComparar, secretaria.actividadesComplejidad(3));
	}
	
	@Test
	void testGetHorasSemanalesTotales() {
		
		assertEquals(4.5, secretaria.getHorasTotalesSemanales());
		
	}
	
	@Test
	void testGetActividadMenorCostoDeporte() {
		
		List<ActividadSemanal> listaAComparar = new ArrayList<>();
		
		listaAComparar.add(futbol1);
		
		assertEquals(listaAComparar, secretaria.actividadMenorCostoDeporte(Deporte.FUTBOL));
		
	}
	
	@Test
	void testGetActividadMenorCostoDeporteCon2DeporteMismoPrecio() {
		
		List<ActividadSemanal> listaAComparar = new ArrayList<>();
		futbol3 = new ActividadSemanal(DiaDeLaSemana.LUNES, 2000, 100, Deporte.FUTBOL);
		
		secretaria.addActividad(futbol3);
		listaAComparar.add(futbol1);
		listaAComparar.add(futbol3);
		
		assertEquals(listaAComparar, secretaria.actividadMenorCostoDeporte(Deporte.FUTBOL));
		
	}


}
