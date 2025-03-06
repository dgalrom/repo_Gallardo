package ud5;

public class bombilla {

	private float potencia;
	
	private float precio;
	
	private String marca;
	
	private boolean estado;

	public bombilla(String marca, float potencia, float precio, boolean estado) {
		this.marca = marca;
		this.potencia = potencia;
		this.precio = precio;
		this.estado = false;
	}
	
	
	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public void encender() {
		
	}
	
	public void apagar() {
		
	}
	
	public String toString() {
		StringBuilder sbd = new StringBuildeer();
		sbd.append("Bombilla:\n").append("marca")
	}
	
}
