package refact3;

public class Main {	
	public static void main(String[] args) {
		calcularTodo(100,21);
	}

	//Metodo contenedor de los otros 4
    public static void calcularTodo(double precioBase, double impuestoPorcentaje) {
    	
    	double impuesto = calcularImpuesto(precioBase, impuestoPorcentaje);
    	double totalConImpuestos = calcularTotalConImpuesto(precioBase, impuesto);
    	totalConImpuestos = redondearTotalConImpuestos(totalConImpuestos);
    	imprimirTotalConImpuestos(totalConImpuestos);
    }
    
    public static double calcularImpuesto(double precioBase, double impuestoPorcentaje) {
    	// Calcular impuesto
        double impuesto = precioBase * (impuestoPorcentaje / 100);

		return impuesto;
    }
    public static double calcularTotalConImpuesto(double precioBase,double impuesto) {
    	// Calcular total con impuesto
        double totalConImpuestos = precioBase + impuesto;

        return totalConImpuestos;
    }
    public static double redondearTotalConImpuestos(double totalConImpuestos) {
    	// Redondear total con impuesto a dos decimales
        totalConImpuestos = Math.round(totalConImpuestos * 100.0) / 100.0;

    	return totalConImpuestos;
    }
    public static void imprimirTotalConImpuestos(double totalConImpuestos) {
    	// Imprimir el total con impuestos
        System.out.println("El total con impuestos es: $" + totalConImpuestos);
    }
}

