package com.diegoGallardotarea2;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		System.out.println("~~~~~~~~~~~~~~| CALCULADORA |~~~~~~~~~~~~~~\r\n"
				+ "1 - Suma\r\n"
				+ "2 - Resta\r\n"
				+ "3 - Multiplicación\r\n"
				+ "4 – División\r\n"
				+ "5 - Raíz cuadrada\r\n"
				+ "6 – Potencia\r\n"
				+ "0 - Salir del programa\r\n"
				+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		Scanner scan = new Scanner (System.in);
		int opMenu = scan.nextInt();
		

		
		switch (opMenu) {
		case 1: //suma
			System.out.println("Introduzca el primer valor");
			double v1s = scan.nextDouble();
			System.out.println("Introduzca el segundo valor");
			double v2s = scan.nextDouble();
			System.out.println("El resultado es: " + (v1s + v2s));
			break;
			
		case 2: //resta
			System.out.println("Introduzca el primer valor");
			double v1r = scan.nextDouble();
			System.out.println("Introduzca el segundo valor");
			double v2r = scan.nextDouble();
			System.out.println("El resultado es: " + (v1r - v2r));
			break;
			
		case 3: //multiplicacion
			System.out.println("Introduzca el primer valor");
			double v1m = scan.nextDouble();
			System.out.println("Introduzca el segundo valor");
			double v2m = scan.nextDouble();
			System.out.println("El resultado es: " + (v1m * v2m));
			break;
			
		case 4: //division
			System.out.println("Introduzca el primer valor");
			double v1d = scan.nextDouble();
			System.out.println("Introduzca el segundo valor");
			double v2d = scan.nextDouble();
			System.out.println("El resultado es: " + (v1d / v2d));
			break;
			
		case 5: //raiz cuadrada
			System.out.println("Introduzca el primer valor");
			double v1rc = scan.nextDouble();
			System.out.println("Introduzca el segundo valor");
			double v2rc = scan.nextDouble();
			System.out.println("El resultado es: " + (Math.sqrt(v1rc)) + " para el primer valor y " + (Math.sqrt(v2rc) + " para el segundo"));
			break;
			
		case 6: //potencia
			System.out.println("Introduzca el primer valor");
			double v1p = scan.nextDouble();
			System.out.println("Introduzca el segundo valor");
			double v2p = scan.nextDouble();
			System.out.println("El resultado es: " + (Math.pow(v1p, v2p)));
			break;
			
			default: 	
			
				if (opMenu==0) {
				System.out.println("Hasta luego!");
			}else {
					System.out.println("Debes introducir un numero del menu");
				}
			}
		scan.close();
		}
		}
	