package ud4;

import java.util.Scanner;

/**
 * Dada una matriz A su transpuesta AT se obtiene intercambiando las filas por columnas y las columnas por filas. 
 * Por ejemplo, si tenemos la matriz A de 2 filas y 4 columnas:
 * 1  2  3  4
 * 5  6  7  8
 * Su matriz transpuesta AT es una matriz de 4 filas y 2 columnas con este contenido: 
 *   1  5
 *   2  6
 *   3  7
 *   4  8
 *   La primera fila de A se convierte en la primera columna de la matriz transpuesta y la segunda fila de A se convierte en la segunda columna de la matriz transpuesta.
 *   Si la dimensión de la matriz A es 2 x 3 (2 filas y 3 columnas) la dimensión de su matriz transpuesta será 3 x 2 (3 filas y 2 columnas).
 *   Es decir, si la matriz A se ha creado de tamaño A[filas][columnas] su matriz transpuesta se debe crear de tamaño AT[columnas][filas]

 */


public class traspMatriz {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Valores para la transpuesta");
		System.out.println("Número filas");
		int filas = scan.nextInt();
		System.out.println("Número columnas");
		int cols = scan.nextInt();
		int[][] matriz = new int[filas][cols];
		System.out.println("Matriz inicial");
		mostrarMatriz(matriz, filas, cols);
		int[][]matrizT = obtenerMatrizTranspuesta(matriz, filas, cols);
		System.out.println();
		mostrarMatriz(matriz, filas, cols);
	}

	private static int[][] obtenerMatrizTranspuesta(int[][] matriz, int filas, int cols) {
		
		
		
		return null;
	}

	private static void mostrarMatriz(int[][] matriz, int filas, int cols) {
		
		for(int i = 0; i<filas ; i++) {
			System.out.println(matriz[filas][cols]);
			for(int ii = 0 ; ii<cols ; ii++) {
				System.out.println(matriz[filas][cols]);
					}
				}
			
		}

}
