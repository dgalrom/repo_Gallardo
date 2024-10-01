package ud2;
import java.util.Scanner;
public class MayorNumeroDeTres {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Indicaciones y recolección de datos
		
System.out.println("A continuación, introduzca tres numeros enteros");
System.out.println("Se devolverá el mayor");
System.out.println("Introduzca el primer número");
int prinum = scan.nextInt();
System.out.println("Introduzca el segundo número");
int segnum = scan.nextInt();
System.out.println("Introduzca el tercer número");
int ternum = scan.nextInt();
scan.close();

	//Operaciones
int mayor;
if (prinum>segnum) {
	mayor = prinum;
	if (mayor <= ternum) {
		mayor = ternum;
	}
}else {
	mayor = segnum;
	if (mayor< ternum) {
		mayor = ternum;
		
	}
}

System.out.println(mayor);

	}

}
