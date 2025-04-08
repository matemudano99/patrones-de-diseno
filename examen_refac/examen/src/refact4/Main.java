package refact4;

public class Main {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("María", 1, new Asignatura("Matematica"), new Salario(1700.0));
        profesor.mostrarDetalles();
    }
}
