package Humain;
import Pokemon.*;
import java.util.ArrayList;

public class SacADos {
	private ArrayList<Pokemon1> pokemons;
	private Pokeball ball;
	private Dresseur dresseur;
	
	public SacADos(Dresseur dresseur) {
		this.dresseur = dresseur;
		pokemons = new ArrayList<>(3);
	}
	
	public int getNbPokemons() {
		return this.pokemons.size();
	}
	
	public Pokemon1 getNextPokemon() {
		return this.pokemons.get(getNbPokemons()-1)
;	}
	
	public void capturerPokemons () {
		
	}
	
	public boolean peutCombattre() {
		for(Pokemon1 pkm : pokemons) {
			if (pkm.getHp()>0) {
				return true;
			}
		}
		return false;
	}
	
	public void combattre(Dresseur adversaire) {
		
	}
	
	public void pokeCenter() {
		for(Pokemon1 pkm: pokemons) {
			pkm.soigner();
		}
		
	}
}
