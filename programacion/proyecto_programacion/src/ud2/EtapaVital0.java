package ud2;

import java.util.Scanner;

public class EtapaVital0 {

	public static void main(String[] args) {
		
//Herramienta Scanner
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduza su año de nacimiento");
		
//Calculo de edad segun el año
		int nacimiento = scan.nextInt();
		int edad = 2024 - nacimiento ;
		System.out.println(edad);
		scan.close();
		
		if (edad<0) {
		
			System.err.println("Error");
		} else {
		}
			if (edad<2) {
				System.out.println("Bebé");
	
			} else if (edad<11) {
				
				  {
					
					System.out.println("Niño");
				
				  } else if {{
					 
				}		System.out.println("Adulto");
					}
				}
	}
