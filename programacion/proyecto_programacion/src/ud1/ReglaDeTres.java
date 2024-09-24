package ud1;

import java.util.Scanner;

public class ReglaDeTres {

	public static void main(String[] args) {
		
		//sol x = (b*c)/a
		
		System.out.println("""
				*REGLA DE TRES*
				a ---> b
				c ---> x
				""");

		
		//Declaracion herramienta Scanner
		Scanner scan = new Scanner(System.in);
		
		//Analisis input
		System.out.print("Introduzca valor A: ");
		double a = scan.nextDouble();
		System.out.print("Introduzca valor B: ");
		double b = scan.nextDouble();
		System.out.print("Introduzca valor C: ");
		double c = scan.nextDouble();
		
		//Resolucion
		double x = (b*c)/a;
		
		System.out.println("Dados los parametros, la solucion es:");
		System.out.println(x);

	}

}
