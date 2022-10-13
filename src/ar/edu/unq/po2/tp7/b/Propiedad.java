package ar.edu.unq.po2.tp7.b;

public class Propiedad {
	
	private String descripcion;
	private String direccion;
	private float valorFiscal;
	
	public Propiedad(String descripcion, String direccion, float valorFiscal) {
		super();
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valorFiscal = valorFiscal;
	}

	public float getValorFiscal() {
		return valorFiscal;
	}
	
}
