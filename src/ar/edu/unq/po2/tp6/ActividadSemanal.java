package ar.edu.unq.po2.tp6;

public class ActividadSemanal {
	
	private DiaDeLaSemana dia;
	private int horaInicio;
	private double duracion;
	private Deporte deporte;
	
	public ActividadSemanal(DiaDeLaSemana dia, int horaInicio, double duracion, Deporte deporte) {
		this.dia = dia;
		this.horaInicio = horaInicio;
		this.duracion = duracion;
		this.deporte = deporte;
	}
	
	public DiaDeLaSemana getDia() {
		return dia;
	}
	
	public int getHoraInicio() {
		return horaInicio;
	}
	
	public double getDuracion() {   //la devuelve en horas
		return duracion / 100;
	}
	
	public Deporte getDeporte() {
		return deporte;
	}
	
	public int getCosto() {
		return dia.getMonto() + deporte.precioComplejidad();
	}

		
}
