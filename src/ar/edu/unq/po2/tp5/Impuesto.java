package ar.edu.unq.po2.tp5;

public class Impuesto implements Pagable{
	
	private int tasaDeServicio;
	
	public Impuesto(int tasa) {
		this.tasaDeServicio = tasa;
	}
	
	@Override
	public double registrado() {
		return tasaDeServicio;
	}
	
}