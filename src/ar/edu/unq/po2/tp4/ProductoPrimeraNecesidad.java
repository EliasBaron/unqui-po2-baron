package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{
	
	private double porcentajeDeDescuento;
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean pc, double porcentaje) {
		
		super(nombre, precio, pc);
		this.porcentajeDeDescuento = porcentaje / 100;
		
	}

	
	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return super.precioNeto() - (super.precioNeto() * porcentajeDeDescuento);
	}
	
	
	
}
