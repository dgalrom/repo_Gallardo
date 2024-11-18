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
	
	return pos+1;
}
	
	public static int trozoDeNumero (int dig, int dig1, long num) {	
		
	//Toma como parámetros las posiciones inicial y final dentro
	//de un número y devuelve el trozo correspondiente.
	
	 int pos = 1;
	 int fin = 0;
	 int numi = (int) num;
	 int trozo = 0;

	 while (fin != dig) {
	 
	 fin = numi % 10;
	 numi = numi / 10;
	 
	 }

	 while (fin != dig1) {
	    
	 trozo += fin * pos;
	 pos *= 10;
	 fin = numi % 10;
	 numi = numi / 10;
	 
	 }

	 trozo += fin * pos;

	 return trozo;
	}
	
}
	














