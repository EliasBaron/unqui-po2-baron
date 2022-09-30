package ar.edu.unq.po2.tp6;

public enum Lesion {
	
	ROJO("ROJO",1), GRIS("GRIS",2), 	
	AMARILLO("AMARILLO",3), MIEL("MIEL",4);
	
	private String description;
	private int nivelPeligro;
	
	private Lesion(String descripcion, int nivelPeligro) {
		this.description = descripcion;
		this.nivelPeligro = nivelPeligro;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getNivelPeligro() {
		return nivelPeligro;
	}
	
	public Lesion siguienteLesion(Lesion lesion) {
		
		Lesion lesionRetornar = lesion;
		
		if (lesion.description == "ROJO") {
			lesionRetornar = GRIS;
		}
		else if (lesion.description == "GRIS") {
			lesionRetornar = AMARILLO;
		}
		else if (lesion == AMARILLO) {
			lesionRetornar = MIEL;
		}
		else if (lesion == MIEL){
			lesionRetornar = ROJO;
		}

		return lesionRetornar;
		
	}
}
