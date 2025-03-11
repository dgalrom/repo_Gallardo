package modelo;

import interfaz.Imprimible;

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
    
    public double getTipoInteresAnual() {
        return tipoInteresAnual;
    }

    public void setTipoInteresAnual(double tipoInteresAnual) {
        this.tipoInteresAnual = tipoInteresAnual;
    }
    
    @Override
    public boolean retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }
    
    @Override
    public String devolverInfoString() {
        return "Cuenta Ahorro - IBAN: " + iban + ", Titular: " + titular.getNombre() + " " + 
                titular.getApellidos() + ", Saldo: " + saldo + "€, Interés anual: " + tipoInteresAnual + "%";
    }
}