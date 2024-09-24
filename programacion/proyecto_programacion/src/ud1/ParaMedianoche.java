package ud1;

import java.util.Scanner;

/*
 * Escribe un programa que dada  una hora determinada (horas y minutos),
 * calcule los segundos que faltan para llegar a la medianoche.
 */

public class ParaMedianoche {

	public static void main(String[] args) {
		
		//Explicacion
		
		System.out.println("""
				Calculadora para medianoche""");
		
		//Declaracion herramienta Scanner
		Scanner scan = new Scanner(System.in);
		
		//Analisis input
		System.out.print("Introduzca la hora: ");
		int hora = scan.nextInt();
		System.out.print("Introduzca los minutos: ");
		int min = scan.nextInt();
		
		//Calculo
		int horaEnMinutos = hora*60  ;
		int totalinput = (horaEnMinutos + min)*60 ;
		int resultado = 86400 - totalinput  ;
		
		//Mostrar resultado
		
		System.out.println("Quedan "+ resultado +" segundos para medianoche");
	}

}
