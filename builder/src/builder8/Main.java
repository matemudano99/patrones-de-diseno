package builder8;

public class Main {
	public static void main(String[] args) {
		PizzaBuilder pizza = new PizzaBuilder().ingrediente("Queso").ingrediente2("Tomate").tamaño("grande");
		System.out.println(pizza);
	}
}
