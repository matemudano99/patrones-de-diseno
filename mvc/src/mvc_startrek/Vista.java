package mvc_startrek;

import java.util.Scanner;

public class Vista {
    private Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("1. Ver detalles del personaje");
        System.out.println("2. Agregar personaje Star Trek");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public void mostrarDetallesPersonaje(Personaje personaje) {
        System.out.println(personaje);
    }

    public Personaje ingresarPersonaje() {
        scanner.nextLine(); // Para limpiar el buffer del scanner
        System.out.print("Ingrese el nombre del personaje: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el puesto del personaje: ");
        String puesto = scanner.nextLine();
        return new Personaje(nombre, puesto);
    }

    public void salir() {
        System.out.println("¡Hasta pronto!");
    }
}
