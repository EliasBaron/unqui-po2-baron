package ar.edu.unq.po2.tp6;

public enum DiaDeLaSemana {
	
	LUNES(500), MARTES(500), MIERCOLES(500), JUEVES(1000), VIERNES(1000), SABADO(1000), DOMINGO(1000);
	
	private int monto;
	
	private DiaDeLaSemana(int monto) {
		this.monto = monto;
	}
	
	public int getMonto() {
		return monto;
	}
	
}
