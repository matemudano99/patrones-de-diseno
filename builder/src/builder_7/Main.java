package builder_7;

public class Main {
	public static void main(String[] args) {
		// Usando el Builder para construir un Producto
		Producto producto = new ProductoBuilder().nombre("Camiseta").precio(20.0).color("Negro").talla("L")
				.fabricante("Adidas").modelo("Basics").build();

		producto = new ProductoBuilder().nombre(producto.getNombre()).precio(10.0).color(producto.getColor())
				.talla(producto.getTalla()).fabricante(producto.getFabricante()).modelo(producto.getModelo()).build();

		// Imprimir detalles del producto
		System.out.println(producto);
	}
}
