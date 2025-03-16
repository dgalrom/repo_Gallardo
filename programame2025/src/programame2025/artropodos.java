package programame2025;

public class artropodos { // Asume fichero llamado artropodos.java

    static java.util.Scanner in;

    public static void casoDePrueba() {
		
			int insectos = in.nextInt();
			int aracnidos = in.nextInt();
			int crustaceos = in.nextInt();
			int escolopendras = in.nextInt();
			int anillosEsc = in.nextInt();

			insectos *= 6;
			aracnidos *= 8;
			crustaceos *= 10;
			escolopendras*=anillosEsc*2;
			int total = insectos+aracnidos+crustaceos+escolopendras;
			System.out.println(total);
			
		}


    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        System.out.println("\n");
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
} // class solution


