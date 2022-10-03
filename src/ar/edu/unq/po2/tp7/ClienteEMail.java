package ar.edu.unq.po2.tp7;

import java.util.ArrayList;

public class ClienteEMail extends Cliente {
	
	 IServidorCorreo servidor;   //solamente de correo ya que es un cliente de email pero deja las peurtas abiertas a que 
	 							 // el dia de mañana aparezca otro tipo de servidor email.
	 String nombreUsuario;
	 String passusuario;
	 ArrayList<Correo> inbox;
	private ArrayList<Correo> borrados;
	
	public ClienteEMail(IServidorCorreo servidor, String nombreUsuario, String pass){
		super(nombreUsuario, pass);
		this.servidor = servidor;
		this.conectar();
	}
	
	
	public void borrarCorreo(Correo correo){
		this.inbox.remove(correo);
		this.borrados.remove(correo);
	}
	
	public int contarBorrados(){
		return this.borrados.size();
	}
	
	public int contarInbox(){
		return this.inbox.size();
	}
	
	public void eliminarBorrado(Correo correo){
		this.borrados.remove(correo);
	}
	
	public void recibirNuevos(){
		this.servidor.recibirNuevos(this.nombreUsuario, this.passusuario);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.servidor.enviar(correo);
	}

}
