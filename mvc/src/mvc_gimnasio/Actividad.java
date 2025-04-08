package mvc_gimnasio;

public class Actividad {
	private String nombre;
	private String fecha; // Ahora la fecha es un String
	private int duracionMinutos;

	public Actividad(String nombre, String fecha, int duracionMinutos) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.duracionMinutos = duracionMinutos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getDuracionMinutos() {
		return duracionMinutos;
	}

	public void setDuracionMinutos(int duracionMinutos) {
		this.duracionMinutos = duracionMinutos;
	}

	@Override
	public String toString() {
		return "Actividad: " + nombre + ", Fecha: " + fecha + ", Duración: " + duracionMinutos + " minutos";
	}
}