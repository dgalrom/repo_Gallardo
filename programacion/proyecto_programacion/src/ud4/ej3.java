package ud4;


public class ej3 {

	public static void main(String[] args) {
	
		int[] arrnum = new int[20];
		int[] arrcuad = new int [20];
		int[] arrcub = new int [20];
		
	for(int i=0; i < 20; i++) {
		
		int numero = (int) (Math.random()*(10+1));
		int cuadrado = (int) Math.pow(numero, 2);
		int cubo = (int) Math.pow(numero, 3);
		
		arrnum[i] = numero ;
		arrcuad[i] = cuadrado ;
		arrcub[i] = cubo ;
	
	}
	
		for(int i = 0; i < arrnum.length; i++) {
			System.out.println(arrnum[i] + ", " + arrcuad[i] + "," + arrcub[i] );
			
		}
	}

}
