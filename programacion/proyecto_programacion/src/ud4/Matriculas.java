package ud4;

import java.util.Scanner;

public class Matriculas {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca la matrícula");
		String input = scan.nextLine();
		String numeroString = input.substring(0,4)
		char[] letras = {'B','C'};
		String matricula = input.trim();
		int numero = Integer.parseInt(numeroString);
	}

	private static String rellenarConCeros(int numero) {
		
		String numFormat;
		
		if((numero/1000)>=1) {
			
			numFormat = parse(numero);
			
		} else if((numero/100)>1) {
			
			numFormat = "0"+numero;
			
		} else if((numero/100)>1) {
			
			numFormat = "00"+numero;
			
		} else if((numero/10)>1) {
			
			numFormat = "000"+numero;
			
		}

}
