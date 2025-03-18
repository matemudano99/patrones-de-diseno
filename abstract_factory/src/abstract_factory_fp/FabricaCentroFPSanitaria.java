package abstract_factory_fp;

class FabricaCentroFpSanitaria implements FabricaCentroFp {
	public ProfesorFP crearProfesor() {
		return new ProfesorFPSanitaria();
	}

	public AlumnoFP crearAlumno() {
		return new AlumnoFPSanitaria();
	}
}