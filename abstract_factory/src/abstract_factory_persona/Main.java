package abstract_factory_persona;

public class Main {
	public static void main(String[] args) {
		Fabrica fabricaA = new FabricaAlumno();
		Persona a1 = fabricaA.crearPersona();
		
		Fabrica fabricaP = new FabricaProfesor();
		Persona p1 = fabricaP.crearPersona();
		
		a1.accion();
		p1.accion();
	}
}
