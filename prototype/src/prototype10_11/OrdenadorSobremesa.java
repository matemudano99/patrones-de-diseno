package prototype10_11;

public class OrdenadorSobremesa implements Ordenador {
	private String procesador;
	private int ram;
	int almacenamiento;
	private String placaBase;

	public OrdenadorSobremesa(String procesador, int ram, int almacenamiento, String placaBase) {
		super();
		this.procesador = procesador;
		this.ram = ram;
		this.almacenamiento = almacenamiento;
		this.placaBase = placaBase;
	}

	public OrdenadorSobremesa(OrdenadorSobremesa otroOrdenador) {
		this.procesador = otroOrdenador.procesador;
		this.ram = otroOrdenador.ram;
		this.almacenamiento = otroOrdenador.almacenamiento;
		this.placaBase = otroOrdenador.placaBase;
	}

	@Override
	public OrdenadorSobremesa clonar() {
		return new OrdenadorSobremesa(this);
	}

	@Override
	public void especificaciones() {
		System.out.println("Especificaciones del ordenador de sobremesa:");
		System.out.println("Procesador: " + procesador);
		System.out.println("RAM: " + ram + "GB");
		System.out.println("Almacenamiento: " + almacenamiento + "GB");
		System.out.println("Placa base: "+ placaBase);
	}

}
