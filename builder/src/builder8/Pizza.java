package builder8;

public class Pizza {
	private String ingrediente;
	private String ingrediente2;
	private String tamaño;
	public Pizza(String ingrediente, String ingrediente2, String tamaño) {
		super();
		this.ingrediente = ingrediente;
		this.ingrediente2 = ingrediente2;
		this.tamaño = tamaño;
	}
	public String getIngrediente() {
		return ingrediente;
	}
	public String getIngrediente2() {
		return ingrediente2;
	}
	public String getTamaño() {
		return tamaño;
	}
	@Override
	public String toString() {
		return "Pizza [ingrediente=" + ingrediente + ", ingrediente2=" + ingrediente2 + ", tamaño=" + tamaño + "]";
	}
	
}
