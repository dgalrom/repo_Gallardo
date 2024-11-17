package com.diegoGallardo;

public class UtilidadesMatematicas {
	
	public static int numCifras(long numero) {
        int numCifras = 1;
        while (numero / 10 != 0) {
            numCifras++;
            numero = numero / 10;
        }
        return numCifras;
    }
	
	
	public static int posicionDeDigito (long num, int dig) {	
	
	int pos = numCifras(num);
	int cif = 0;
	
	for( int act=(int) num ; cif!=dig ; pos-- ) {
		cif = act%10;
		act = act/10;
	}
	
	return pos;
}
	
	public static int trozoDeNumero (int pInicial, int pFinal, long num, int dig) {	
		
	//Toma como parámetros las posiciones inicial y final dentro
	//de un número y devuelve el trozo correspondiente.
	
	int x = posicionDeDigito(num, dig);
	
	return x;
}
	
	
}














