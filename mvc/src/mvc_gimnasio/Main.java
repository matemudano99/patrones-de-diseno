package mvc_gimnasio;

public class Main {
	public static void main(String[] args) {
		VistaGimnasio vista = new VistaGimnasio();
		ControladorGimnasio controlador = new ControladorGimnasio(vista);

		while (true) {
			vista.mostrarMenu();
			String opcion = vista.obtenerEntrada("Seleccione una opción: ");

			switch (opcion) {
			case "1":
				controlador.registrarActividad();
				break;
			case "2":
				controlador.mostrarRegistroActividades();
				break;
			case "3":
				System.out.println("Saliendo del programa...");
				System.exit(0);
				break;
			default:
				System.out.println("Opción inválida.");
			}
		}
	}
}