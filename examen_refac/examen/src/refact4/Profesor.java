package refact4;

public class Profesor {
    private String nombre;
    private int curso;
    private Asignatura asignatura;
    private Salario salario;


    public Profesor(String nombre, int curso, Asignatura asignatura, Salario salario) {
        this.nombre = nombre;
        this.curso = curso;
        this.asignatura = asignatura;
        this.salario = salario;
    }


    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Curso: " + curso);
        System.out.println("Asignatura: " + asignatura.getAsignatura());
        System.out.println("Salario: " + salario.getSalario());
    }

}

