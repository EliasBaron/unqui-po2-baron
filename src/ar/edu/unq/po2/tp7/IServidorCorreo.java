package ar.edu.unq.po2.tp7;

import java.util.List;

public interface IServidorCorreo {
	
	public List<Correo> recibirNuevos(String user, String pass);

	public void enviar(Correo correo);
	
}
 