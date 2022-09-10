package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Supermercado {
	
	private String nombre;
	private String direccion;
	private ArrayList<Producto> stock = new ArrayList<Producto>();
	
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public void agregarProducto(Producto producto) {
		stock.add(producto);
	}
	
	public int getCantidadDeProductos() {
		return stock.size();
	}
	
	public double getPrecioTotal() {
		
		int totalSuma = 0;
		
		for (int i = 0; i < stock.size(); i++) {
			totalSuma += stock.get(i).getPrecio();
		}
		
		return totalSuma;
		
	}
	
	
}
