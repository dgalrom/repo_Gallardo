package com.diegoGallardo;

public class UsoDeObjetos {

	public static void main(String[] args) {
		int num=1729;
		int dig = 1;
		int dig1 = 2;
		int num1 = 5;
		double dinero = 142.53;
		int fecha = 10/10/2006;
		
		//UtilidadesMatematicas
		System.out.println("posicionDeDigito es "+ UtilidadesMatematicas.posicionDeDigito(num, dig));
		System.out.println("trozoDeNumero es "+ UtilidadesMatematicas.trozoDeNumero(dig, dig1, num));
		System.out.println("juntaNumeros es "+ UtilidadesMatematicas.juntaNumeros(dig, dig1));
		System.out.println("factorial es "+ UtilidadesMatematicas.factorial(num1));
		System.out.println("El cambio exacto es "+ UtilidadesMatematicas.cambioExacto(dinero));
	
	}
}
