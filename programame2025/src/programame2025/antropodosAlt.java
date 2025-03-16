package programame2025;

import java.util.Scanner;

public class antropodosAlt {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int pruebas = scan.nextInt();
        int pruebasAct = 0;
        
        while(pruebasAct < pruebas) {
            int insectos = scan.nextInt();
            int aracnidos = scan.nextInt();
            int crustaceos = scan.nextInt();
            int escolopendras = scan.nextInt();
            int anillosEsc = scan.nextInt();
            
            insectos *= 6;
            aracnidos *= 8;
            crustaceos *= 10;
            escolopendras *= anillosEsc * 2;
            
            int total = insectos + aracnidos + crustaceos + escolopendras;
            
            System.out.println(total);
            
            pruebasAct++;
        }
    }
}