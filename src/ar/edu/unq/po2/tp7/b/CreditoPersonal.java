package ar.edu.unq.po2.tp7.b;

public class CreditoPersonal extends Credito{

	public CreditoPersonal(ClienteBanco solicitante, float montoSolicitado, int plazoMeses) {
		super(solicitante, montoSolicitado, plazoMeses);
	}

	@Override
	public boolean esAceptable() {
		ClienteBanco solicitante = this.getSolicitante();
		return this.cumpleMinimo(solicitante) && this.cumpleCuota(solicitante);
	}

	public boolean cumpleMinimo(ClienteBanco solicitante) {
		return solicitante.sueldoNetoAnual() > 15000;
	}
	
	@Override
	public boolean cumpleCuota(ClienteBanco solicitante) {
		return this.montoMensual() < solicitante.getSueldoMensualPorcentaje(0.7);
	}
	
}
