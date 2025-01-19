package ud4;

		/**
		 * Crear un cuadrado latino en Java
		 * 
		 * Un cuadrado latino de orden N es una matriz cuadrada de N filas y N columnas
		 * en la que su primera fila contiene los N primeros números naturales y cada
		 * una de las filas siguientes contiene la rotación de la fila anterior un lugar
		 * a la derecha.
		 * 
		 * Por ejemplo, un cuadrado latino de orden 4 es una matriz cuadrada de tamaño 4
		 * x 4 con el siguiente contenido:
		 *
		 * 
		 * 1 2 3 4
		 * 4 1 2 3
		 * 3 4 1 2
		 * 2 3 4 1
		 */
			
			public class cuadradolatino {

			public static void main(String[] args) {
				
				int[][] cuadrado = new int[4][4];
		        
		        for (int j = 0; j < 4; j++) {
		            cuadrado[0][j] = j + 1;
		        }
		        
		        for (int i = 1; i < 4; i++) {
		            for (int j = 0; j < 4; j++) {
		                int posAnterior = (j == 0) ? 4 - 1 : j - 1;
		                cuadrado[i][j] = cuadrado[i-1][posAnterior];
		            }
		        }
				
			}

		}