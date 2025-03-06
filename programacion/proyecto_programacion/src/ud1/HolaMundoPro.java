package ud1;

import java.util.Scanner;

public class HolaMundoPro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduza su nombre");
		String nombre = scan.next();
		nombre = "".equals(nombre) ? "amigo" : nombre;
		System.out.println("Hola, "+ nombre) ;
		
		if (!"".equals(nombre)) {
			//si se cumple
			System.out.println("Hola, "+ nombre);
		} else {
			//si no se cumple
		System.out.println();
		}
		
		scan.close();
		
	}

}
