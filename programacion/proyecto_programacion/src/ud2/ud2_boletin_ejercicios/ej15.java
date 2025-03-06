package ud2_boletin_ejercicios;

import java.util.Scanner;

/**
 * Pide por teclado un dia de la semana y que diga que asignatura
 * toca a primera hora de dicho dia
 */

public class ej15 {

	public static void main(String[] args) {
		//Scanner e instrucciones
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca un dia de la semana");
		System.out.println("Se le devolvera la asignatura que toca a primera hora");
		String diaU = scan.nextLine();
		
		diaU = diaU.toLowerCase();
		final String LUN = "lunes";
		final String MAR = "martes";
		final String MIE = "miercoles";
		final String JUE = "jueves";
		final String VIE = "viernes";

		//Situaciones
		switch (diaU) {
		case LUN:
			System.out.println("Entornos de desarrollo");
			break;		
			
		case MAR:
			System.out.println("Programacion");
			break;

		case MIE:
			System.out.println("Bases de datos");
			break;
			
		case JUE:
			System.out.println("Sistemas");
			break;
			
		case VIE:
			System.out.println("Fol");
			break;

		default: System.out.println("Introduzca un dia valido");
			break;
		}

	}

}
