package abstract_factory_muebles;

public class FabricaMueblesVictorianos extends FabricaMuebles {

	@Override
	public Silla crearSilla() {
		return new SillaVictoriana();
	}

	@Override
	public Sofa crearSofa() {
		return new SofaVictoriano();
	}

}
