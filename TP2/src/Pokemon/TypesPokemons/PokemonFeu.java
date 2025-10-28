package Pokemon.TypesPokemons;
import Pokemon.*;

public class PokemonFeu extends Pokemon1 {
	
	public PokemonFeu(String nom) {
		super(nom, TypePokemon.FEU);
	}
	
	@Override
	public void subir(Pokemon1 p) {
		if (p.getType() == TypePokemon.EAU) {
			int damage = (2*p.getAtk());
			this.hp -= damage;
			String msg ="C'est très efficace !\n";
			this.log(msg);
			
		}
		else if (p.getType() == TypePokemon.PLANTE || p.getType() == TypePokemon.FEU) {
			double damage = (0.5*p.getAtk());
			this.hp -= damage;
			String msg ="C'est peu efficace ...\n";
			this.log(msg);
		}
	}
	
	@Override
	public void attaquer(Pokemon1 p) {
		String msg ="J'attaque "+this.getNom()+" : "+this.getType()+" Vs "+p.getType();
		this.log(msg);
		p.subir(this);
	}

}
