package refact5;

public class Producto {
    private String nombre;
    private String descripcion;
    private double precioSinIVA;
    private Iva iva;
    private double precioConIVA;


    public Producto(String nombre, String descripcion, double precioSinIVA, Iva iva) {
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
        System.out.println("IVA: " + iva.getIva() + "%");
        System.out.println("Precio con IVA: $" + precioConIVA);
    }


    private double calcularPrecioConIVA() {
        return precioSinIVA * (1 + (iva.getIva() / 100));
    }

}
