package programame2025;

import java.util.Scanner;

public class antropodos {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int pruebas = scan.nextInt();
		int pruebasAct = 0;
		
		while(pruebasAct < pruebas) {
		
			int insectos = scan.nextInt();
			int aracnidos = scan.nextInt();
			int crustaceos = scan.nextInt();
			int escolopendras = scan.nextInt();
			int anillosEsc = scan.nextInt();

			insectos *= 6;
			aracnidos *= 8;
			crustaceos *= 10;
			escolopendras*=anillosEsc*2;
			System.out.println("\n");
			int total = insectos+aracnidos+crustaceos+escolopendras;
			
			if(total<=1000000) {
				System.out.println(total);
			} else {
				System.out.println("El total de patas excede el millón");
			}
			pruebasAct++;	
		}
		scan.close();
	}
}
