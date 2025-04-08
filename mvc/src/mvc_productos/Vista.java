package mvc_productos;

public class Vista {
	public void mostrarDetalle(int codigo, String nombre, String descripcion, int precio, String fabricante) {
		System.out.println("codigo: " + codigo + "  nombre: " + nombre + "  descripcion: " + descripcion + "  precio: " + precio
				+ "  fabricante: " + fabricante);
	}
}
