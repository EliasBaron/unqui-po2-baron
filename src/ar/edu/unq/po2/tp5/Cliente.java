package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private List<Pagable> pagables = new ArrayList<>();
	
	public List<Pagable> getPagables() {
		return pagables;
	}
	
	public void addPagable(Pagable p) {
		pagables.add(p);
	}
	
}