package abstract_factory_electrodomestico;

public class Main {
	public static void main(String[] args) {
	Fabrica fabricaE= new FabricaElectrodomesticos();
	Producto electrodomestico = fabricaE.crearProducto();
	
	Fabrica fabricaR = new FabricaRopa();
	Producto ropa = fabricaR.crearProducto();
	
	Fabrica fabricaV = new FabricaVehiculo();
	Producto vehiculo = fabricaV.crearProducto();

	vehiculo.venta();	
	electrodomestico.venta();	
	ropa.venta();	
	}
}
