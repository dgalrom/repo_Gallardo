package vehiculos;

public class Bicicleta extends Vehiculo {

    private String marca;  
    private String modelo;  
    private String color;   

    public Bicicleta(String matricula, String marca, String modelo, String color) {
        super(matricula); //constructor actualizado
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    //getters y setters
    public String getMarca() { 
    	return marca; 
    	}
    
    public void setMarca(String marca) { 
    	this.marca = marca; 
    	}

    public String getModelo() { 
    	return modelo; 
    	}
    
    public void setModelo(String modelo) {
    	this.modelo = modelo; 
    	}

    public String getColor() { 
    	return color; 
    	}
    
    public void setColor(String color) {
    	this.color = color; 
    	}

    @Override
    public String toString() {
        return String.format("%s %s (%s) - %s", marca, modelo, color, getMatricula());
    }
}