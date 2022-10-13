package ar.edu.unq.po2.tp8;

public enum Palo {
	
	PICA("P"), CORAZON("C"), DIAMANTE("D"), TREBOL("T"); 
	
	private String letra;
	
	private Palo(String letra) {
		this.letra = letra;
	}
	
	public String getLetra() {
		return letra;
	}
	
}
