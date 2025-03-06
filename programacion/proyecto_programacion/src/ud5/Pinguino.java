package ud5;

public class Pinguino extends Ave {

	public Pinguino (String lugarNacimiento) {
		super(lugarNacimiento, Boolean.FALSE, Boolean.TRUE);
	}
	public void pesca() {
		System.out.println("El pingüino está pescando");
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		String domestico = this.isDomestico() ? "doméstico" : "salvaje";
		String volador = this.isVolador() ? "volador" : "no volador";		
		sb.append("El animal es un pingüino. Que es un animal ").append(domestico).append(volador).append("\n").append(super.toString());
		return sb.toString();
	}

}