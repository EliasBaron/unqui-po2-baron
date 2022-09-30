package ar.edu.unq.po2.tp5;

public class Producto implements Pagable{

	private String nombre;
	private double precio;
	private boolean preciosCuidados;
	private int stock;
	
	public Producto(String nombre, double precio, int stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.preciosCuidados = false;
		this.stock = stock;
	}
	
	public Producto(String nombre, double precio, boolean pc, int stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.preciosCuidados = pc;
		this.stock = stock;
	}
	
	@Override
	public double registrado() {
		if (stock > 0) {
			stock -= 1;
			return this.getPrecio();
		}
		else return 0;
		
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
	
	public void descontarStock() {
		stock -= 1;
	}
	
	public boolean hayStock() {
		return stock > 0;
	}
	
	public int getStock() {
		return stock;
	}
}
