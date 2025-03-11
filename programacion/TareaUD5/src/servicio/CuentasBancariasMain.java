package servicio;

import modelo.Banco;
import modelo.Persona;

public class CuentasBancariasMain {
    public static void main(String[] args) {
        
        Banco banco = new Banco();
        
        Persona persona1 = new Persona("Juan", "Pérez García", "12345678A");
        Persona persona2 = new Persona("María", "López Sánchez", "87654321B");
        Persona persona3 = new Persona("Carlos", "Gómez Ruiz", "23456789C");
        
        System.out.println("\n Apertura de cuentas");
        boolean exito1 = banco.abrirCuenta(1, persona1, 1000.0);
        System.out.println("Cuenta Ahorro creada: " + exito1);
        
        boolean exito2 = banco.abrirCuenta(2, persona2, 500.0);
        System.out.println("Cuenta Corriente Personal creada: " + exito2);
        
        boolean exito3 = banco.abrirCuenta(3, persona3, 2000.0);
        System.out.println("Cuenta Corriente Empresa creada: " + exito3);
        
        System.out.println("\n Listado de cuentas");
        String[] listado = banco.listadoCuentas();
        for (String cuenta : listado) {
            System.out.println(cuenta);
        }
        
        System.out.println("\n Prueba de ingreso");
        System.out.println("Saldo inicial de " + persona1.getDni() + ": " + banco.obtenerSaldo(persona1.getDni()));
        boolean ingreso = banco.ingresoCuenta(persona1.getDni(), 500.0);
        System.out.println("Ingreso de 500€ realizado: " + ingreso);
        System.out.println("Nuevo saldo de " + persona1.getDni() + ": " + banco.obtenerSaldo(persona1.getDni()));
        
        System.out.println("\n Prueba de retirada");
        System.out.println("Saldo inicial de " + persona2.getDni() + ": " + banco.obtenerSaldo(persona2.getDni()));
        boolean retirada1 = banco.retiradaCuenta(persona2.getDni(), 200.0);
        System.out.println("Retirada de 200€ realizada: " + retirada1);
        System.out.println("Nuevo saldo de " + persona2.getDni() + ": " + banco.obtenerSaldo(persona2.getDni()));
        
        System.out.println("\n Prueba de retirada con descubierto");
        System.out.println("Saldo inicial de " + persona3.getDni() + ": " + banco.obtenerSaldo(persona3.getDni()));
        boolean retirada2 = banco.retiradaCuenta(persona3.getDni(), 2500.0);
        System.out.println("Retirada de 2500€ realizada: " + retirada2);
        System.out.println("Nuevo saldo de " + persona3.getDni() + ": " + banco.obtenerSaldo(persona3.getDni()));
        
        System.out.println("\n Información de cuenta específica");
        String info = banco.informacionCuenta(persona1.getDni());
        System.out.println("Info de " + persona1.getDni() + ": " + info);

    }
}
