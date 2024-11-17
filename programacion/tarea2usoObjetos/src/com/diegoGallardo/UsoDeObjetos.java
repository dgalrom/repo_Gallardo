package com.diegoGallardo;

public class UsoDeObjetos {

	public static void main(String[] args) {
		long num=1020;
		int dig=2;
		int pInicial=1;
		int pFinal=2;
		System.out.println("posicionDeDigito es "+ UtilidadesMatematicas.posicionDeDigito(num, dig));
		System.out.println("trozoDeNumero es "+ UtilidadesMatematicas.trozoDeNumero(num, pInicial, pFinal));
	}
}
