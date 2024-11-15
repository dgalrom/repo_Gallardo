package com.diegoGallardotarea2;

import java.util.Scanner;

public class hastaCero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int suma = 0;
		int contador = 0;
		int mayor = 1;
		int n;
		int menor = Integer.MAX_VALUE;
		
		
		do {
			System.out.println("Introduzca un numero");
			n = scan.nextInt();
			
			if (n > 0) {
				suma+=n;
				contador++;
				
				
				if(n>mayor) {
					mayor=n;
					
					if(n<menor) {
						menor=n;
					}
				}
			}
			}while(n!=0);
		
		if(n==0) {
		int media = suma/contador;
		System.out.println("El mayor numero es "+mayor);
		System.out.println("El menor numero es "+menor);
		System.out.println("La media aritemetica es "+ media);
		System.out.println("La suma es "+suma);

		}
	}

}
