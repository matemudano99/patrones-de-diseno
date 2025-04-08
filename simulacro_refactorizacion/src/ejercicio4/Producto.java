package ejercicio4;

public class Producto {
    private Nombre nombre;
    private Descripcion descripcion;
    private PrecioSinIVA precioSinIVA;
    private IVA iva;
    private PrecioConIVA precioConIVA;

    public Producto(Nombre nombre, Descripcion descripcion, PrecioSinIVA precioSinIVA, IVA iva) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioSinIVA = precioSinIVA;
        this.iva = iva;
        this.precioConIVA = calcularPrecioConIVA();
    }

    public void mostrarDetalles() {
        System.out.println("Nombre del Producto: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Precio sin IVA: $" + precioSinIVA);
        System.out.println("IVA: " + iva + "%");
        System.out.println("Precio con IVA: $" + precioConIVA);
    }

    private PrecioConIVA calcularPrecioConIVA() {
        double precioConIVA = precioSinIVA.getPrecioSinIVA() * (1 + (iva.getIva() / 100));
        return new PrecioConIVA(precioConIVA);
    }

    public static void main(String[] args) {

        Producto producto = new Producto(new Nombre("Laptop"), new Descripcion("Ordenador portátil"), new PrecioSinIVA(1200.00), new IVA(21.0));
        producto.mostrarDetalles();
    }
}
