package ud4;

import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca 3 numeros");
		int[] array = new int[3]; //15*
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduzca el siguiente");
			int input = scan.nextInt();
			array[i] = input;
			int max = 0;
			if(input >= max) {
				input = max;
			}
			int min = 0;
			if(input <= min) {
				input = min;
			}
		}
	
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		
		} 
		scan.close();
	}
		
}
