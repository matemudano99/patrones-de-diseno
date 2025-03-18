package abstract_factory_electrodomestico;

public class FabricaElectrodomesticos extends Fabrica {

	@Override
	public Producto crearProducto() {
		return new Electrodomestico();
	}

}
