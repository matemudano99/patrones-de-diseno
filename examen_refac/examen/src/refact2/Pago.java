package refact2;

public class Pago {
	public boolean realizarPago(double total) {		// Simulacion de pago
		if (total > 100) {
			System.out.println("Pago exitoso.");
			return true;
		}
		return false;
	}
}
