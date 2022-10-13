package ar.edu.unq.po2.tp7.b;

public class ClienteBanco {
	
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private double sueldoNetoMensual;
	private Banco banco;
	private float fondos;
	
	public ClienteBanco(String nombre, String apellido, String direccion, int edad, double sueldoNetoMensual, 
			Banco banco) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
		this.banco = banco;
		this.fondos = 0;
	}
	
	public double sueldoNetoAnual() {
		return this.sueldoNetoMensual * 12;
	}
	
	public void solicitarPrestamo(Credito creditoSolicitado) {
		creditoSolicitado.setSolicitante(this);
	
		banco.registrarSolicitud(creditoSolicitado);
	}

	public void cobrar(float montoMensual) {
		fondos += montoMensual;
	}
	
	public double getSueldoMensual() {
		return sueldoNetoMensual;
	}

	public double  getSueldoMensualPorcentaje(double porcentaje) {
		return sueldoNetoMensual * porcentaje;
	}

	public int getEdad() {
		return edad;
	}
	
}
