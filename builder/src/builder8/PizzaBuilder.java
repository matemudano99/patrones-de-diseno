package builder8;


public class PizzaBuilder {
	private String ingrediente;
	private String ingrediente2;
	private String tamaño;
	public PizzaBuilder ingrediente(String ingrediente) {
		this.ingrediente = ingrediente;
		return this;
	}
	public PizzaBuilder ingrediente2(String ingrediente2) {
		this.ingrediente2 = ingrediente2;
		return this;
	}
	public PizzaBuilder tamaño(String tamaño) {
		this.tamaño = tamaño;
		return this;
	}
	public Pizza build() {
		return new Pizza(ingrediente, ingrediente2, tamaño);
	}
	@Override
	public String toString() {
		return "PizzaBuilder [ingrediente=" + ingrediente + ", ingrediente2=" + ingrediente2 + ", tamaño=" + tamaño
				+ "]";
	}
	
}
