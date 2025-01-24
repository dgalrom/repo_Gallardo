package examenPractica;

import java.util.Scanner;

public class claseAyuda {

	    static Scanner in;

	    public static void main(String[] args) {
	        in = new Scanner(System.in);
	        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
	        mostrarArray(array);
	        leerDiagonalPrincipal(array);
	        leerDiagonalSecundaria(array);
	        in.close();
	    }

	    public static void mostrarArray(int[][] array) {
	        for (int[] fila : array) {
	            for (int elemento : fila) {
	                System.out.print(elemento + "\t");
	            }
	            System.out.println();
	        }
	    }

	    public static void leerDiagonalPrincipal(int[][] array) {
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i][i] + "\t");
	        }
	        System.out.println();
	    }

	    public static void leerDiagonalSecundaria(int[][] array) {
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i][array.length - 1 - i] + "\t");
	        }
	        System.out.println();
	    }

	    public static void ordenarBurbuja(Integer[] array) {
	        boolean intercambio = true;
	        int elementosPorRecorrer = array.length - 1;
	        while (intercambio) {
	            intercambio = false;
	            for (int i = 0; i < elementosPorRecorrer; i++) {
	                if (array[i] > array[i + 1]) {
	                    int aux = array[i];
	                    array[i] = array[i + 1];
	                    array[i + 1] = aux;
	                    intercambio = true;
	                }
	            }
	            elementosPorRecorrer--;
	        }
	    }

	    public static void ordenarInsercion(Integer[] array) {
	        for (int i = 1; i < array.length; i++) {
	            int k = array[i];
	            int j = i - 1;
	            while (j >= 0 && array[j] > k) {
	                array[j + 1] = array[j];
	                j--;
	            }
	            array[j + 1] = k;
	        }
	    }

	    public static boolean estanEncadenadas(String palabras) {
	        boolean encadenadas = true;
	        String[] palabrasArray = palabras.split(" ");
	        for (int i = 0; i < palabrasArray.length - 1; i++) {
	            if (!palabrasArray[i].endsWith(palabrasArray[i + 1].substring(0, 2))) {
	                encadenadas = false;
	            }
	        }
	        return encadenadas;
	    }
	}