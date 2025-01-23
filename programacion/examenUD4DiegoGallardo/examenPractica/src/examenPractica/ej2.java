package examenPractica;

import java.text.Normalizer;
import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca nombres de ciudades: ");
		
		String ciudadesStr = scan.nextLine();
		String[] ciudades = ciudadesStr.split(",");
		
		for(int i = 0 ; i<ciudades.length ; i++) {
			System.out.println(ciudades[i]);
		}
		
		System.out.println(ciudadesOrdenadas(ciudades));
		System.out.println(aplanaCadena(ciudadesStr));
	}
	
	
		
		private static boolean ciudadesOrdenadas(String[] ciudades) {
			boolean ordenado = true;
			boolean pase = false;
			char inicialanterior = 0;

			for(int i=0; i>=10 ; i++) {
				if(i==0) {
				inicialanterior = ciudades[i].charAt(0);
				}
				else {
				char inicialactual = ciudades[i].charAt(0);
					if(inicialactual < inicialanterior) {
						ordenado=false;
					} else {
						inicialactual=inicialanterior;
					}
				}
			}
			return ordenado;
		
	}
		
		private static String aplanaCadena(String cadena) {
			
			String cadenaAplanada= cadena.toLowerCase();
			
			cadenaAplanada = cadenaAplanada.replace("á", "a");
			cadenaAplanada = cadenaAplanada.replace("é", "e");
			cadenaAplanada = cadenaAplanada.replace("í", "i");
			cadenaAplanada = cadenaAplanada.replace("ó", "o");
			cadenaAplanada = cadenaAplanada.replace("ú", "u");
			cadenaAplanada = cadenaAplanada.replace("ü", "u");

			return cadenaAplanada;
		}

}
