package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


public class SecretariaDeportes {
	
	private List<ActividadSemanal> actividadesSemanal = new ArrayList<>();
//	private Stream<ActividadSemanal> streamActividad = actividadesSemanal.stream();
//	
//	public SecretariaDeportes(List<ActividadSemanal> actividadesSemanal) {
//		this.actividadesSemanal = actividadesSemanal;
//	}
	
	public List<ActividadSemanal> getActividades(){
		return actividadesSemanal;
	}
	
	public void addActividad(ActividadSemanal a) {
		actividadesSemanal.add(a);
	}
	
	public List<ActividadSemanal> getActividadesFutbol(){
		return actividadesSemanal.stream().filter(act -> act.getDeporte() == Deporte.FUTBOL).toList();
	}

	public List<ActividadSemanal> actividadesComplejidad(int i) {
		return actividadesSemanal.stream().filter(act -> act.getDeporte().getComplejidad() == i).toList();
	}
	
	public double getHorasTotalesSemanales() {
		return actividadesSemanal.stream().map(act -> act.getDuracion()).reduce(0.00, (acumulado,nuevo) -> acumulado + nuevo);
	}
	
	public List<ActividadSemanal> getActividadesDeporte(Deporte deporte){
		return actividadesSemanal.stream().filter(act -> act.getDeporte() == deporte).toList();
	}
	
	public int getMinimoDeActividadesDeporte(Deporte deporte) {
		return this.getActividadesDeporte(deporte).stream().map(act -> act.getCosto()).min(Comparator.naturalOrder()).get();
	}

	public List<ActividadSemanal> actividadMenorCostoDeporte(Deporte deporte) {
		return this.getActividadesDeporte(deporte).stream().filter(act -> act.getCosto() == this.getMinimoDeActividadesDeporte(deporte)).toList();
	}
	
}
