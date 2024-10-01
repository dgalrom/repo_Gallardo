package ud2;

import java.util.Scanner;

public class MayorNumero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//opcion A. Indicamos el numero de datos
		//opcion B. Establecemos una instruccion de parada
		System.out.println("A continuación, introduzca los numeros a evaluar");
int numeroDatos = scan.nextInt();
int mayorNumero = Integer.MIN_VALUE;
for (int index = 0 ;index == numeroDatos;index++) {
	System.out.println("Introduce el dato numero" + (index+1));
int numActual = scan.nextInt();
if(mayorNumero < numActual) {
	mayorNumero = numActual;
}
System.out.println("Te faltan " + (numeroDatos - index -1) + " datos");
}
	}

}
