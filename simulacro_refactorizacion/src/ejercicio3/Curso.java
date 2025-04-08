package ejercicio3;

public class Curso {
	private int curso;

	public Curso(int curso) {
		this.curso = curso;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Curso [curso=" + curso + "]";
	}
	
}
