package abstract_factory_electrodomestico;

public class FabricaVehiculo extends Fabrica {

	@Override
	public Producto crearProducto() {
		return new Vehiculo();
	}

}
