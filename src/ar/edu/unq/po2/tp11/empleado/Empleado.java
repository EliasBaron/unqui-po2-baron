package ar.edu.unq.po2.tp11.empleado;

public abstract class Empleado {
	
	public double sueldo() {
		return this.getSueldoBruto() - this.getDescuentos();
	}
	
	public int getSueldoBruto() {
		return this.getSueldoBasico() + this.getBonusHoras() + this.getBonoFamiliar();
	}
	
	public abstract int getSueldoBasico();
	public abstract int getBonusHoras();
	public abstract int getBonoFamiliar();
	
	public double getDescuentos() {
		return this.getSueldoBruto() * 0.13; 
	}
	
}
