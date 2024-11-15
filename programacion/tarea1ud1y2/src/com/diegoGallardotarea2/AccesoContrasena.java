package com.diegoGallardotarea2;

import java.util.Scanner;

public class AccesoContrasena {

	public static void main(String[] args) {
		/**
		 * Se le pedira al usuario una clave, con 3 intentos para introducir la correcta.
		 * Si acierta, se mostrara un mensaje de exito, 
		 * si excede el numero de intentos, se mostrara un error.
		 */
		
		System.out.println("Introduzca la clave: ");
		Scanner scan = new Scanner(System.in);
		
		String clave = "123";
		String intentoAct = scan.nextLine();
		int intentos = 1;
		for( ; intentos < 3 ; intentos++ ) {
				
			if(intentoAct.equals(clave)) {
				System.out.println("Correcto");
				scan.close();
				break;
			}
			
			else {
				System.out.println("Intente de nuevo");
				intentoAct = scan.nextLine();	
			}
			
		}
		
		if(intentoAct.equals(clave) && intentos == 3) {
			System.out.println("Correcto");
			scan.close();
		}
		
		if (intentos == 3 && !intentoAct.equals(clave)) {

			System.err.println("Intentos agotados");
			scan.close();

		}
		}
	
	}
