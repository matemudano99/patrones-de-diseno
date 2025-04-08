package mvc_videojuegos;

public class VistaVideojuego {

	public void mostrarMenu() {
		System.out.println("Menú de opciones:");
		System.out.println("1. Ver detalles de los videojuegos");
		System.out.println("2. Agregar un videojuego");
		System.out.println("3. Eliminar un videojuego");
		System.out.println("4. Modificar un videojuego");
		System.out.println("5. Salir");
		System.out.print("Seleccione una opción: ");
	}

	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}

}
