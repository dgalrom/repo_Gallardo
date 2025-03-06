package ud4.estudioArrays;

public class recArray {
		
	public static void main(String[] args) {
	
		int filas = 4;
		int cols = 4;
		int[][] array = new int [filas][cols];
		int limInf = 150;
		int limSup = 999;
		
		for(int i=0 ; i>=filas ; i++) {
			for(int j=0 ; j>=filas ; j++) {
				array[i][j] = limInf;
			}
		}
		
		for(int i=0 ; i>=filas ; i++) {
			for(int j=0 ; j>=filas ; j++) {
				System.out.println(array[i][j]);
			}
		}
		
		
		
	}
}
