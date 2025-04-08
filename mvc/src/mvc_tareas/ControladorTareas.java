package mvc_tareas;

import java.util.ArrayList;

public class ControladorTareas {
	private ArrayList<Tarea> tareas = new ArrayList<>();
	private Vista vista;

	public ControladorTareas(Vista vista) {
		this.vista = vista;
	}

	public void agregarTarea() {
		String nombreTarea = vista.obtenerEntrada("Ingrese el nombre de la tarea: ");
		Tarea tarea = new Tarea(nombreTarea);
		tareas.add(tarea);
		vista.mostrarMensaje("Tarea agregada con éxito.");
	}

	public void mostrarListaTareas() {
		vista.mostrarListaTareas(tareas);
	}

	public void modificarTarea() {
		if (tareas.isEmpty()) {
			vista.mostrarMensaje("No hay tareas para modificar.");
			return;
		}

		int indice = vista.obtenerIndiceTarea("Ingrese el número de la tarea a modificar: ");
		if (indice >= 0 && indice < tareas.size()) {
			String nuevoNombre = vista.obtenerEntrada("Ingrese el nuevo nombre de la tarea: ");
			tareas.get(indice).setNombre(nuevoNombre);
			vista.mostrarMensaje("Tarea modificada con éxito.");
		} else {
			vista.mostrarMensaje("Índice de tarea inválido.");
		}
	}

	public void eliminarTarea() {
		if (tareas.isEmpty()) {
			vista.mostrarMensaje("No hay tareas para eliminar.");
			return;
		}

		int indice = vista.obtenerIndiceTarea("Ingrese el número de la tarea a eliminar: ");
		if (indice >= 0 && indice < tareas.size()) {
			tareas.remove(indice);
			vista.mostrarMensaje("Tarea eliminada con éxito.");
		} else {
			vista.mostrarMensaje("Índice de tarea inválido.");
		}
	}
}