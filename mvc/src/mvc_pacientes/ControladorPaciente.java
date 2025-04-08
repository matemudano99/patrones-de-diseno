package mvc_pacientes;

//Controlador
class ControladorPaciente {
	private Paciente paciente;
	private VistaPaciente vista;

	public ControladorPaciente(Paciente paciente, VistaPaciente vista) {
		this.paciente = paciente;
		this.vista = vista;
	}

	public void actualizarVista() {
		vista.mostrarPaciente(paciente);
	}

	// Getters y setters para el controlador
	public void setNombre(String nombre) {
		paciente.setNombre(nombre);
	}

	public void setApellidos(String apellidos) {
		paciente.setApellidos(apellidos);
	}

	public void setDomicilio(String domicilio) {
		paciente.setDomicilio(domicilio);
	}

	public void setCodigoPostal(String codigoPostal) {
		paciente.setCodigoPostal(codigoPostal);
	}

	public void setCiudad(String ciudad) {
		paciente.setCiudad(ciudad);
	}

	public void setProvincia(String provincia) {
		paciente.setProvincia(provincia);
	}

	public void setEdad(int edad) {
		paciente.setEdad(edad);
	}

	public void setTelefono(String telefono) {
		paciente.setTelefono(telefono);
	}

	public void setEmail(String email) {
		paciente.setEmail(email);
	}

	public String getNombre() {
		return paciente.getNombre();
	}

	public String getApellidos() {
		return paciente.getApellidos();
	}

	public String getDomicilio() {
		return paciente.getDomicilio();
	}

	public String getCodigoPostal() {
		return paciente.getCodigoPostal();
	}

	public String getCiudad() {
		return paciente.getCiudad();
	}

	public String getProvincia() {
		return paciente.getProvincia();
	}

	public int getEdad() {
		return paciente.getEdad();
	}

	public String getTelefono() {
		return paciente.getTelefono();
	}

	public String getEmail() {
		return paciente.getEmail();
	}
}