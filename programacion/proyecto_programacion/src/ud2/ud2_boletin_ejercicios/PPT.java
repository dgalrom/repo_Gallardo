package ud2.ud2_boletin_ejercicios;

import java.util.Scanner;

public class PPT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Piedra papel o tijera. Participan jugador contra la máquina.");
		System.out.println("""
				Siendo las opciones:
				Piedra
				Papel
				Tijeras
				""");
		/**
		 * 0 - Piedra
		 * 1 - Papel
		 * 2 - Tijeras
		 */
		
		int opcionM = (int)(Math.random()*3);
		
		System.out.println("Jugador, introduzca una opción: ");
		System.out.print("J: ");
		String opcionJ = scan.nextLine();
		opcionJ = opcionJ.toLowerCase();
		final String PIE = "piedra";
		final String PAP = "papel";
		final String TIJ = "tijeras";

		switch (opcionJ) {
		case PIE:
			if (opcionM == 0) {
				System.out.println("M: piedra");
				System.out.println("Empate");
			}
			else if (opcionM == 1) {
			System.out.println("M: papel");
			System.out.println("Perdiste!");
			
		}
			else if (opcionM == 2) {
				System.out.println("M: tijeras");
				System.out.println("Ganaste!");
				
			} break;
		case PAP:
			if (opcionM == 0) {
				System.out.println("M: piedra");
				System.out.println("Ganaste!");
			}
			else if (opcionM == 1) {
				System.out.println("M: papel");
				System.out.println("Empate");
				
			}
			else if (opcionM == 2) {
				System.out.println("M: tijeras");
				System.out.println("Perdiste!");
				
			} break;
		case TIJ:
			if (opcionM == 0) {
				System.out.println("M: piedra");
				System.out.println("Perdiste!");
			}
			else if (opcionM == 1) {
				System.out.println("M: papel");
				System.out.println("Ganaste!");
				
			}
			else if (opcionM == 2) {
				System.out.println("M: tijeras");
				System.out.println("Empate!");
				
			} break;
		
			}
					 
		}

	}