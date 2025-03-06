package ud2;

import java.util.Scanner;

public class RepeticionSimbolos {

	public static void main(String[] args) {
		
		//Scanner, instrucciones, recoleccion de datos
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca uno de los siguientes simbolos: +, *, $, €");
		String simbolo = scan.nextLine();
		System.out.println("Introduzca el numero de veces que quiere que se repita");
		int repeticionesObj = scan.nextInt();
		
		for ( int repeticionesAct = 0  ; repeticionesAct<repeticionesObj  ; repeticionesAct++) {
			
			System.out.println(simbolo);
	}

}
}