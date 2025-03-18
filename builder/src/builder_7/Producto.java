package builder_7;

public class Producto {
	private String nombre;
	private double precio;
	private String color;
	private String talla;
	private String fabricante;
	private String modelo;

	public Producto(String nombre, double precio, String color, String talla, String fabricante, String modelo) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.color = color;
		this.talla = talla;
		this.fabricante = fabricante;
		this.modelo = modelo;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public String getColor() {
		return color;
	}

	public String getTalla() {
		return talla;
	}

	public String getFabricante() {
		return fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", color=" + color + ", talla=" + talla
				+ ", fabricante=" + fabricante + ", modelo=" + modelo + "]";
	}
	
}
