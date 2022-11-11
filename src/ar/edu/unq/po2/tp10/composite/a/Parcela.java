package ar.edu.unq.po2.tp10.composite.a;

import java.util.ArrayList;
import java.util.List;

public class Parcela extends Cultivo{

	private List<Cultivo> cultivosParcela;
	private int cantidadCultivos;
	
	public Parcela() {
		this.cultivosParcela = new ArrayList<>();
		this.cantidadCultivos = 0;
	}
	
	public List<Cultivo> getCultivosParcela(){
		return this.cultivosParcela;
	}
	
	public int getCantidadCultivos() {
		return this.cantidadCultivos;
	}
	
	public void addCultivo(Cultivo cultivo) {
		if(this.cantidadCultivos < 4) {
			cultivosParcela.add(cultivo);
			cantidadCultivos++;
		}
	}
	
	@Override
	public int getGanancia() {
		return cultivosParcela.stream().mapToInt(cultivo -> cultivo.getGanancia()).sum();		
	}

}
