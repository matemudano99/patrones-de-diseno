package ejercicio4;

public class IVA {
	private double iva;

	public IVA(double iva) {
		super();
		this.iva = iva;
	}

	public double getIva() {
		return iva;
	}

	@Override
	public String toString() {
		return "IVA [iva=" + iva + "]";
	}
	
}
