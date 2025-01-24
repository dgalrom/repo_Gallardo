package examenPractica;

import java.util.Scanner;

public class ej1 {

   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       System.out.print("Introduce un texto: ");
       String texto = scan.nextLine().toLowerCase();

       if (esPangrama(texto)) {
           System.out.println("Es un pangrama.");
       } else {
           System.out.println("No es un pangrama.");
           System.out.println("Faltan las siguientes letras: " + letrasFaltantes(texto));
       }
   }

   private static boolean esPangrama(String texto) {
       boolean[] letrasPresentes = new boolean[26];

       for (int i = 0; i < texto.length(); i++) {
           char c = texto.charAt(i);
           int posicion = c - 'a';
           if (posicion >= 0 && posicion < 26) {
               letrasPresentes[posicion] = true;
           }
       }

       for (boolean letraPresente : letrasPresentes) {
           if (!letraPresente) {
               return false;
           }
       }
       return true;
   }

   private static String letrasFaltantes(String texto) {
	    String abecedario = "abcdefghijklmnñopqrstuvwxyz";
	    StringBuilder sbd = new StringBuilder();
	    boolean[] letrasEnTexto = new boolean[27];

	    for (int i = 0; i < texto.length(); i++) {
	        char letra = texto.charAt(i);
	        int indice = letra - 'a';
	        if (indice >= 0 && indice < 27) {
	            letrasEnTexto[indice] = true;
	        }
	    }

	    for (int i = 0; i < abecedario.length(); i++) {
	        if (!letrasEnTexto[i]) {
	            sbd.append(abecedario.charAt(i)).append(" ");
	        }
	    }

	    return sbd.toString();
	}
}