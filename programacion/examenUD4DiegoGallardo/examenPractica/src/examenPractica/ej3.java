package examenPractica;

public class ej3 {

	public static void main(String[] args) {
		
		
		System.out.println(matriz0a100());
		System.out.println(mostrarMatriz());
		System.out.println(crearMatrizDimMN());
		
	}
		private static int[][] mostrarMatriz() {
			int[][] matriz1 = new int[4][4];
			for(int i = 0 ; i<=(matriz1.length - 1) ; i++ ) {
				System.out.println("\t");
				for(int j = 0 ; j<=(matriz1[0].length - 1); j++ ) {
					System.out.print(matriz1[i][j] + " ");		
				}
			}
				return matriz1;
		}
				private static int[][] matriz0a100() {
					int[][] matriz2 = new int[4][4];
					int num;	
					for(int i = 0 ; i<=(matriz2.length - 1) ; i++ ) {
						for(int j = 0 ; j<=(matriz2.length - 1); j++ ) {
							num = (int) (Math.random()*100);
							matriz2[i][j]=num;
						}
					}
					return matriz2;
				
		}
				
				private static int[][] crearMatrizDimMN() {
					int[][] matriz3 = new int[4][4];
					int num1;
					boolean p=true;
					for(int i = 0 ; i<=(matriz3.length - 1) ; i++ ) {
						for(int j = 0 ; j<=(matriz3[0].length - 1); j++ ) {
							if(p) {
							num1 = (int) ((Math.random()*100)*-1);
							matriz3[i][j]=num1;
							p = false;
							}
							else if(!p) {
								num1 = (int) (Math.random()*100);
								matriz3[i][j]=num1;	
								p = true;
							}
						}
					}
					return matriz3;
				}		
	}