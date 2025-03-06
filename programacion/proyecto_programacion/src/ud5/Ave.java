package ud5;

public abstract class Ave extends Animal {
	private boolean domestico;
	/**
	 * @return the domestico
	 */
	public boolean isDomestico() {
		return domestico;
	}
	/**
	 * @param domestico the domestico to set
	 */
	
	private boolean volador;
	/**
	 * @return the volador
	 */
	public boolean isVolador() {
		return volador;
	}
	
	public void setDomestico(boolean domestico) {
		this.domestico = domestico;
	}
	
	public Ave(String lugarNacimiento, boolean domestico, boolean volador) {
		super(lugarNacimiento);
		this.domestico = domestico;
		this.volador = volador;
	}
	public void poneHuevo() {
		System.out.println("El ave está poniendo un huevo");
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Es un ave.\n").append(super.toString());
		return sb.toString();
	}
}