package singleton14perros;

public class PerroSingleton {
	private static PerroSingleton instance;
	private String raza;
	private int edad;
	private int contador=1;
	
	private PerroSingleton() {}
	
	public static PerroSingleton getInstance() {
		if(instance==null) {
			instance = new PerroSingleton();
		}
		return instance;
	}
	
	public void mostrarMensaje() {
		System.out.println("Hola soy el facking perro "+contador);
		contador++;
	}
	
	public static void main(String[] args) {
		PerroSingleton perro1 = PerroSingleton.getInstance();
		PerroSingleton perro2 = PerroSingleton.getInstance();
		
		perro1.mostrarMensaje();
		perro2.mostrarMensaje();
		
		if(perro1==perro2) {
			System.out.println("Misma instancia");
		} else {
			System.out.println("Distinta instancia");
		}
	}
}

