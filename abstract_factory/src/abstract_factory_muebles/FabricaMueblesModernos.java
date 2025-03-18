package abstract_factory_muebles;

public class FabricaMueblesModernos extends FabricaMuebles {

	@Override
	public Silla crearSilla() {
		return new SillaModerna();
	}

	@Override
	public Sofa crearSofa() {
		return new SofaModerno();
	}

}
