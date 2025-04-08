package mvc_productos;

public class Controlador {
	private Modelo modelo;
	private Vista vista;

	public Controlador(Modelo modelo, Vista vista) {
		super();
		this.modelo = modelo;
		this.vista = vista;
	}

	public int getCodigo() {
		return modelo.getCodigo();
	}

	public String getNombre() {
		return modelo.getNombre();
	}

	public String getDescripcion() {
		return modelo.getDescripcion();
	}

	public int getPrecio() {
		return modelo.getPrecio();
	}

	public String getFabricante() {
		return modelo.getFabricante();
	}

	public void setCodigoModelo(int codigo) {
		modelo.setCodigo(codigo);
	}

	public void setNombreModelo(String nombre) {
		modelo.setNombre(nombre);
	}

	public void setDescripcionModelo(String descripcion) {
		modelo.setDescripcion(descripcion);
	}

	public void setPrecioModelo(int precio) {
		modelo.setPrecio(precio);
	}

	public void setFabricanteModelo(String fabricante) {
		modelo.setFabricante(fabricante);
	}

	public void actualizarVista() {
		vista.mostrarDetalle(getCodigo(), getNombre(), getDescripcion(), getPrecio(), getFabricante());
	}
}
