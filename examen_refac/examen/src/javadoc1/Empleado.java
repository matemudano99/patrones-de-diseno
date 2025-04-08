package javadoc1;

/**
 * Clase que representa un empleado en una empresa.
 */
public class Empleado {
    private String nombre;
    private double salario;

    /**
     * constructor unico de la clase
     * 
     * @param nombre
     * @param salario
     */
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    /**
     * Getter de nombre
     * 
     * @author Mateo
     * @version 1.0
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter de nombre
     * 
     * @author Mateo
     * @version 1.0
     * @param nombre - Nuevo nombre del empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter de salario
     * 
     * @author Mateo
     * @version 1.0
     * @return salario
     */
    public double getSalario() {
        return salario;
    }


    /**
     * Establece un nuevo salario para el empleado.
     * No permite valores negativos.
     * 
     * @author Mateo
     * @version 1.0
     * @param salario Nuevo salario del empleado.
     * @throws IllegalArgumentException si el salario es negativo.
     */
    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo.");
        }
        this.salario = salario;
    }


    /**
     * Calcula el salario anual del empleado.
     * 
     * @author Mateo
     * @version 1.0
     * @return Salario anual multiplicado por 12.
     */
    public double calcularSalarioAnual() {
        return salario * 12;
    }

}
