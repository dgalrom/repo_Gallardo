package ud4;

public class charAleatorio {

	public static void main(String[] args) {
		char[] array = new char[20]; 
		char pos = (char) (Math.random()*(101));
		
		for (int i = 0; i < array.length; i++) {
		array[i] = pos;
		}
	
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		
		} 
	}
}

