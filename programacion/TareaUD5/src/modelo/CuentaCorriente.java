package modelo;

public abstract class CuentaCorriente extends CuentaBancaria {
    protected String entidadesAutorizadas;

    public CuentaCorriente(Persona titular, double saldoInicial) {
        super(titular, saldoInicial);
        this.entidadesAutorizadas = "";
    }
    
    public CuentaCorriente(Persona titular, double saldoInicial, String entidadesAutorizadas) {
        super(titular, saldoInicial);
        this.entidadesAutorizadas = entidadesAutorizadas;
    }
    
    public String getEntidadesAutorizadas() {
        return entidadesAutorizadas;
    }

    public void setEntidadesAutorizadas(String entidadesAutorizadas) {
        this.entidadesAutorizadas = entidadesAutorizadas;
    }
}