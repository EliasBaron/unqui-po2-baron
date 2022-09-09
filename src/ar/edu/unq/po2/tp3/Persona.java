package ar.edu.unq.po2.tp3;

public class Persona {
	String nombre;
	String apellido;
	int edad;
	
	public Persona(String n, String a, int e) {
		this.nombre = n;
		this.apellido = a;
		this.edad = e;
	}
	
	public int getEdad() {
		return edad;
	}
}
