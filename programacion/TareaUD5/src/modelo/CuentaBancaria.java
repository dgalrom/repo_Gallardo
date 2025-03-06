package modelo;

public abstract class CuentaBancaria {
	protected Persona titular;
    protected double saldo;
    protected String iban;

    public CuentaBancaria(Persona titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.iban = generarIban();
    }

    private String generarIban() {
        StringBuilder iban = new StringBuilder("ES");
        for (int i = 0; i < 20; i++) {
            iban.append((int) (Math.random() * 10));
        }
        return iban.toString();
    }

	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}
	
	public void ingresar(double cantidad) {
        if (cantidad > 0) saldo += cantidad;
    }

}
