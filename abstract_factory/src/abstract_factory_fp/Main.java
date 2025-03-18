package abstract_factory_fp;

public class Main {
	public static void main(String[] args) {
		FabricaCentroFp fabricaSanitaria = new FabricaCentroFpSanitaria();
		ProfesorFP profesorSanitaria = fabricaSanitaria.crearProfesor();
		AlumnoFP alumnoSanitaria = fabricaSanitaria.crearAlumno();
		profesorSanitaria.describir();
		alumnoSanitaria.describir();

		FabricaCentroFp fabricaInformatica = new FabricaCentroFpInformatica();
		ProfesorFP profesorInformatica = fabricaInformatica.crearProfesor();
		AlumnoFP alumnoInformatica = fabricaInformatica.crearAlumno();
		profesorInformatica.describir();
		alumnoInformatica.describir();
	}
}
