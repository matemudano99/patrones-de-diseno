package mvc_tareas;

public class Tarea {
	private String nombre;

	public Tarea(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}