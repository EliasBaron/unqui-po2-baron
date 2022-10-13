package ar.edu.unq.po2.tp7.b;

public class CreditoHipotecario extends Credito{
	
	private Propiedad propiedad;

	public CreditoHipotecario(ClienteBanco solicitante, float montoSolicitado, int plazoMeses, Propiedad propiedad) {
		super(solicitante, montoSolicitado, plazoMeses);
		this.propiedad = propiedad;
	}

	@Override
	public boolean esAceptable() {
		ClienteBanco solicitante = this.getSolicitante();
		return this.cumpleCuota(solicitante) && this.valorFiscalAcorde(propiedad) && this.noSupera65(solicitante);
	}

	@Override
	public boolean cumpleCuota(ClienteBanco solicitante) {
		return this.montoMensual() < solicitante.getSueldoMensualPorcentaje(0.5);
	}
	
	public boolean valorFiscalAcorde(Propiedad propiedad) {
		return !((propiedad.getValorFiscal() * 0.7) < this.getMontoSolicitado());
 	}
	
	public boolean noSupera65(ClienteBanco solicitante) {
		return (solicitante.getEdad() + this.mesesToAños()) < 65;
	}
	
	public double mesesToAños() {
		return getPlazoMeses() / 12;
	}
	
	
}
