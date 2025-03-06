package ud5;

public class Punto {
	
	//Atributos
	
	private int X;
	
	private int Y;
	
	private double punto;
	
	//Constructores
	
	public Punto(double cords) {
		
	}

	//Getters y Setters
	
	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}


	public double getPunto() {
		return punto;
	}


	public void setPunto(double punto) {
		this.punto = punto;
	}


	//Metodos
	
	public void desplazar(int X,int Y) {

	}
	
	public void obtenerInverso() {
		
		if(Y>=0 && X<=0) {
			//Primer cuadrante
			
			int xInverso = -(this.X);
			int yInverso = -(this.Y);
			
		}else if(Y<0 && X<=0){
			//Segundo cuadrante
			
			int xInverso = (this.X);
			int yInverso = -(this.Y);
			
		}else if(Y<=0 && X>=0) {
			//Tercer cuadrante
			int xInverso = (this.X);
			
			
			
		}else if(Y<=0 && X<=0) {
			//Cuarto cuadrante
			
			
		}
		
	}
	
	public double calcularAreaConEjes() {
		
		int area= this.X*this.Y;
		
		return area;
	}
	
	public double calcularPerimetroCuadrantes() {
		
		int perimetro = 0;
		
		
		
		return perimetro;
	}
	
}
