package refact5;

public class Main {
	 public static void main(String[] args) {
	        Producto producto = new Producto("Laptop", "Ordenador portátil", 1200.00, new Iva(21));
	        producto.mostrarDetalles();
	    }
}
