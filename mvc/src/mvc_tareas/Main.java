package mvc_tareas;

public class Main {
	public static void main(String[] args) {
		Vista vista = new Vista();
		ControladorTareas controlador = new ControladorTareas(vista);

		while (true) {
			vista.mostrarMenu();
			String opcion = vista.obtenerEntrada("Seleccione una opción: ");

			switch (opcion) {
			case "1":
				controlador.agregarTarea();
				break;
			case "2":
				controlador.mostrarListaTareas();
				break;
			case "3":
				controlador.modificarTarea();
				break;
			case "4":
				controlador.eliminarTarea();
				break;
			case "5":
				System.out.println("Saliendo del programa...");
				System.exit(0);
				break;
			default:
				System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
				break;
			}
		}
	}
}