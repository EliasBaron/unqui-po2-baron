package ar.edu.unq.po2.tp5;

public class Factura implements Pagable{
	
	private double costoPorUnidad;
	private double cantidadUnidadesConsumidas;
	
	public Factura(double costo, double cantidad) {
		this.costoPorUnidad = costo;
		this.cantidadUnidadesConsumidas = cantidad;
	}
	
	@Override
	public double registrado() {
		return costoPorUnidad * cantidadUnidadesConsumidas;
	}
	
}
