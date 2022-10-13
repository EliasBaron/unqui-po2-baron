package ar.edu.unq.po2.tp7.b;

import java.util.List;
import java.util.ArrayList;


public class Banco {
	
	private List<ClienteBanco> clientes = new ArrayList<>();
	private List<Credito> solicitudesRegistradas = new ArrayList<>();
	
	public void addCliente(ClienteBanco cliente) {
		clientes.add(cliente);
	}

	public void registrarSolicitud(Credito credito) {
		solicitudesRegistradas.add(credito);
	}
	
	public float revisarYContarSolicitudes() {

	   //solicitudesRegistradas.stream().forEach(solicitud -> this.evaluarSolicitud(solicitud));
		int contador = 0;

		for (int i = 0; i < solicitudesRegistradas.size(); i++) {
			contador += this.evaluarSolicitud(solicitudesRegistradas.get(i));
		}
		return contador;
	}
	
	public float evaluarSolicitud(Credito solicitud) {
		if (solicitud.esAceptable()) {
			solicitud.getSolicitante().cobrar(solicitud.montoMensual());
			return solicitud.getMontoSolicitado();
		}
		else return 0;
	}
	
}
