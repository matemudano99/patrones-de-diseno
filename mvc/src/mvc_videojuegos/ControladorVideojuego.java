package mvc_videojuegos;

// Controlador: Gestiona las acciones del usuario y actualiza el modelo
class ControladorVideojuego {
	private VistaVideojuego vista;
	private Videojuego videojuego;

	public ControladorVideojuego(VistaVideojuego vista) {
		this.vista = vista;
	}

	public void agregarVideojuego(String nombre, String genero) {
		videojuego = new Videojuego(nombre, genero);
		vista.mostrarMensaje("¡Videojuego agregado correctamente!");
	}

	public void mostrarDetallesVideojuego() {
		if (videojuego != null) {
			vista.mostrarMensaje("Nombre: " + videojuego.getNombre());
			vista.mostrarMensaje("Género: " + videojuego.getGenero());
		} else {
			vista.mostrarMensaje("¡No hay ningún videojuego para mostrar!");
		}
	}

	public void modificarVideojuego(String nuevoNombre, String nuevoGenero) {
		if (videojuego != null) {
			videojuego.setNombre(nuevoNombre);
			videojuego.setGenero(nuevoGenero);
			vista.mostrarMensaje("¡Videojuego modificado correctamente!");
		} else {
			vista.mostrarMensaje("¡No hay ningún videojuego para modificar!");
		}
	}

	public void eliminarVideojuego() {
		if (videojuego != null) {
			videojuego = null;
			vista.mostrarMensaje("¡Videojuego eliminado correctamente!");
		} else {
			vista.mostrarMensaje("¡No hay ningún videojuego para eliminar!");
		}
	}
}
