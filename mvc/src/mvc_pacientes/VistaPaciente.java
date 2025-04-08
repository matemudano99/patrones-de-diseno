package mvc_pacientes;

//Vista
class VistaPaciente {
	public void mostrarPaciente(Paciente paciente) {
		System.out.println("Paciente:");
		System.out.println("Nº Seguridad Social: " + paciente.getNumeroSeguridadSocial());
		System.out.println("Nombre: " + paciente.getNombre());
		System.out.println("Apellidos: " + paciente.getApellidos());
		System.out.println("Domicilio: " + paciente.getDomicilio());
		System.out.println("Código Postal: " + paciente.getCodigoPostal());
		System.out.println("Ciudad: " + paciente.getCiudad());
		System.out.println("Provincia: " + paciente.getProvincia());
		System.out.println("Edad: " + paciente.getEdad());
		System.out.println("Teléfono: " + paciente.getTelefono());
		System.out.println("Email: " + paciente.getEmail());
	}
}