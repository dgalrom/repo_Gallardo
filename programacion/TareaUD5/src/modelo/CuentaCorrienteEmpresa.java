package modelo;

public class CuentaCorrienteEmpresa extends CuentaCorriente {
	private static double tipoInteresDescubiertoDefault = 5.0;
    private double tipoInteresDescubierto;
    private double maximoDescubiertoPermitido;
    private double interesDescubierto;

    public CuentaCorrienteEmpresa(Persona titular, double saldoInicial, double maximoDescubiertoPermitido, double interesDescubierto) {
        super(titular, saldoInicial);
        this.tipoInteresDescubierto = tipoInteresDescubiertoDefault;
        this.maximoDescubiertoPermitido = maximoDescubiertoPermitido;
        this.interesDescubierto = interesDescubierto;
    }

}
