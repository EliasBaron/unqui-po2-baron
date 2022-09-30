package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto {

	public ProductoCooperativa(String nombre, double precio, boolean pc, int stock) {

		super(nombre, precio, pc, stock);

	}
	
	public ProductoCooperativa(String nombre, double precio, int stock) {

		super(nombre, precio, stock);

	}
	
	
	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return super.precioNeto() - (super.precioNeto() * 0.1);
	}
}
