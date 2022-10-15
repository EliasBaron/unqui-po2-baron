package ar.edu.unq.po2.tp9.observer.b;

import java.util.List;

public class Partido {

	private String resultado;
	private List<String> contricantes;
	private String deporte;

	public Partido(String resultado, List<String> contricantes, String deporte) {
		this.resultado = resultado;
		this.contricantes = contricantes;
		this.deporte = deporte;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public List<String> getContricantes() {
		return contricantes;
	}

	public void setContricantes(List<String> contricantes) {
		this.contricantes = contricantes;
	}

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

}
