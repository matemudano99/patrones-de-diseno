package prototype12pokemon;

import java.util.HashMap;

public class PokemonCapturado implements Pokemon {
	private int pokeId;
	private String nombre;
	private String region;
	int nivel;
	HashMap<String, Integer> estadisticas;
	
	public PokemonCapturado(int pokeId, String nombre, String region, int nivel) {
		this.pokeId = pokeId;
		this.nombre = nombre;
		this.region = region;
		this.nivel = nivel;
		this.estadisticas = new HashMap<>();
		this.estadisticas.put("Vida", 100);
        this.estadisticas.put("Ataque", 1);
        this.estadisticas.put("Defensa", 1);
	}

	public PokemonCapturado(PokemonCapturado otro) {
		this.pokeId = otro.pokeId;
		this.nombre = otro.nombre;
		this.region = otro.region;
		this.nivel = otro.nivel;
		this.estadisticas = new HashMap<>();
		this.estadisticas.put("Vida", 100);
        this.estadisticas.put("Ataque", 0);
        this.estadisticas.put("Defensa", 0);
	}

	@Override
	public PokemonCapturado clonar() {
		return new PokemonCapturado(this);
	}

	@Override
	public void especificaciones() {
		System.out.println("ID: "+pokeId);
		System.out.println("nombre: "+nombre);
		System.out.println("region: "+region);
		System.out.println("nivel: "+nivel);
		System.out.println("Estadisticas: "+estadisticas);
	}

	@Override
	public String toString() {
		return "PokemonCapturado [pokeId=" + pokeId + ", nombre=" + nombre + ", region=" + region + ", nivel=" + nivel
				+ ", estadisticas=" + estadisticas + "]";
	}

}
