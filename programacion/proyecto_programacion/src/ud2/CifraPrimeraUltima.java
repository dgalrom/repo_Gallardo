package ud2;

import java.util.Scanner;

/**
 * Devuelve segun la opcion:
 * 1.cual es la primera cifra de un numero entero introducido por teclado
 * 2.cual es la ultima cifra de un numero entero introducido por teclado
 */

public class CifraPrimeraUltima {

	public static void main(String[] args) {
		//Declaración Scanner, mostrar indicaciones al usuario, recolección de datos
		Scanner scan = new Scanner(System.in);
		System.out.println("1: Primera cifra");
		System.out.println("2: Ultima cifra");
		int opcion = scan.nextInt();
		int numero = 0;
		do {
			switch(opcion) {
			case 1:
				//Optiene la primera cifra del numero
				int dividendo = numero;
				int primeraCifra= 0;
				while(dividendo != 0) {
					dividendo = dividendo / 10;
					primeraCifra = dividendo;
					dividendo /= 10;
				}
				break;
			case 2:
				//Obtiene la ultima cifra del numero
				int ultimaCifra = numero % 10;
				System.out.println("La ultima cifra del numero " + numero + " es " + ultimaCifra);
			}
				break;
		}
		 while (opcion == 1 || opcion == 2);
	
		
	}
}
