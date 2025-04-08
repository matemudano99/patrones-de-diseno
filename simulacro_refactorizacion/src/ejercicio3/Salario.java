package ejercicio3;

public class Salario {
	private double salario;

	public Salario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Salario [salario=" + salario + "]";
	}
	
}
