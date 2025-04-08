package mvc_gimnasio;

import java.util.ArrayList;
import java.util.Scanner;

public class VistaGimnasio {
	private Scanner scanner;

	public VistaGimnasio() {
		scanner = new Scanner(System.in);
	}

	public void mostrarMenu() {
		System.out.println("1. Registrar actividad");
		System.out.println("2. Ver registro de actividades");
		System.out.println("3. Salir");
	}

	public String obtenerEntrada(String mensaje) {
		System.out.print(mensaje);
		return scanner.nextLine();
	}

	public Actividad obtenerDatosActividad() {
		String nombre = obtenerEntrada("Nombre de la actividad: ");
		String fecha = obtenerEntrada("Fecha (DD/MM/AAAA): "); // Ahora la fecha es un String
		int duracion = Integer.parseInt(obtenerEntrada("Duración en minutos: "));
		return new Actividad(nombre, fecha, duracion);
	}

	public void mostrarRegistroActividades(ArrayList<Actividad> actividades) {
		if (actividades.isEmpty()) {
			System.out.println("No hay actividades registradas.");
		} else {
			System.out.println("Registro de actividades:");
			for (Actividad actividad : actividades) {
				System.out.println(actividad);
			}
		}
	}

	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
}