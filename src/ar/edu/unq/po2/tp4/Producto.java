package ar.edu.unq.po2.tp4;

import java.util.function.BooleanSupplier;

public class Producto {

	private String nombre;
	private double precio;
	private boolean preciosCuidados;
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.preciosCuidados = false;
	}
	
	public Producto(String nombre, double precio, boolean pc) {
		this.nombre = nombre;
		this.precio = precio;
		this.preciosCuidados = pc;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getPrecio() {
//		if (preciosCuidados) {
//			return precio * 0.9;
//		}
		return precio;
	}
	
	public double precioNeto() {
		return this.precio;
	}

	public Boolean esPrecioCuidado() {
		
		return preciosCuidados;
	}

	public void aumentarPrecio(double aumento) {
		
		this.precio += aumento;
		
	}
	
}
