package ar.edu.unq.po2.tp7.a;

public interface IServidor {
	
	public float tasaDeTransferencia();
	
	public void resetear();
	
	public void realizarBackUp();
	
	public void conectar(String nombreUsuario, String passusuario);
}
