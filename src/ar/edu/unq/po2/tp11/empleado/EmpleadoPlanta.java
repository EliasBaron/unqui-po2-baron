package ar.edu.unq.po2.tp11.empleado;

public class EmpleadoPlanta extends Empleado{
	
	private int cantidadHijos;
	
	public EmpleadoPlanta(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}

	@Override
	public int getSueldoBasico() {
		return 3000;
	}

	@Override
	public int getBonusHoras() {
		return 0;
	}

	@Override
	public int getBonoFamiliar() {
		return 150 * this.cantidadHijos;
	}
	
	
	
}
