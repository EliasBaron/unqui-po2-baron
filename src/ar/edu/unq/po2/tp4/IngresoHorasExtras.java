package ar.edu.unq.po2.tp4;

public class IngresoHorasExtras extends Ingreso {

	private int cantidadHsExt;
	
	public IngresoHorasExtras(String mes, String concepto, double monto, int cantidadHsExt) {
		super(mes, concepto, monto);
		this.cantidadHsExt = cantidadHsExt;
	}	

	@Override
	public double getMontoImponible() {
		return 0;
	}
	
	
	
}
