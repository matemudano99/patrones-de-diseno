package ejercicio4;

public class PrecioSinIVA {
	private double precioSinIVA;

	public PrecioSinIVA(double precioSinIVA) {
		super();
		this.precioSinIVA = precioSinIVA;
	}

	public double getPrecioSinIVA() {
		return precioSinIVA;
	}

	@Override
	public String toString() {
		return "PrecioSinIVA [precioSinIVA=" + precioSinIVA + "]";
	}
	
}
