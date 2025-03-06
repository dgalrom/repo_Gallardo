package modelo;

public class CuentaCorrientePersonal extends CuentaCorriente {
	private static double comisionMantenimientoDefault = 20.0;
    private double comisionMantenimiento;

    public CuentaCorrientePersonal(Persona titular, double saldoInicial) {
    	super(titular, saldoInicial);
        this.comisionMantenimiento = comisionMantenimientoDefault;
    }

    public static void setComisionMantenimientoDefault(double nuevaComision) {
        comisionMantenimientoDefault = nuevaComision;
    }
}
