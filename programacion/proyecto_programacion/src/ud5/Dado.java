package ud5;

public class Dado{
	// Atributos
	private Short caras;
	private static Long numLanzamientosTotales = 0l;
	private Long numLanzamientos;
	private Short[] ultimosLanzamientos;
	private Long[][] estadisticas;
	public Short getCaras() {
		return caras;
	}
	public void setCaras(Short caras) {
		this.caras = caras;
	}
	public Long getNumLanzamientos() {
		return numLanzamientos;
	}
	public Short[] getUltimosLanzamientos() {
		return ultimosLanzamientos;
	}
	public Long[][] getEstadisticas() {
		return estadisticas;
	}

	//Constructores
	
	public Dado(Short caras) {
		this.caras = caras;
		this.numLanzamientos = 0;
		Short aleatorio = (short) (Math.random()*10);
		numLanzamientos++;
		
		return aleatorio;
	}
	
	
	
}