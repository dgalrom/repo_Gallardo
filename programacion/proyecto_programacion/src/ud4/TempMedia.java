package ud4;

public class TempMedia {

	public static void main(String[] args) {
		
		float[] temperaturas = new float [12];
		
		for(int i = 0 ; i < temperaturas.length ; i++) {
			
			float tempE = (float) ((Math.random()*101)-60);
			
			temperaturas[i] = tempE;
		}

		for(int i = 0 ; i < temperaturas.length ; i++) {
			System.out.println("Enero: "+temperaturas[i]);
			System.out.println("Febrero: "+temperaturas[2]);
			}
		
	}

}
