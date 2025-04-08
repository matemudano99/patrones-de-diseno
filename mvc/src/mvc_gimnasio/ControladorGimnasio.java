package mvc_gimnasio;

import java.util.ArrayList;

public class ControladorGimnasio {
	private ArrayList<Actividad> actividades = new ArrayList<>();
	private VistaGimnasio vista;

	public ControladorGimnasio(VistaGimnasio vista) {
		this.vista = vista;
	}

	public void registrarActividad() {
		Actividad actividad = vista.obtenerDatosActividad();
		actividades.add(actividad);
		vista.mostrarMensaje("Actividad registrada con éxito.");
	}

	public void mostrarRegistroActividades() {
		vista.mostrarRegistroActividades(actividades);
	}
}