package javadoc1;
/**
 * Clase principal que ejecuta el programa.
 */
public class Main {

    /**
     * Ejecuta el programa, crea un empleado e imprime su salario anual
     * 
     * @author Mateo
     * @version 1.0
     * @param args
     */
    public static void main(String[] args) {
        Empleado emp = new Empleado("Carlos", 2500);
        System.out.println("Salario anual: " + emp.calcularSalarioAnual());
    }
}
