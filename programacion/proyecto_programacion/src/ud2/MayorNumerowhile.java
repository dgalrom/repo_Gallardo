package ud2;

import java.util.Scanner;

public class MayorNumerowhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//opcion A. Indicamos el numero de datos
		//opcion B. Establecemos una instruccion de parada
		System.out.println("A continuación, introduzca los numeros a evaluar");
		System.out.println("Introduzca \"STOP\" cuando quieras parar de introducir números");
int numeroDatos = scan.nextInt();
int mayorNumero = Integer.MIN_VALUE;
String dato = "";
boolean salir = false;
do {
	System.out.println("Introduce un entero");
	dato = scan.nextLine();
	if ("STOP".equals(dato)) {
		salir = true;
	} else {
		int datoEntero = Integer.parseInt(dato);
	mayorNumero = datoEntero > mayorNumero ? datoEntero : mayorNumero;
	if(datoEntero >  mayorNumero) {
		mayorNumero = datoEntero;
	}
	}
}while (!salir); 

int numActual = scan.nextInt();
if(mayorNumero < numActual) {
	mayorNumero = numActual;
}
System.out.println("El mayor numero introducido es el " + mayorNumero);
}
	}


