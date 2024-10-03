package ud2;

import java.util.Scanner;

public class RepeticionSimbolos {

	public static void main(String[] args) {
		
		//Scanner, instrucciones, recoleccion de datos
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca uno de los siguientes simbolos: +, *, $, €");
		String simbolo = scan.nextLine();
		System.out.println("Introduzca el numero de veces que quiere que se repita");
		int numero = scan.nextInt();
		
		for (condicion ;  ; simbolo++) {
			
			System.out.println(simbolo);
	}

}
