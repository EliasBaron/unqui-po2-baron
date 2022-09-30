package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja implements Agencia{
	
	
//	public int calcularMonto(Cliente c) {
//		
//		List <Producto> productosCliente = new ArrayList<>();
//		productosCliente =	c.getProductos();
//		int monto = 0;
//		
//		
//		for (int i = 0; i < productosCliente.size(); i++) {
//			monto += productosCliente.get(i).getPrecio();
//		}
//		
//		return monto;
//		
//	}
	
	public double registarPagables(Cliente c) {
		
		List <Pagable> pagablesCliente = c.getPagables();
		double montoAPagar = 0;
		
		for (int i = 0; i < pagablesCliente.size(); i++) {
			montoAPagar += pagablesCliente.get(i).registrado();
		}
		return montoAPagar;
	}
	
	@Override
	public void registrarPago(Pagable p) {}
	
}