package ud1;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce un numero entero y veremos si es par o impar: ");

				int numero;   
				numero = scan.nextInt();
	String paridad;
	paridad = numero % 2 == 0 ? "par" : "impar" ;
				System.out.println("El numero introducido es "+ paridad);
				
				//cierre de la herramienta scanner
		scan.close();
	
	
	}

}
