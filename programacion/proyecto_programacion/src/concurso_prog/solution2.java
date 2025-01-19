package concurso_prog;

import java.util.Scanner;

public class solution2 {

	  static Scanner in;

	  public static boolean casoDePrueba() {

	    if (!in.hasNext())
	      return false;
	    else {
	    	
	      String cadena = in.nextLine();
	      String[] palabras = cadena.split(" ");
	      if(palabras.length == 1) {
	    	  System.out.println("SI");
	      }else {
	    	  boolean ok = true;
	    	  for(int i = 0; i<palabras.length-1 ; i++) {
	    		  String palabra1 = palabras[i].substring(palabras[i].length()-2);
	    		  String palabra2 = palabras[i+1].substring(0, 2);
		    	  if(!palabra1.equals(palabra2)) {
		    		  ok = false;
		    	  }
		      }
	    	  
	    	  if(ok) {
	    		  System.out.println("SI");
	    	  } else {
	    		  System.out.println("NO");
	    	  }
	      }
	      
	      return true;
	    }

	  } // casoDePrueba

	  public static void main(String[] args) {

	    in = new java.util.Scanner(System.in);

	    while(casoDePrueba())
	      ;

	  }

}
