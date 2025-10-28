package Humain;
import Pokemon.*;

public class Dresseur {
	private String nom;
	private int argent;
	private SacADos sacADos;
	private Equipe equipe;
	
	public Dresseur(String nom) {
		this.nom = nom;
		this.sacADos = new SacADos(this);
		this.argent = 150;
	}
	
	private void choixEquipe() {
		
	}
	
	public String getNom() {
		return this.nom;
	}
	public int getNbPokemons() {
		return this.sacADos.getNbPokemons();
	}
	public Pokemon1 getNextPokemon() {
		return this.sacADos.getNextPokemon();
	}
	
	public void prendreArgent(Dresseur p) {
		if(p.argent<9) {
			String msg ="Je n'ai plus d'argent";
			p.log(msg);
		}
		p.argent-=10;
		this.argent+=10;
	}
	
	public void capturerPokemons() {
		this.sacADos.capturerPokemons();
	}
	
	public boolean peutCombattre() {
		if(this.argent>0) {
			return this.sacADos.peutCombattre();
		}
		else {
			return false;
		}
	}
	
	public void combatre(Dresseur d) {
		if (this.peutCombattre()) {
			this.sacADos.combattre(d);
		}
	}
	
	public void pokeCenter() {
		this.sacADos.pokeCenter();
	}
	
	@Override
	public String toString() {
		String msg ="Je m'appelle "+this.nom+", \nj'ai "+this.getNbPokemons() +" Pokemons ! \nj'appartiens à l'équipe " + 
				this.equipe + ", \nje possède "+this.argent +" $ \n";
		return msg;
	}
	
	private String prefixe() {
		String message= "[Dresseur "+this.nom+"] :" ;
		return message;
	}
	
	public void log(String msg) {
		String message = this.prefixe();
		System.out.println(message+msg);
	}
}
