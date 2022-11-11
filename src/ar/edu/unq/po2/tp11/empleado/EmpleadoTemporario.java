package ar.edu.unq.po2.tp11.empleado;

public class EmpleadoTemporario extends Empleado {

	private int horasTrabajadas;
	private boolean estaCasado;
	private boolean tieneHijos;
	
	public EmpleadoTemporario(int horasTrabajadas, boolean estaCasado, boolean tieneHijos) {
		this.horasTrabajadas = horasTrabajadas;
		this.estaCasado = estaCasado;
		this.tieneHijos = tieneHijos;
	}
	
	@Override
	public int getSueldoBasico() {
		return 1000;
	}

	@Override
	public int getBonusHoras() {
		return 5 * horasTrabajadas;
	}

	@Override
	public int getBonoFamiliar() {
		if (this.estaCasado || this.tieneHijos) {
			return 100;
		}
		else return 0;
	}
	
}
