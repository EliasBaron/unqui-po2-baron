package ar.edu.unq.po2.tp9.observer.a;

import java.util.List;

public class Articulo {

	private String titulo;
	private List<Cientifico> nombresAutores;
	private List<String> filacion;
	private String tipoArticulo;
	private String lugarPublicacion;
	private List<String> palabrasClaves;

	public Articulo(String titulo, List<Cientifico> nombresAutores, List<String> filacion, String tipoArticulo,
			String lugarPublicacion, List<String> palabrasClaves) {
		this.titulo = titulo;
		this.nombresAutores = nombresAutores;
		this.filacion = filacion;
		this.tipoArticulo = tipoArticulo;
		this.lugarPublicacion = lugarPublicacion;
		this.palabrasClaves = palabrasClaves;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public List<Cientifico> getNombresAutores() {
		return nombresAutores;
	}


	public void setNombresAutores(List<Cientifico> nombresAutores) {
		this.nombresAutores = nombresAutores;
	}


	public List<String> getFilacion() {
		return filacion;
	}


	public void setFilacion(List<String> filacion) {
		this.filacion = filacion;
	}


	public String getTipoArticulo() {
		return tipoArticulo;
	}


	public void setTipoArticulo(String tipoArticulo) {
		this.tipoArticulo = tipoArticulo;
	}


	public String getLugarPublicacion() {
		return lugarPublicacion;
	}


	public void setLugarPublicacion(String lugarPublicacion) {
		this.lugarPublicacion = lugarPublicacion;
	}


	public List<String> getPalabrasClaves() {
		return palabrasClaves;
	}


	public void setPalabrasClaves(List<String> palabrasClaves) {
		this.palabrasClaves = palabrasClaves;
	}
	
	
	
}
