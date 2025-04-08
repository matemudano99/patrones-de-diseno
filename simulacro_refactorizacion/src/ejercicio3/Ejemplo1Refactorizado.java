package ejercicio3;

public class Ejemplo1Refactorizado {
	private Nombre nombre;
    private Curso curso;
    private Asignatura asignatura;
    private Salario salario;

    public Ejemplo1Refactorizado(Nombre nombre, Curso curso, Asignatura asignatura,Salario salario) {
        this.nombre = nombre;
        this.curso = curso;
        this.asignatura = asignatura;
        this.salario=salario;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("curso: " + curso);
        System.out.println("Asignatura: " + asignatura);
        System.out.println("Salario: " + salario);
    }

    public static void main(String[] args) {
        Ejemplo1Refactorizado profesor = new Ejemplo1Refactorizado(new Nombre("María"), new Curso(1), new Asignatura("Matemáticas"),new Salario(1700));
        profesor.mostrarDetalles();
    }
}
