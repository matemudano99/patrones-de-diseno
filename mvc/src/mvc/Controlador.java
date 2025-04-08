package mvc;

public class Controlador {
	// variables de instancias tipo Modelo y Vista
	private Modelo modelo;
	private Vista vista;

	// constructor
	public Controlador(Modelo modelo, Vista vista) {
		this.modelo = modelo;
		this.vista = vista;
	}

	// actualiza los getter y setter del modelo
	public void setNombreModelo(String nombre) {

		modelo.setNombre(nombre);
	}

	public void setEdadModelo(int edad) {
		modelo.setEdad(edad);
	}

	public void setDomicilioModelo(String domicilio) {
		modelo.setDomicilio(domicilio);
		;
	}

	// getteando por si queremos mostrar alguno de los datos
	public String getNombreModelo() {
		return modelo.getNombre();
	}

	public int getEdadModelo() {
		return modelo.getEdad();
	}

	public String getDomicilioModelo() {
		return modelo.getDomicilio();
	}
	
	public String getTelefonoModelo() {
		return modelo.getTelefono();
	}
	public String getEmailModelo() {
		return modelo.getEmail();
	}
	public String getProfesionModelo() {
		return modelo.getProfesion();
	}
	

	// actualiza el metodo mostrarDatos de vista
	public void actualizarVista() {
		vista.mostrarDatos(modelo.getNombre(), modelo.getEdad(), modelo.getDomicilio(), modelo.getTelefono(), modelo.getTelefono(), modelo.getTelefono());
	}
}