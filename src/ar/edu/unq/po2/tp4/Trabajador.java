package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	
	private List<Ingreso> ingresos = new ArrayList<Ingreso>();
	
	public void guardarIngreso(Ingreso ingreso) {
		ingresos.add(ingreso);
	}
	
	public double getTotalPercibido() {
		
		double totalPercibido = 0;
		
		for (int i = 0; i < ingresos.size(); i++) {
			totalPercibido = totalPercibido + ingresos.get(i).getMonto();
		}
		
		return totalPercibido;
	}
	
	public double getTotalImponible() {
		
		double totalImponible = 0;
		
		for (int i = 0; i < ingresos.size(); i++) {
			totalImponible = totalImponible + ingresos.get(i).getMontoImponible();
		}
		
		return totalImponible;
	}
	
	public double getImpuestoAPagar() {
		return this.getTotalImponible() * 0.2;
	}
}
