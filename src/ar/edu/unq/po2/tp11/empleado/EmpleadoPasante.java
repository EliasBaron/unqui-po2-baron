package ar.edu.unq.po2.tp11.empleado;

public class EmpleadoPasante extends Empleado{

	private int horasTrabajadas;
	
	public EmpleadoPasante(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	@Override
	public int getSueldoBasico() {
		return 0;
	}

	@Override
	public int getBonusHoras() {
		return 40 * this.horasTrabajadas;
	}

	@Override
	public int getBonoFamiliar() {
		return 0;
	}

}
