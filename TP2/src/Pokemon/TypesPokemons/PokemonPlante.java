package Pokemon.TypesPokemons;
import Pokemon.Pokemon1;
import Pokemon.TypePokemon;
public class PokemonPlante extends Pokemon1 {
	
	public PokemonPlante(String nom) {
		super(nom, TypePokemon.PLANTE);
	}
	
	@Override
	public void subir(Pokemon1 p) {
		if (p.getType() == TypePokemon.FEU) {
			int damage = (2*p.getAtk());
			this.hp -= damage;
			String msg ="C'est très efficace !\n";
			this.log(msg);
			
		}
		else if (p.getType() == TypePokemon.PLANTE || p.getType() == TypePokemon.EAU) {
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
