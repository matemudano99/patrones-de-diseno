package mvc_tareas;

import java.util.ArrayList;
import java.util.Scanner;

public class Vista {

    private Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("1. Agregar tarea");
        System.out.println("2. Ver lista de tareas");
        System.out.println("3. Modificar tarea");
        System.out.println("4. Eliminar tarea");
        System.out.println("5. Salir");
    }

    public String obtenerEntrada(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public void mostrarListaTareas(ArrayList<Tarea> tareas) {
        System.out.println("Lista de tareas:");
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas en la lista.");
        } else {
            for (int i = 0; i < tareas.size(); i++) {
                Tarea tarea = tareas.get(i);
                System.out.println((i + 1) + ". " + tarea.getNombre());
            }
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public int obtenerIndiceTarea(String mensaje) {
        System.out.print(mensaje);
        return Integer.parseInt(scanner.nextLine()) - 1;
    }
}