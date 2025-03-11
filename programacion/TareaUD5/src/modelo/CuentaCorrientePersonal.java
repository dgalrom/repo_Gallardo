package modelo;

public class CuentaCorrientePersonal extends CuentaCorriente {
    private static double comisionMantenimientoDefault = 20.0;
    private double comisionMantenimiento;

    public CuentaCorrientePersonal(Persona titular, double saldoInicial) {
        super(titular, saldoInicial);
        this.comisionMantenimiento = comisionMantenimientoDefault;
    }
    
    public CuentaCorrientePersonal(Persona titular, double saldoInicial, String entidadesAutorizadas) {
        super(titular, saldoInicial, entidadesAutorizadas);
        this.comisionMantenimiento = comisionMantenimientoDefault;
    }

    public static void setComisionMantenimientoDefault(double nuevaComision) {
        comisionMantenimientoDefault = nuevaComision;
    }
    
    public double getComisionMantenimiento() {
        return comisionMantenimiento;
    }

    public void setComisionMantenimiento(double comisionMantenimiento) {
        this.comisionMantenimiento = comisionMantenimiento;
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
        return "Cuenta Corriente Personal - IBAN: " + iban + ", Titular: " + titular.getNombre() + " " + 
               titular.getApellidos() + ", Saldo: " + saldo + "€, Entidades: " + entidadesAutorizadas + 
               ", Comisión mantenimiento: " + comisionMantenimiento + "€";
    }
}