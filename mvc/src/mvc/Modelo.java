package mvc;

public class Modelo {
	private String nombre;
	private int edad;
	private String domicilio;
	private String telefono;
	private String email;
	private String profesion; 

	
	public Modelo(String nombre, int edad, String domicilio, String telefono, String email, String profesion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.email = email;
		this.profesion = profesion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
