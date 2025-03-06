package modelo;

public class CuentaAhorro extends CuentaBancaria {
	private static double tipoInteresAnualDefault = 0.5;
    private double tipoInteresAnual;

    public CuentaAhorro(Persona titular, double saldoInicial) {
        super(titular, saldoInicial);
        this.tipoInteresAnual = tipoInteresAnualDefault;
    }

    public static void setTipoInteresAnualDefault(double nuevoTipo) {
        tipoInteresAnualDefault = nuevoTipo;
    }

}
