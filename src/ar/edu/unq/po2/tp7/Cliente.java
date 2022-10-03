package ar.edu.unq.po2.tp7;

public class Cliente {
	
	private String nombreUsuario;
	private String passUsuario;
	private IServidor servidor;
	
	public Cliente(IServidor servidor, String nombreUsuario, String passUsuario ) {
		this.nombreUsuario = nombreUsuario;
		this.passUsuario = passUsuario;
		this.servidor = servidor;
		conectar();	
	}
	
	public Cliente(String nombreUsuario, String passUsuario) {
		this.nombreUsuario = nombreUsuario;
		this.passUsuario = passUsuario;
	}

	public void conectar() {
		this.servidor.conectar(this.nombreUsuario,this.passUsuario);
	}
	
}
