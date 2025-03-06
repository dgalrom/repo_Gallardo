package modelo;

public abstract class CuentaCorriente extends CuentaBancaria {
	protected String entidadesAutorizadas;

    public CuentaCorriente(Persona titular, double saldoInicial) {
        super(titular, saldoInicial);
    }
}
