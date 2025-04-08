package mvc_videojuegos;

import java.util.Scanner;

public class Main {
	// Clase principal (Main) para ejecutar el programa
	public static void main(String[] args) {
		VistaVideojuego vista = new VistaVideojuego();
		ControladorVideojuego controlador = new ControladorVideojuego(vista);

		Scanner scanner = new Scanner(System.in);
		int opcion;

		do {
			vista.mostrarMenu();
			opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				controlador.mostrarDetallesVideojuego();
				break;
			case 2:
				scanner.nextLine(); // Limpiar el buffer de entrada
				System.out.print("Ingrese el nombre del videojuego: ");
				String nombre = scanner.nextLine();
				System.out.print("Ingrese el género del videojuego: ");
				String genero = scanner.nextLine();
				controlador.agregarVideojuego(nombre, genero);
				break;
			case 3:
				scanner.nextLine(); // Limpiar el buffer de entrada
				System.out.print("Ingrese el nombre del videojuego a eliminar: ");
				String nombreEliminar = scanner.nextLine();
				break;
			case 4:
				scanner.nextLine(); // Limpiar el buffer de entrada
				System.out.print("Ingrese el nombre del videojuego a modificar: ");
				String nombreModificar = scanner.nextLine();
				System.out.print("Ingrese el nuevo género del videojuego: ");
				String generoModificar = scanner.nextLine();
				break;
			case 5:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
				break;
			}
		} while (opcion != 5);
		scanner.close();
	}
}
