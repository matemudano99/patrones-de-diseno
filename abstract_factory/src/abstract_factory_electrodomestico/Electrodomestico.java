package abstract_factory_electrodomestico;

public class Electrodomestico implements Producto {

	@Override
	public void venta() {
		System.out.println("Venta de electrodomestico");
	}
}
