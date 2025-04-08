package mvc;

public class Main {
	public static void main(String[] args) {
		Modelo modelo = new Modelo("Alberto", 39, "Calle Larios", "+34 12312412", "albertoruiz@gmail.com", "profesor");
		Vista vista = new Vista();
		Controlador controlador = new Controlador(modelo, vista);
		controlador.actualizarVista();
		/*
		 * modificar los datos del objeto creado, utilizando los metodos creados en el
		 * controlador, podriamos usar direcdtamente los metodos creados en
		 * 
		 * modelo,
		 * 
		 * pero no es seguro, n
		 */
		controlador.setNombreModelo("Eva");
		controlador.setEdadModelo(39);
		controlador.setDomicilioModelo("calle martin");
		controlador.actualizarVista();
	}
}