package examenPractica;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca nombres de ciudades: ");

		String ciudadesStr = scan.nextLine();
		String[] ciudades = ciudadesStr.split(",");

		for (int i = 0; i < ciudades.length; i++) {
			System.out.println(ciudades[i]);
		}

		System.out.println("Ordenadas= " + ciudadesOrdenadas(ciudades));
		System.out.println("Cadena aplanada: " + aplanaCadena(ciudadesStr));
		System.out.println("Repetidas: " + ciudadesRepetidas(ciudades));
	}

	private static boolean ciudadesOrdenadas(String[] ciudades) {

		boolean ordenadas = false;

		for (int i = 1; i < ciudades.length; i++) {
			while (ciudades[i].charAt(0) > ciudades[i - 1].charAt(0)) {
				ordenadas = true;
			}
		}
		return ordenadas;
	}

	private static boolean ciudadesRepetidas(String[] ciudades) {

		boolean repetidas = false;
		for (int i = 0; i < ciudades.length; i++) {
			for (int j = i + 1; j < ciudades.length - 1; j++) {
				if (ciudades[i].equals(ciudades[j])) {
					repetidas = true;
					return repetidas;
				} else {
					repetidas = false;
				}
			}
		}
		return repetidas;
	}

	private static String aplanaCadena(String cadena) {

		String cadenaAplanada = cadena.toLowerCase();

		cadenaAplanada = cadenaAplanada.replace("á", "a");
		cadenaAplanada = cadenaAplanada.replace("é", "e");
		cadenaAplanada = cadenaAplanada.replace("í", "i");
		cadenaAplanada = cadenaAplanada.replace("ó", "o");
		cadenaAplanada = cadenaAplanada.replace("ú", "u");
		cadenaAplanada = cadenaAplanada.replace("ü", "u");

		return cadenaAplanada;
	}

}
