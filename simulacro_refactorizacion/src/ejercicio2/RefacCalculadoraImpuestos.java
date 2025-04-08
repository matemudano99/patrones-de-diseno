package ejercicio2;

public class RefacCalculadoraImpuestos {
	public double calcularImpuesto(double precioBase, double impuestoPorcentaje) {
		// Calcular impuesto
		double impuesto = precioBase * (impuestoPorcentaje / 100);
		return impuesto;
	}

	public double calcularTotalConImpuesto(double precioBase, double impuesto) {
		// Calcular total con impuesto
		double totalConImpuestos = precioBase + impuesto;
		return totalConImpuestos;
	}

	public double redondearTotal(double totalConImpuestos) {
		// Redondear total con impuesto
		return totalConImpuestos = Math.round(totalConImpuestos * 100.0) / 100.0;
	}

	public void imprimirTotal(double totalConImpuestos) {
		// Imprimir el total con impuestos
		System.out.println("El total con impuestos es: $" + totalConImpuestos);

	}
}
