package mvc_startrek;

public class Personaje {
	private String nombre;
	private String puesto;

	public Personaje(String nombre, String puesto) {
		this.nombre = nombre;
		this.puesto = puesto;
	}

	public String getNombre() {
		return nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Puesto: " + puesto;
	}
}
