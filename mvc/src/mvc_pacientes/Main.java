package mvc_pacientes;

public class Main {
	public static void main(String[] args) {
		Paciente paciente = new Paciente("12345678", "Juan", "Pérez", "Calle Falsa 123", "29001", "Málaga", "Málaga",
				30, "600123456", "juan.perez@email.com");
		VistaPaciente vista = new VistaPaciente();
		ControladorPaciente controlador = new ControladorPaciente(paciente, vista);

		controlador.actualizarVista();
	}
}
