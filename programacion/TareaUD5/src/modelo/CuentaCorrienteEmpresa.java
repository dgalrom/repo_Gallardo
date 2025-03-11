package modelo;

public class CuentaCorrienteEmpresa extends CuentaCorriente {
    private static double tipoInteresDescubiertoDefault = 5.0;
    private static double comisionFijaDescubiertoDefault = 30.0;
    
    private double tipoInteresDescubierto;
    private double maximoDescubiertoPermitido;
    private double comisionFijaDescubierto;

    public CuentaCorrienteEmpresa(Persona titular, double saldoInicial, double maximoDescubiertoPermitido, double interesDescubierto) {
        super(titular, saldoInicial);
        this.tipoInteresDescubierto = tipoInteresDescubiertoDefault;
        this.maximoDescubiertoPermitido = maximoDescubiertoPermitido;
        this.comisionFijaDescubierto = comisionFijaDescubiertoDefault;
    }
    
    public CuentaCorrienteEmpresa(Persona titular, double saldoInicial, String entidadesAutorizadas, double maximoDescubiertoPermitido, double comisionFijaDescubierto) {
        super(titular, saldoInicial, entidadesAutorizadas);
        this.tipoInteresDescubierto = tipoInteresDescubiertoDefault;
        this.maximoDescubiertoPermitido = maximoDescubiertoPermitido;
        this.comisionFijaDescubierto = comisionFijaDescubierto;
    }
    
    public static void setTipoInteresDescubiertoDefault(double nuevoTipo) {
        tipoInteresDescubiertoDefault = nuevoTipo;
    }
    
    public static void setComisionFijaDescubiertoDefault(double nuevaComision) {
        comisionFijaDescubiertoDefault = nuevaComision;
    }
    
    public double getTipoInteresDescubierto() {
        return tipoInteresDescubierto;
    }

    public void setTipoInteresDescubierto(double tipoInteresDescubierto) {
        this.tipoInteresDescubierto = tipoInteresDescubierto;
    }

    public double getMaximoDescubiertoPermitido() {
        return maximoDescubiertoPermitido;
    }

    public void setMaximoDescubiertoPermitido(double maximoDescubiertoPermitido) {
        this.maximoDescubiertoPermitido = maximoDescubiertoPermitido;
    }

    public double getComisionFijaDescubierto() {
        return comisionFijaDescubierto;
    }

    public void setComisionFijaDescubierto(double comisionFijaDescubierto) {
        this.comisionFijaDescubierto = comisionFijaDescubierto;
    }
    
    @Override
    public boolean retirar(double cantidad) {
        // Comprobamos si hay saldo suficiente
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            return true;
        } 
        // Si no hay saldo suficiente pero está dentro del descubierto permitido
        else if (cantidad > 0 && (saldo - cantidad) >= -maximoDescubiertoPermitido) {
            saldo -= cantidad;
            // Aplicar comisión por descubierto
            saldo -= comisionFijaDescubierto;
            return true;
        }
        return false;
    }
    
    @Override
    public String devolverInfoString() {
        return "Cuenta Corriente Empresa - IBAN: " + iban + ", Titular: " + titular.getNombre() + " " + 
               titular.getApellidos() + ", Saldo: " + saldo + "€, Entidades: " + entidadesAutorizadas + 
               ", Máximo descubierto: " + maximoDescubiertoPermitido + "€, Interés descubierto: " + 
               tipoInteresDescubierto + "%, Comisión descubierto: " + comisionFijaDescubierto + "€";
    }
}