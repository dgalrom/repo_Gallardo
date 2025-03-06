package concurso_prog;

import java.util.Scanner;

public class solution {

	  static Scanner in;

	  public static boolean casoDePrueba() {
		  int num1 = 1;
		  int num2 = 1;
		  int suma = 0;
		do {
			num1 = in.nextInt();
			num2 = in.nextInt();
			  if (num1 < 0 || num2 < 0)
			      return false;
			    else {
			      suma = (num1*2) + (num2*2);
			      System.out.println(suma);
			      return true;
			    }
		} while (num1 > 0 && num2 > 0);
	  } // casoDePrueba

	  public static void main(String[] args) {

	    in = new java.util.Scanner(System.in);

	    while(casoDePrueba())
	      ;

	  }
}
