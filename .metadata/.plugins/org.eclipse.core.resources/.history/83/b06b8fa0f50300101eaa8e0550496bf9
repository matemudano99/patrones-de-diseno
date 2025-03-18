package prototype12pokemon;

public class Main {
	public static void main(String[] args) {
		PokemonCapturado poke1Prototipo = new PokemonCapturado(1, "bulbasaur", "Kanto", 5);

		PokemonCapturado poke2 = poke1Prototipo.clonar();
		
		poke2.especificaciones();
		while(true) {			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			poke2.nivel++;
			System.out.println("\nHa subido de nivel!\n");
			poke2.especificaciones();
		}
		
	}
}
