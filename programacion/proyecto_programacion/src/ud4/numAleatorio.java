package ud4;

public class numAleatorio {

	public static void main(String[] args) {
		
		int[] numeros = new int [100];
		int posPrim = 0;
		
		for(int i = 0 ; i < numeros.length ; i++) {
			
			int numAl = (int) (Math.random()*101);
			
			
			if(numAl%2 == 0) {
				numeros[posPrim] = numAl;
				posPrim++;
			} else {
				numeros[i] = numAl;
			}
		
		}


		
		for(int i = 0 ; i < numeros.length ; i++) {
			System.out.println(numeros[i]);
		}
}
}
