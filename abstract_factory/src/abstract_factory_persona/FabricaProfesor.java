package abstract_factory_persona;

public class FabricaProfesor extends Fabrica {

	@Override
	public Persona crearPersona() {
		return new Profesor();
	}
	
}
