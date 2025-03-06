package ud1.ud1_boletin_ejercicios;

import java.util.Scanner;

public class ej8 {

	public static void main(String[] args) {
		/**
		 * Dados tres numeros, se devolverán ordenados
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dados tres numeros, se le devolverán ordenados");
		System.out.println("Introduzca el primer número");
		int n1 = scan.nextInt();
		System.out.println("Introduzca el segundo número");
		int n2 = scan.nextInt();
		System.out.println("Introduzca el tercer número");
		int n3 = scan.nextInt();
		
		//Operaciones
		int mayor;
		int medio;
		int menor;
		
		//if (n1 > n2 > n3) {
			mayor = n1;
			medio = n2;
			menor = n3;
			
	//		if (n2 > n1 > n3) {
				mayor = n2;
		//		medio
			//}
		//}else {
			mayor = n2;
			if (mayor< n3) {
				mayor = n3;
				
			}
		}
	}

//}
