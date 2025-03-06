package ud4;

public class caracteresAZ {
	
	public static void main(String[] args) {
		
		int dim = 1 + 'Z' - 'A';
		char[] caracteres = new char[dim];
		char charAct = 'A';
		
		for (int index = 0; index < caracteres.length; index++) {
			caracteres[index] = charAct++;

		}
	
		for(int i = 0; i < caracteres.length; i++) {
			System.out.println(caracteres[i]);
		
		}
		
	}

}
