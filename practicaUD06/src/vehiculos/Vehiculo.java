package vehiculos;

public abstract class Vehiculo implements Comparable<Vehiculo> {
	
	//interfaz comparable
    private static int vehiculosCreados = 0;
    private static double kilometrosTotales = 0d;

    private final String matricula; //adicion de matricula
    private double kilometrosRecorridos = 0d;

    //constructor que recibe la matrícula

    public Vehiculo(String matricula) {
        if (matricula == null) {
            throw new IllegalArgumentException("La matrícula es obligatoria");
        } else {
        this.matricula = matricula.trim();
        vehiculosCreados++;
        }
    }

    public Double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(Double kms) {
        double antes = this.kilometrosRecorridos;
        this.kilometrosRecorridos = kms;
        kilometrosTotales += (kms - antes);
    }

    public void andar(double kms) {
        this.kilometrosRecorridos += kms;
        kilometrosTotales += kms;
    }

    public String getMatricula() { return matricula; }
    public static int getVehiculosCreados() {
    	return vehiculosCreados; 
    	}
    
    public static double getKilometrosTotales() { 
    	return kilometrosTotales; 
    	}

    @Override 
    public int compareTo(Vehiculo v) {
        return this.matricula.compareToIgnoreCase(v.matricula);
    }

    //la igualdad se basa solo en la matricula
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehiculo)) return false;
        return matricula.equalsIgnoreCase(((Vehiculo) o).matricula);
    }

    @Override
    public int hashCode() {
        return matricula.toUpperCase().hashCode();
    }

    @Override
    public String toString() {
        return "Vehículo " + matricula + " = " + kilometrosRecorridos + "km";
    }
}

