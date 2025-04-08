package mvc_startrek;

import java.util.ArrayList;
import java.util.List;

public class Controlador {
	private List<Personaje> personajes;
	private Vista vista;

	public Controlador(Vista vista) {
		this.personajes = new ArrayList<>();
		this.vista = vista;
	}

	public void iniciar() {
		int opcion;
		do {
			opcion = vista.mostrarMenu();
			switch (opcion) {
			case 1:
				if (personajes.isEmpty()) {
					System.out.println("No hay personajes disponibles.");
				} else {
					for (Personaje personaje : personajes) {
						vista.mostrarDetallesPersonaje(personaje);
					}
				}
				break;
			case 2:
				Personaje nuevoPersonaje = vista.ingresarPersonaje();
				personajes.add(nuevoPersonaje);
				System.out.println("Personaje agregado: " + nuevoPersonaje);
				break;
			case 3:
				vista.salir();
				break;
			default:
				System.out.println("Opción no válida.");
			}
		} while (opcion != 3);
	}
}
