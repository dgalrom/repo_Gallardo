package modelo;

import interfaz.Imprimible;

public class Banco {
    private CuentaBancaria[] cuentas;
    private int numeroCuentas;
    private static final int MAX_CUENTAS = 100;

    public Banco() {
        this.cuentas = new CuentaBancaria[MAX_CUENTAS];
        this.numeroCuentas = 0;
    }

    public boolean abrirCuenta(CuentaBancaria cuenta) {
        if (numeroCuentas >= MAX_CUENTAS) {
            return false;
        }
        
        cuentas[numeroCuentas] = cuenta;
        numeroCuentas++;
        return true;
    }
    

    public boolean abrirCuenta(int tipo, Persona titular, double saldoInicial) {
        if (numeroCuentas >= MAX_CUENTAS) {
            return false;
        }

        boolean operacionExitosa = true;
        /**
         * 1.CA 
         * 2.CCP 
         * 3.CCE 
         */
        try {
            CuentaBancaria nuevaCuenta = null;
            
            switch (tipo) {
                case 1:
                    nuevaCuenta = new CuentaAhorro(titular, saldoInicial);
                    break;
                case 2:
                    nuevaCuenta = new CuentaCorrientePersonal(titular, saldoInicial);
                    break;
                case 3:
                    
                    double maximoDescubiertoPermitido = 1000.0;
                    double interesDescubierto = 0.0;
                    nuevaCuenta = new CuentaCorrienteEmpresa(titular, saldoInicial, maximoDescubiertoPermitido, interesDescubierto);
                    break;
                default:
                    operacionExitosa = false;
                    break;
            }
            
            if (nuevaCuenta != null) {
                cuentas[numeroCuentas] = nuevaCuenta;
                numeroCuentas++;
            }
            
        } catch (Exception e) {
            operacionExitosa = false;
        }
        
        return operacionExitosa;
    }

    public String[] listadoCuentas() {
        String[] listado = new String[numeroCuentas];
        for (int i = 0; i < numeroCuentas; i++) {
            CuentaBancaria cuenta = cuentas[i];
            if (cuenta instanceof Imprimible) {
                listado[i] = ((Imprimible) cuenta).devolverInfoString();
            } else {
                listado[i] = "Cuenta - IBAN: " + cuenta.getIban() + 
                            ", Titular: " + cuenta.getTitular().getNombre() + " " + 
                            cuenta.getTitular().getApellidos() + 
                            ", Saldo: " + cuenta.getSaldo() + "€";
            }
        }
        return listado;
    }

    public String informacionCuenta(String identificador) {
        CuentaBancaria cuenta = buscarCuenta(identificador);
        
        if (cuenta != null) {
            if (cuenta instanceof Imprimible) {
                return ((Imprimible) cuenta).devolverInfoString();
            } else {
                return "Cuenta - IBAN: " + cuenta.getIban() + 
                      ", Titular: " + cuenta.getTitular().getNombre() + " " + 
                      cuenta.getTitular().getApellidos() + 
                      ", Saldo: " + cuenta.getSaldo() + "€";
            }
        }
        
        return null;
    }

    public boolean ingresoCuenta(String identificador, double cantidad) {
        if (cantidad <= 0) {
            return false;
        }
        
        CuentaBancaria cuenta = buscarCuenta(identificador);
        
        if (cuenta != null) {
            cuenta.ingresar(cantidad);
            return true;
        }
        
        return false;
    }

    public boolean retiradaCuenta(String identificador, double cantidad) {
        if (cantidad <= 0) {
            return false;
        }
        
        CuentaBancaria cuenta = buscarCuenta(identificador);
        
        if (cuenta != null) {
            if (cuenta.retirar(cantidad)) {
                return true;
            }
        }
        
        return false;
    }

    public Double obtenerSaldo(String identificador) {
        CuentaBancaria cuenta = buscarCuenta(identificador);
        
        if (cuenta != null) {
            return cuenta.getSaldo();
        }
        
        return null;
    }

    private CuentaBancaria buscarCuenta(String identificador) {
        // Buscar por IBAN
        for (int i = 0; i < numeroCuentas; i++) {
            if (cuentas[i].getIban().equals(identificador)) {
                return cuentas[i];
            }
        }
        
        // Buscar por DNI del titular
        for (int i = 0; i < numeroCuentas; i++) {
            if (cuentas[i].getTitular().getDni().equals(identificador)) {
                return cuentas[i];
            }
        }
        
        return null;
    }
}