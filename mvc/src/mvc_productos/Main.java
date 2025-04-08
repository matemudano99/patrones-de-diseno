package mvc_productos;

public class Main {
	public static void main(String[] args) {
		Modelo modelo = new Modelo(1, "Manzana", " manzana polaca", 2, "carrefour");
		Vista vista = new Vista();
		Controlador controlador = new Controlador(modelo, vista);
		
		controlador.actualizarVista();

		controlador.setCodigoModelo(2);
		controlador.setDescripcionModelo("banano amarillo");
		controlador.setFabricanteModelo("mercadona");
		controlador.setNombreModelo("Banana");
		controlador.setPrecioModelo(1);
		
		controlador.actualizarVista();
	}
}
