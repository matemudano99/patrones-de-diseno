package abstract_factory_fp;

public class FabricaCentroFpInformatica implements FabricaCentroFp {

	@Override
	public ProfesorFP crearProfesor() {
		return new ProfesorFpInformatica();
	}

	@Override
	public AlumnoFP crearAlumno() {
		return new AlumnoFpInformatica();
	}

}
