package abstract_factory_persona;

public class FabricaAlumno extends Fabrica {

	@Override
	public Persona crearPersona() {
		return new Alumno();
	}
	
}
