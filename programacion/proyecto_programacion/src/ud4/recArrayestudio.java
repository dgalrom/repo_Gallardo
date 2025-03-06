package ud4;

public class recArrayestudio {
			
		public static void main(String[] args) {
		
			int filas = 4;
			int cols = 4;
			int[][] array = new int [filas][cols];
			int limInf = 150;
			int limSup = 999;
			
			for(int i=0 ; i<filas ; i++) {
				for(int j=0 ; j<cols ; j++) {
					int random = (int) (Math.random()*limInf + Math.random()*limSup);
					array[i][j] = random;
				}
			}
			
			for(int i=filas-1 ; i>=0 ; i--) {
				for(int j=cols-1 ; j>=0 ; j--) {
					System.out.print(array[i][j] + "\t");
				}
				System.out.println(" ");
			}
			
			
			
		}
	}
