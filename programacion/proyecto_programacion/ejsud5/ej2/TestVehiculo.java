package ej2;

import java.util.Scanner;

public class TestVehiculo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Bicicletas bici = new Bicicletas("Orbea", "oiz", "verde");
		int opc = 0;
		do {
			System.out.println("""
					VEHÍCULOS
					=========
					1. Anda con la bicicleta
					2. Haz el caballito con la bicicleta
					3. Anda con el coche
					4. Quema rueda con el coche
					5. Ver kilometraje de la bicicleta
					6. Ver kilometraje del coche
					7. Ver kilometraje total
					8. Salir
					Elige una opción (1-8):
					""");
			opc = scan.nextInt();
			switch (opc) {
			case 1:
				System.out.println("Qué distancia andas con la bicicleta?");
				bici.andar(scan.nextDouble());
				break;
			case 2:
				System.out.println("Quemando rueda");
				break;
			case 3:
				System.out.println("Qué distancia andas con el coche?");
				Coche.andar(scan.nextDouble());
				break;
			case 4:
				System.out.println("Quemando rueda...");
				break;
			case 5:
				System.out.printf("Has recorrido %.2f kilómetros con la bicicleta %s\n", bici.getKilometrosRecorridos(),
						bici);
				break;
			case 6:
				System.out.printf("Has recorrido %.2f kilómetros con el coche %s\n", Coche.getKilometrosRecorridos(),
						bici);
				break;
			case 7:
				System.out.printf("Has recorrido %.2f kilómetros totales %s\n", bici.getKilometrosRecorridos(),
						bici);
				break;

			default:
				break;
			}
		} while (opc != 8);
		scan.close();
	}

}