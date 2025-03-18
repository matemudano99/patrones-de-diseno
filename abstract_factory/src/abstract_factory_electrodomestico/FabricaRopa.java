package abstract_factory_electrodomestico;

public class FabricaRopa extends Fabrica{

	@Override
	public Producto crearProducto() {
		return new Ropa();
	}

}
