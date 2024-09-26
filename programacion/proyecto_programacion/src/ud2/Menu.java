package ud2;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		//Opciones
		System.out.println("Opciones"
				+ "1. Comprimir archivo"
				+ "2. Eliminar archivo"
				+ "3. Copiar archivo"
				+ "4. Cerrar programa");
		
		//Herramienta Scanner
		Scanner scan = new Scanner(System.in);
		int opcion = scan.nextInt();
		
		if (opcion>4) {
			
			System.err.println("Opción no válida");
		
		} else if (opcion==1) {
		 System.out.println("El usuario seleccionó comprimir");	
		}
		else if (opcion==2) {
			 System.out.println("El usuario seleccionó eliminar");	
		}	
		else if (opcion==3) {
			 System.out.println("El usuario seleccionó copiar");	
		}	
		else if (opcion==4) {
			 System.out.println("El usuario seleccionó cerrar");	
				
	    }else {
		System.err.println("Opción no válida");
		
		
}
}
}