package com.diegoGallardo;

public class UsoDeObjetos {

	public static void main(String[] args) {
		long num=1720;
		int dig = 7;
		int dig1 = 0;
		System.out.println("posicionDeDigito es "+ UtilidadesMatematicas.posicionDeDigito(num, dig));
		System.out.println("trozoDeNumero es "+ UtilidadesMatematicas.trozoDeNumero(dig, dig1, num));
	}
}
