package ud2_boletin_ejercicios;

import java.util.Scanner;

public class ej19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Introduzca el numero de inicio");
		int num = scan.nextInt();
		System.out.println("Introduzca el numero de fin");
		int numFin = scan.nextInt();
		System.out.println("Introduzca el numero de incremento");
		int numInc = scan.nextInt();
		scan.close();
		for( int numAct = num ; numAct >= numFin ; numAct-=numInc ) {
			System.out.println(numAct);	
		};
		
	}

}
