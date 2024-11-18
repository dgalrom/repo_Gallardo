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
	
	
	public static int posicionDeDigito (int num, int dig) {	
	
	int pos = numCifras(num);
	int cif = 0;
	
	for( int act=(int) num ; cif!=dig ; pos-- ) {
		cif = act%10;
		act = act/10;
	}
	
	return pos+1;
}
	
	public static int trozoDeNumero (int dig, int dig1, int num) {	
		
    //No funciona correctamente. Mal formulado.

        int resultado = 0;
        int digito;
        int posicion = 0;
        int numeroTemporal = num;
        
        while (numeroTemporal > 0) {
            numeroTemporal = numeroTemporal / 10;
            posicion++;
        }
        
        if (dig <= 0 || dig1 <= 0 || dig > posicion || dig1 > posicion || dig > dig1) {
            System.out.println(-1);
            
        }
        
        while (num > 0) {
            digito = num % 10;
            
            if (posicion >= dig && posicion <= dig1) {
                resultado = resultado * 10 + digito;
            }
            
            num = num / 10;
            posicion--;
        }
        
        
        return resultado;
      
    }

	public static int juntaNumeros (int dig, int dig1) {	
	
	    int numDigitosDig1 = 0;
	    int tempDig1 = dig1;

	    while (tempDig1 != 0) {
	        numDigitosDig1++;
	        tempDig1 /= 10;
	    }
	    
	    int resultado = dig * (int) Math.pow(10, numDigitosDig1) + dig1;
	    
	    return resultado;
	}
	
	public static int factorial (int num1) {

	    int resultado = 1;
	    
	    for (int i = 1; i <= num1; i++) {
	        resultado *= i;
	    }
	    
	    return resultado;	
	
	}
	
	public static String cambioExacto (double dinero) {
    
	    String resultado = "";
	    int cantidadEnCentimos = (int) (dinero * 100);
	    
	    int billetes100 = cantidadEnCentimos / 10000;
	    cantidadEnCentimos = cantidadEnCentimos % 10000;
	    
	    int billetes50 = cantidadEnCentimos / 5000;
	    cantidadEnCentimos = cantidadEnCentimos % 5000;
	    
	    int billetes20 = cantidadEnCentimos / 2000;
	    cantidadEnCentimos = cantidadEnCentimos % 2000;
	    
	    int billetes10 = cantidadEnCentimos / 1000;
	    cantidadEnCentimos = cantidadEnCentimos % 1000;
	    
	    int billetes5 = cantidadEnCentimos / 500;
	    cantidadEnCentimos = cantidadEnCentimos % 500;
	    
	    int monedas2 = cantidadEnCentimos / 200;
	    cantidadEnCentimos = cantidadEnCentimos % 200;
	    
	    int monedas1 = cantidadEnCentimos / 100;
	    cantidadEnCentimos = cantidadEnCentimos % 100;
	    
	    int monedas50 = cantidadEnCentimos / 50;
	    cantidadEnCentimos = cantidadEnCentimos % 50;
	    
	    int monedas20 = cantidadEnCentimos / 20;
	    cantidadEnCentimos = cantidadEnCentimos % 20;
	    
	    int monedas10 = cantidadEnCentimos / 10;
	    cantidadEnCentimos = cantidadEnCentimos % 10;
	    
	    int monedas5 = cantidadEnCentimos / 5;
	    cantidadEnCentimos = cantidadEnCentimos % 5;
	    
	    int monedas2c = cantidadEnCentimos / 2;
	    cantidadEnCentimos = cantidadEnCentimos % 2;
	    
	    int monedas1c = cantidadEnCentimos / 1;

	    if (billetes100 > 0) {
	        resultado = resultado + billetes100 + " billetes de 100 €\n";
	    }
	    if (billetes50 > 0) {
	        resultado = resultado + billetes50 + " billetes de 50 €\n";
	    }
	    if (billetes20 > 0) {
	        resultado = resultado + billetes20 + " billetes de 20 €\n";
	    }
	    if (billetes10 > 0) {
	        resultado = resultado + billetes10 + " billetes de 10 €\n";
	    }
	    if (billetes5 > 0) {
	        resultado = resultado + billetes5 + " billetes de 5 €\n";
	    }
	    if (monedas2 > 0) {
	        resultado = resultado + monedas2 + " monedas de 2 €\n";
	    }
	    if (monedas1 > 0) {
	        resultado = resultado + monedas1 + " monedas de 1 €\n";
	    }
	    if (monedas50 > 0) {
	        resultado = resultado + monedas50 + " monedas de 50 céntimos\n";
	    }
	    if (monedas20 > 0) {
	        resultado = resultado + monedas20 + " monedas de 20 céntimos\n";
	    }
	    if (monedas10 > 0) {
	        resultado = resultado + monedas10 + " monedas de 10 céntimos\n";
	    }
	    if (monedas5 > 0) {
	        resultado = resultado + monedas5 + " monedas de 5 céntimos\n";
	    }
	    if (monedas2c > 0) {
	        resultado = resultado + monedas2c + " monedas de 2 céntimos\n";
	    }
	    if (monedas1c > 0) {
	        resultado = resultado + monedas1c + " monedas de 1 céntimo\n";
	    }

    return resultado;
}
	
}
	
	
	
	














