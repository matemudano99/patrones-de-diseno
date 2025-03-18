package abstract_factory_muebles;

public class Main {
	public static void main(String[] args) {
		FabricaMuebles fabricaModerna = new FabricaMueblesModernos();
		FabricaMuebles fabricaVictoriana = new FabricaMueblesVictorianos();
		
		Silla sillaModerna =fabricaModerna.crearSilla();
		Sofa sofaModerno = fabricaModerna.crearSofa();
		
		Silla sillaVictoriana = fabricaVictoriana.crearSilla();
		Sofa sofaVictoriano = fabricaVictoriana.crearSofa();
		
		sillaModerna.describir();
		sofaModerno.describir();
		sillaVictoriana.describir();
		sofaVictoriano.describir();
	}
}
