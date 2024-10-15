package ud2.ud2_boletin_ejercicios;

import java.util.Scanner;

public class ej8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("A continuación, introduzca tres numeros enteros");
		System.out.println("Se devolverá el mayor");
		System.out.println("Introduzca el primer número");
		int n1 = scan.nextInt();
		System.out.println("Introduzca el segundo número");
		int n2 = scan.nextInt();
		System.out.println("Introduzca el tercer número");
		int n3 = scan.nextInt();
		scan.close();
		if (n1 == n2 || n1 == n3 || n2 == n3) {
			System.err.println("Debes introducir numeros distintos");
		}

			//Operaciones
		int menor = 0;
		int mediano = 0;
		int mayor = 0;
		
		if (n1>n2) {
			mayor = n1;
			menor = n2;
			mediano = n3;
			if (mayor < n3) {
				mediano = n1;
				mayor = n3;
				menor = n2;
			}
		}else if(menor > n3){
				menor = n3;
				mediano = n1;
				mayor = n2;
				
				}
		else if (mediano < n3){
			mayor = n2;
			mediano = n1;
			menor = n3;
		}else {
				mayor = n2;
				mediano = n1;
				menor = n3;
		}
		System.out.println("El mayor numero es: " + mayor);
		System.out.println("El numero mediano es: " + mediano);
		System.out.println("El menor numero es: " + menor);				
	
		}
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
	
	if (n1 > n2 > n3) {
		mayor = n1;
		medio = n2;
		menor = n3;
		
		if (n2 > n1 > n3) {
			mayor = n2;
			medio
		}
	}else {
		mayor = n2;
		if (mayor< n3) {
			mayor = n3;
			
		}
	}
}
}
