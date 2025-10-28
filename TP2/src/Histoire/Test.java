package Histoire;
import Pokemon.Pokemon0;
import Pokemon.TypesPokemons.*;
public class Test {
	
	private static void testPokemon0() {
		// test Pokemon0
		Pokemon0 p1 = new Pokemon0("Rhinolove");
		Pokemon0 p2 = new Pokemon0("Chovsourir");
				
		p1.log(p1.toString());
		p2.log(p2.toString());
		p1.attaquer(p2);
		p2.log(p2.toString());
	}
	
	private static void testPokemonTypes() {
		PokemonEau eau = new PokemonEau("PokéEau");
		PokemonFeu feu = new PokemonFeu("PokéFeu");
		PokemonPlante plante = new PokemonPlante("PokéPlante");

				
		eau.log(eau.toString());
		feu.log(feu.toString());
		plante.log(plante.toString());
		
		eau.attaquer(feu);
		eau.attaquer(plante);
		feu.attaquer(eau);
		feu.attaquer(plante);
		plante.attaquer(eau);
		plante.attaquer(feu);
		
		
		eau.log(eau.toString());
		feu.log(feu.toString());
		plante.log(plante.toString());
		
	
	}
	
	public static void main(String[] agr) {
		
		System.out.println("\nTest Pokemon0\n");
		testPokemon0();
		
		System.out.println("\nTest Pokemon Types\n");
		testPokemonTypes();

	}

}
