package ud2.ud2_boletin_ejercicios;

import java.util.Scanner;

public class ej12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Este programa calcula el número de cifras de un número int");
		System.out.println("Introduce un numero entero: ");
		int num = teclado.nextInt();
		teclado.close();
		int numAct = num;
		int numCif = 1;
		while (numAct/10 != 0) {
			numCif++;
			numAct = numAct/10;
		}
	System.out.println(numCif);
	}

}
