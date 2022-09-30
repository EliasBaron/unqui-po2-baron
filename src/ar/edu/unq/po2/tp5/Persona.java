package ar.edu.unq.po2.tp5;

import java.util.Date;

public class Persona implements Nombrable {

	private String nombre;
	private Date fechaNacimiento;
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String getNombre() {
		return this.nombre;
	}
	
	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	
	public boolean esMenorQue(Persona p) {
		long time1 = this.fechaNacimiento.getTime();
		long time2 = p.getFechaNacimiento().getTime();
		
		
		return (time1 < time2);
	}
}
